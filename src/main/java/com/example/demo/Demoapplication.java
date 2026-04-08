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
        return "AWS CodePipeline is a fully managed continuous delivery (CD) service that automates the steps required to release software. It allows developers to model, visualize, and automate every phase of the release process, from code changes to deployment. ";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running ✅";
    }
}
