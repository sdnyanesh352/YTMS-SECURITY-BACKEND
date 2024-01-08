package com.ytms.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String HelloMethod(){
        return "Hello World!";
    }
    @PostMapping("/login")
    public String loginMethod(){
        return "login Successful!";
    }
    @GetMapping("/authenticate")
    public String authenticateMethod(){
        return "authenticate World!";
    }
    @GetMapping("/dashboard")
    public String dashboardMethod(){
        return "dashboard World!";
    }
    @GetMapping("/api")
    public String adminMethod(){
        return "admin World!";
    }
    @GetMapping("/api/user")
    public String userMethod(){
        return "User World!";
    }
}
