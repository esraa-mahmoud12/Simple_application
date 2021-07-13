package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class Demo {


    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "hello eses";
    }
}

