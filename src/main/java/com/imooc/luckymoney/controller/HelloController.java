package com.imooc.luckymoney.controller;

import com.imooc.luckymoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Chen Hualiang
 * @date 2019/8/13 - 10:06
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(){
        return  "说明：" + limitConfig.getDescription();
    }

}
