package com.popenkov.testTask.controllers;

import com.popenkov.testTask.dto.Words;
import com.popenkov.testTask.service.WordsGameService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class ResultCheckController {
    private final WordsGameService resultCheckService;

    @PostMapping(value = "/results", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Words getGameResults(@RequestBody Words words){
        return resultCheckService.checkGameResult(words);
    }
}
