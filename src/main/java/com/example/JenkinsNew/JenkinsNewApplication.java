package com.example.JenkinsNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/jenkins")
public class JenkinsNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsNewApplication.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "I am from Jenkins Test Demo";
    }

}
