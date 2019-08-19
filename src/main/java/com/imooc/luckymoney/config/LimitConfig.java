package com.imooc.luckymoney.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Chen Hualiang
 * @date 2019/8/13 - 10:54
 */
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    /**
     *最小金额
     */
    private BigDecimal minMoney;
    
    /**
     *最大金额
     */
    private BigDecimal maxMoney;
    
    /**
     *说明
     */
    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
