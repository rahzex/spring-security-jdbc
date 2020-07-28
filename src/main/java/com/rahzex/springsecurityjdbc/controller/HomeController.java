package com.rahzex.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("<h1>yay this is homepage<h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>yay this is user homepage<h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>yay this is admin homapage<h1>");
    }
}
