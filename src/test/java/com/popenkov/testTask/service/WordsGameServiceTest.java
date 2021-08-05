package com.popenkov.testTask.service;

import com.popenkov.testTask.dto.Words;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class WordsGameServiceTest {

    private final WordsGameService wordsGameService = new WordsGameServiceImpl();

    @Test
    void checkGameResultTestOne() {
        List<String> mock = new ArrayList<>();
        mock.add("fish");
        mock.add("horse");
        mock.add("egg");
        mock.add("goose");
        mock.add("eagle");

        List<String> resultList = new ArrayList<>();
        resultList.add("fish");
        resultList.add("horse");
        resultList.add("egg");
        resultList.add("goose");
        resultList.add("eagle");

        Words testExample = Words.builder().words(mock).build();
        Words result = Words.builder().words(resultList).build();


        assertEquals(result, wordsGameService.checkGameResult(testExample));
    }

    @Test
    void checkGameResultTestTwo() {

        List<String> mock = new ArrayList<>();
        mock.add("fish");
        mock.add("horse");
        mock.add("snake");
        mock.add("goose");
        mock.add("eagle");

        List<String> resultList = new ArrayList<>();
        resultList.add("fish");
        resultList.add("horse");


        Words testExample = Words.builder().words(mock).build();
        Words result = Words.builder().words(resultList).build();

        assertEquals(result, wordsGameService.checkGameResult(testExample));
    }

    @Test
    void checkGameResultTestThree() {
        List<String> mock = new ArrayList<>();
        mock.add("fish");
        mock.add("horse");
        mock.add("");
        mock.add("goose");
        mock.add("eagle");

        List<String> resultList = new ArrayList<>();
        resultList.add("fish");
        resultList.add("horse");

        Words testExample = Words.builder().words(mock).build();
        Words result = Words.builder().words(resultList).build();

        assertEquals(result, wordsGameService.checkGameResult(testExample));
    }

    @Test
    void checkGameResultTestFour() {
        List<String> mock = new ArrayList<>();
        mock.add("");
        mock.add("horse");
        mock.add("");
        mock.add("goose");
        mock.add("eagle");

        List<String> resultList = new ArrayList<>();

        Words testExample = Words.builder().words(mock).build();
        Words result = Words.builder().words(resultList).build();

        assertEquals(result, wordsGameService.checkGameResult(testExample));
    }


}