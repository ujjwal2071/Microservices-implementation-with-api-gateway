package com.example.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserService.feign.RestaurantClient;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    RestaurantClient RestaurantClient;

    @RequestMapping("/welcome")
    public String welcome() {
        String restaurantList=RestaurantClient.getRestaurantData();
        return "Welcome User to our App following are the list of restaurant"+restaurantList;
    }

    
    
}
