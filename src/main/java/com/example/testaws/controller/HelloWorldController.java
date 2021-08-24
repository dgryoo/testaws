package com.example.testaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/home")
    public String helloWorld() {
        return "Hello World";
    }
}
