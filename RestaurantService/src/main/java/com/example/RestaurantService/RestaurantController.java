package com.example.RestaurantService;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @GetMapping("list")
    public List<String> getAllRestaurants(){
        return Arrays.asList("zinga", "La","La","hu","hu");
    }


}
