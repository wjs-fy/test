package it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/hello")
    public String hello() {
        return "欢迎来到SpringBoot世界";
    }
}

