package com.spacetim.ms.zuul;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author spacetim
 * @date 2021/10/12
 * @description
 */
@SpringBootApplication
// MyBatis映射器扫描
@MapperScan(basePackages = "com.spacetim.ms.zuul", annotationClass = Mapper.class)
public class MsZuulApplication2001 {
    public static void main(String[] args) {
        SpringApplication.run(MsZuulApplication2001.class, args);
    }
}
