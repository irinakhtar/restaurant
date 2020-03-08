package com.irin.example.restaurant.controller;

import com.irin.example.restaurant.model.Food;
import com.irin.example.restaurant.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(value = "/foods", method = RequestMethod.GET)
    private ArrayList<Food> getAllFood(){
        return  foodService.getAllfood();
    }

    @RequestMapping(value = "/foods",  method = RequestMethod.POST)
    private Food addFood(@RequestBody Food food){
        return foodService.addFood(food);
    }

}
