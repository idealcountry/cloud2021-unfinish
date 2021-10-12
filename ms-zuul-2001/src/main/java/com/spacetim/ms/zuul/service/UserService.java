package com.spacetim.ms.zuul.service;


import com.spacetim.ms.zuul.pojo.UserRolePo;

public interface UserService {

    public UserRolePo getUserRole(Long userId);

    public UserRolePo getUserRoleByUserName(String userName);
}
