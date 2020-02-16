package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserReceiveAddressService
{

    List<UserAddress> getAllUsersAddress();

    List<UserAddress> getUserAddressByUserId(String id);
}
