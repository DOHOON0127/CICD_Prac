package com.example.cicd_prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
    
}
