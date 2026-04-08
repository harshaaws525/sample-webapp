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
        return "A comprehensive DevOps roadmap for 2026 focuses on building a foundation in Linux, networking, and security, followed by mastering Git, containerization (Docker), Infrastructure as Code (Terraform), and CI/CD pipelines. The path moves from foundational skills to cloud platforms (AWS/Azure) ";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running ✅";
    }
}
