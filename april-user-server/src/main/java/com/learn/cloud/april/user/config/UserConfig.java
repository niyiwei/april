package com.learn.cloud.april.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.math.BigDecimal;

/**
 * 用户配置
 *
 * @author phd
 * @time 2020-11-23 22:24:33
 */
@RefreshScope
@Data
@ConfigurationProperties(prefix = "user")
public class UserConfig {
    private String name;
    private BigDecimal amount;
    private Long timeout;
}
