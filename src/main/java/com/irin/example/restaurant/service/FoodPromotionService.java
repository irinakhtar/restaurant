package com.irin.example.restaurant.service;

import com.irin.example.restaurant.model.Food;
import com.irin.example.restaurant.model.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodPromotionService {

    @Autowired
    private FoodService foodService;

    @Autowired
    private PromotionService promotionService;

    public Food addPromotion(int foodId, int promotionId){
        Food food = foodService.findById(foodId);
        Promotion promotion = promotionService.findById(promotionId);
        food.setPromotion(promotion);
        return foodService.update(food);
    }
}
