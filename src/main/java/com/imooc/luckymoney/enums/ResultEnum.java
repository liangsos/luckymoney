package com.imooc.luckymoney.enums;

/**
 * @author Chen Hualiang
 * @date 2019/8/16 - 17:55
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_MONEY(100,"小红包"),
    MAX_MONEY(101,"大红包"),
    ;
    /**
     *code 错误编号
     */
    private Integer code;

    /**
     *msg 错误信息
     */
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
