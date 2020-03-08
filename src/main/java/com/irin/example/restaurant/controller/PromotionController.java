package com.irin.example.restaurant.controller;

import com.irin.example.restaurant.model.Promotion;
import com.irin.example.restaurant.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @RequestMapping(value = "/promotions", method = RequestMethod.GET)
    public ArrayList<Promotion> getAllPromotion(){
        return promotionService.allPromotion();
    }
    @RequestMapping(value = "/promotions", method = RequestMethod.POST)
    public Promotion addPromotion(@RequestBody Promotion promotion){
        return promotionService.addPromotion(promotion);
    }

}
