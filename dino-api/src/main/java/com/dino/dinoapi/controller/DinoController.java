package com.dino.dinoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinoController {
    @GetMapping("/")
    public String rootString() {
        return "HTTP GET Method rootString";
    }

    @GetMapping("/test")
    public String testString() {
        return "HTTP GET Method testString";
    }
}
