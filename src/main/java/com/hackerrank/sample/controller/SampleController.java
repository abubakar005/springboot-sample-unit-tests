package com.hackerrank.sample.controller;

import com.hackerrank.sample.dto.StringResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SampleController {


    @GetMapping("/defaultHello")
    public StringResponse getHelloWord(@RequestParam(value = "message", required = false) String message) {
        return new StringResponse("Default Hello World!");
    }

    @PostMapping("/customHello")
    public StringResponse customHello(@RequestParam("message") String message) {
        return new StringResponse("Custom "+message);
    }

}
