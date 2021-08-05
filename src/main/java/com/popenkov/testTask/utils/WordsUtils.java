package com.popenkov.testTask.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WordsUtils {
    public char getFirstChar(String word) {
        return word.charAt(0);
    }

    public char getLastChar(String word) {
        return word.charAt(word.length() - 1);
    }
}
