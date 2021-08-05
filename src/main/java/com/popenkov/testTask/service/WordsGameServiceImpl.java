package com.popenkov.testTask.service;

import com.popenkov.testTask.dto.Words;
import com.popenkov.testTask.exceptions.InvalidWordException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


import static com.popenkov.testTask.utils.WordsUtils.*;

@Service
@Slf4j
public class WordsGameServiceImpl implements WordsGameService {
    @Override
    public Words checkGameResult(Words wordsEntity) {
        List<String> words = wordsEntity.getWords();
        log.debug("words array: {}", words);
        if (CollectionUtils.isEmpty(words)) {
            throw new InvalidWordException("The json is invalid!");
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.size() - 1; i++) {

            if (i == 0 && StringUtils.isEmpty(words.get(i))) {
                return Words.builder().words(result).build();
            }

            if (i == 0) {
                result.add(words.get(i));
            }

            if (StringUtils.isNotEmpty(words.get(i + 1)) && getLastChar(words.get(i)) == getFirstChar(words.get(i + 1))) {
                result.add(words.get(i + 1));
            } else {
                return Words.builder().words(result).build();
            }
        }

        log.debug("Result array: {}", result);
        return Words.builder().words(result).build();
    }
}
