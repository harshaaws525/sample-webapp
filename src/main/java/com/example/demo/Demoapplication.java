package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Demoapplication {

    public static void main(String[] args) {
        SpringApplication.run(Demoapplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "AWS PIPELINE is Working";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running ✅";
    }
}
