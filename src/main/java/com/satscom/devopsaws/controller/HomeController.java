package com.satscom.devopsaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
        return "Sathish is testing CI CD project";
    }

    @GetMapping("/test")
    public String getHomedefault(){
        return "Home is all set for the party";
    }
}
