package com.learn.cloud.april.food.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Food Client
 *
 * @author phd
 * @date 2020/11/25.
 */
@FeignClient(value = "april-food-server", path = "/food")
public interface FoodClient {

    /**
     * 根据Food名称打招呼
     *
     * @param foodName 名称
     * @return .
     */
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    String helloFood(@RequestParam("foodName") String foodName);

    /**
     * 添加 Food
     *
     * @param foodName 名称
     * @return .
     */
    @RequestMapping(method = RequestMethod.POST, path = "/add")
    boolean addFood(@RequestParam("foodName") String foodName);

    /**
     * 是否存在该 foodName
     *
     * @param foodName 名称
     * @return true --> 存在, false --> 不存在.
     */
    @GetMapping(path = "/exists/{foodName}")
    boolean existsFoodName(@PathVariable("foodName") String foodName);
}
