package com.learn.cloud.april.food;

import com.alibaba.fastjson.JSON;
import com.learn.cloud.april.food.config.MyConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Food - Controller
 *
 * @author phd
 * @date 2020/11/24.
 */
@Slf4j
@EnableConfigurationProperties(MyConfig.class)
@RestController
@RequestMapping("/food")
public class HelloController {
    private final MyConfig myConfig;

    public HelloController(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    @GetMapping("/hello")
    public Object hello() {
        final String result = JSON.toJSONString(myConfig);
        log.info("hello ::: {}", result);
        return result;
    }
}
