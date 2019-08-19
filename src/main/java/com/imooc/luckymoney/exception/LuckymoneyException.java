package com.imooc.luckymoney.exception;

import com.imooc.luckymoney.enums.ResultEnum;

/**
 * @author Chen Hualiang
 * @date 2019/8/16 - 17:26
 */
public class LuckymoneyException extends RuntimeException{
    private Integer code;

    public LuckymoneyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

