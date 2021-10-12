package com.spacetim.ms.product;

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
@MapperScan(basePackages = "com.spacetim.ms.product", annotationClass = Mapper.class)

public class MsProductApplication5001 {
    public static void main(String[] args) {
        SpringApplication.run(MsProductApplication5001.class, args);
    }

}
