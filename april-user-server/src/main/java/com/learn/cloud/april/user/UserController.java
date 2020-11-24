package com.learn.cloud.april.user;

import com.alibaba.fastjson.JSON;
import com.learn.cloud.april.user.config.UserConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @author phd
 * @date 2020-11-23 22:26:42.
 */
@Slf4j
@EnableConfigurationProperties(UserConfig.class)
@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserConfig userConfig;

    @Autowired
    public UserController(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    @GetMapping(path = "hello")
    public String hello() {
        final String result = JSON.toJSONString(userConfig);
        log.info("user config: {}", result);
        return result;
    }
}
