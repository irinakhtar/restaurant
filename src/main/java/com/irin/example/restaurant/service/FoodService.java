package com.irin.example.restaurant.service;

import com.irin.example.restaurant.model.Food;
import com.irin.example.restaurant.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public ArrayList<Food> getAllfood(){
        ArrayList<Food> foods = new ArrayList<>();
        foodRepository.findAll().forEach(foods::add);
        return foods;
    }
    public Food findById(int foodId){
        return foodRepository.findById(foodId).get();
    }
    public Food addFood(Food food){
        return foodRepository.save(food);
    }
    public Food update(Food food){
        return foodRepository.save(food);
    }

}
