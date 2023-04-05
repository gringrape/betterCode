package com.gringrape.betterCode.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

class AnswerDto {
    private final boolean isCorrect;

    public AnswerDto(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

}

class SolutionDto {

    private final String code;

    public SolutionDto(String code) {
        this.code = code;
    }

}

@RestController
@RequestMapping("solutions")
public class SolutionController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    String indicate(@RequestBody SolutionDto solution) {
        return "hello";
    }

}
