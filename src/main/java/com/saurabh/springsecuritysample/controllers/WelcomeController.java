package com.saurabh.springsecuritysample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(value = "/hello")
    public String accessThisMethod(){
        return "This endpoint is protected by spring security";
    }
}
