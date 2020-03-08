package com.irin.example.restaurant.controller;

import com.irin.example.restaurant.model.Food;
import com.irin.example.restaurant.model.Promotion;
import com.irin.example.restaurant.service.FoodPromotionService;
import com.irin.example.restaurant.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private FoodPromotionService foodPromotionService;

    @RequestMapping(value = "/foods", method = RequestMethod.GET)
    private ArrayList<Food> getAllFood(){
        return  foodService.getAllfood();
    }

    @RequestMapping(value = "/foods",  method = RequestMethod.POST)
    private Food addFood(@RequestBody Food food){
        return foodService.addFood(food);
    }

    @RequestMapping(value = "/food/{id}/promotion",  method = RequestMethod.POST)
    private Food addPromotion(@RequestBody int promotionId, @PathVariable int id){
        return foodPromotionService.addPromotion(id, promotionId);

    }

}
