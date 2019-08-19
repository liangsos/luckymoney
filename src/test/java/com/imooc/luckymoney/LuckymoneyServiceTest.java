package com.imooc.luckymoney;

import com.imooc.luckymoney.domain.Luckymoney;
import com.imooc.luckymoney.service.LuckymoneyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @uthor Chen Hualiang
 * @date 2019/8/19 - 9:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LuckymoneyServiceTest {

    @Autowired
    private LuckymoneyService luckymoneyService;

    @Test
    public void findOneTest(){
        Luckymoney luckymoney = luckymoneyService.findOne(12);
        Assert.assertEquals("飞科",luckymoney.getProducer());
    }
}
