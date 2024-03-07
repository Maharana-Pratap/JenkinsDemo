package com.example.JenkinsNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
this is ca change for reversing code test
 */
@SpringBootApplication
@RestController
@RequestMapping("/jenkins")
public class JenkinsNewApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsNewApplication.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "I am from Jenkins Test Demo";
    }
}
