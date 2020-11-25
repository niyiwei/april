package com.learn.cloud.april.food.controller;

import com.learn.cloud.april.food.client.FoodClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Food Controller
 *
 * @author phd
 * @date 2020/11/25.
 */
@Slf4j
@RestController
@RequestMapping(path = "/food")
public class FoodController implements FoodClient {
    private static final Set<String> FOOD_SET = new HashSet<>(100);

    @Override
    public String helloFood(String foodName) {
        log.info("hello food - name:[{}]", foodName);
        return "Hello " + foodName;
    }

    @Override
    public boolean addFood(String foodName) {
        log.info("==> add food name:[{}]", foodName);
        if (FOOD_SET.contains(foodName)) {
            log.info("<== add food fail, name already exists");
            return false;
        }
        final boolean result = FOOD_SET.add(foodName);
        log.info("<== add food name:[{}], result:[{}]", foodName, result);
        return result;
    }

    @Override
    public boolean existsFoodName(String foodName) {
        final boolean result = FOOD_SET.contains(foodName);
        log.info("<== food name is exists name:[{}], result:[{}]", foodName, result);
        return result;
    }
}
