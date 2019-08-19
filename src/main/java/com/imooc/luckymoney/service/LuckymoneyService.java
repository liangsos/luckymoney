package com.imooc.luckymoney.service;

import com.imooc.luckymoney.domain.Luckymoney;
import com.imooc.luckymoney.enums.ResultEnum;
import com.imooc.luckymoney.repository.LuckymoneyRepository;
import com.imooc.luckymoney.exception.LuckymoneyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author Chen Hualiang
 * @date 2019/8/15 - 15:13
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 事务 指数据库事务
     * 例子： 扣库存 > 创建订单
     */
    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("陈华亮");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("陈华亮");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }

    public void getMoney(Integer id) throws Exception{
        Optional<Luckymoney> optional = repository.findById(id);
        if(optional.isPresent()){
            Luckymoney luckymoney = optional.get();
            Double money = luckymoney.getMoney().doubleValue();
            if (money < 100){
                //返回"小红包" code=100
                throw new LuckymoneyException(ResultEnum.PRIMARY_MONEY);
            }else if (money>100){
                //返回"大红包" code=101
                throw new  LuckymoneyException(ResultEnum.MAX_MONEY);
            }
        }
    }

    /**
     * 通过id查询一个红包信息
     * @param id
     * @return
     */
    public Luckymoney findOne(Integer id){
        return repository.findById(id).orElse(null);
    }
}
