package com.imooc.luckymoney.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Chen Hualiang
 * @date 2019/8/14 - 9:36
 */
@Entity
public class Luckymoney {

    /**
     *ID
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     *金额
     */
    @NotNull(message = "金额不能为空")
    @Min(value = 10, message = "红包金额不能小于10")
    private BigDecimal money;

    /**
     *发送方
     */
    private String producer;

    /**
     *接收方
     */
    private String consumer;

    public Luckymoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "Luckymoney{" +
                "id=" + id +
                ", money=" + money +
                ", producer='" + producer + '\'' +
                ", consumer='" + consumer + '\'' +
                '}';
    }
}
