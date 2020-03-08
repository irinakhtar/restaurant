package com.irin.example.restaurant.service;

import com.irin.example.restaurant.model.Promotion;
import com.irin.example.restaurant.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    public ArrayList<Promotion> allPromotion(){
        ArrayList<Promotion> promotions = new ArrayList<>();
        promotionRepository.findAll().forEach(promotions::add);
        return promotions;
    }
    public Promotion addPromotion(Promotion promotion){
        return promotionRepository.save(promotion);
    }
}
