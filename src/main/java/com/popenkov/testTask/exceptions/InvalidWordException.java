package com.popenkov.testTask.exceptions;

public class InvalidWordException extends RuntimeException {
    public InvalidWordException(String message) {
        super(message);
    }
}
