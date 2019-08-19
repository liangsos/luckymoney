package com.imooc.luckymoney.repository;

import com.imooc.luckymoney.domain.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * spring-data-JPA连接数据库
 * @author Chen Hualiang
 * @date 2019/8/14 - 9:48
 */
public interface LuckymoneyRepository extends JpaRepository<Luckymoney,Integer> {
}
