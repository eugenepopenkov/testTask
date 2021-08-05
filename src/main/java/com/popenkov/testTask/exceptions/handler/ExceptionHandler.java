package com.popenkov.testTask.exceptions.handler;

import com.popenkov.testTask.exceptions.InvalidWordException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<String> handleInvalidWordException(InvalidWordException exception){
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}
