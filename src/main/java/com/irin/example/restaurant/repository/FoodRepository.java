package com.irin.example.restaurant.repository;

import com.irin.example.restaurant.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer> {
}
