package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Hello")
public class BasicController {
    @GetMapping
    public @ResponseBody String basic(){
        return "Hello";
    }
}
