package com.spacetim.ms.product.dao;

import com.spacetim.ms.product.pojo.ProductPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductDao {
    public ProductPojo getProduct(@Param("id") Long id);

    public Integer reduceStock(@Param("xid") long xid, @Param("quantity") Integer quantity, @Param("id") Long id);
}
