package com.spacetim.ms.product.dao;

import com.spacetim.ms.product.pojo.ProductSalesDetailsPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductSalesDetailsDao {

    public Integer insertProductSales(ProductSalesDetailsPojo productSalesDetailsPojo);
}
