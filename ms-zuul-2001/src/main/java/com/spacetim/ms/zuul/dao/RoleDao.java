package com.spacetim.ms.zuul.dao;


import com.spacetim.ms.zuul.pojo.RolePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleDao {

    public List<RolePo> findRolesByUserId(@Param("userId") Long userId);
}
