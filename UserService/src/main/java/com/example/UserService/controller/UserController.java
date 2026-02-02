package com.example.UserService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to User Service";
    }
}
