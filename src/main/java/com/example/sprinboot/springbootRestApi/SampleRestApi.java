package com.example.sprinboot.springbootRestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SampleRestApi {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World"+ LocalDateTime.now() ;
    }
}
