package com.spacetim.ms.product.service;


import com.spacetim.ms.product.pojo.ProductPojo;

public interface ProductService {

    public ProductPojo getProduct(Long id);

    public ProductPojo getLatestProduct(Long id);

//    public Integer reduceStock(Long xid, Integer quantity, Long id);


}
