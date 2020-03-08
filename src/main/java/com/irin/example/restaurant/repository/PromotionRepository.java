package com.irin.example.restaurant.repository;

import com.irin.example.restaurant.model.Promotion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Integer> {
}
