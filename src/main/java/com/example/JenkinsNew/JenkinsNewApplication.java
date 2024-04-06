package com.example.JenkinsNew;

import com.example.JenkinsNew.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsNewApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsNewApplication.class, args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsNewApplication.class);
    }

    @GetMapping("/")
    public String test() {
        return "I am from Jenkins Test Demo";
    }

    @GetMapping("/user")
    public User getUser() {
        return User.builder()
                .userEmail("mps@email.com")
                .userName("Maharana Pratap")
                .userPhone("23453434")
                .build();
    }
}
