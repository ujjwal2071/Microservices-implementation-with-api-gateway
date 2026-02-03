package com.example.UserService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "RestaurantService")
public interface RestaurantClient {
    @GetMapping("/restaurants/list")
    public String getRestaurantData();
}
