package com.learn.cloud.april.food.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义的配置文件
 *
 * @author phd
 * @date 2020/11/24.
 */
@Slf4j
@Data
@ConfigurationProperties(prefix = "my")
public class MyConfig implements InitializingBean, DisposableBean {
    private String name;
    private String server;
    private boolean enable;
    private int age;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("MyConfig afterPropertiesSet ::: {}", this);
    }

    @Override
    public void destroy() throws Exception {
        log.info("MyConfig destroy ::: {}", this);
    }
}
