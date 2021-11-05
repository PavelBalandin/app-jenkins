package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class TestController {
    @GetMapping
    public ResponseEntity<String> getTestMessage() {
        return new ResponseEntity<>("New", HttpStatus.OK);
    }
}
