package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.service.UserReceiveAddressService;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.user.mapper.UserReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReceiveAddressServiceImpl implements UserReceiveAddressService {


    @Autowired
    private UserReceiveAddressMapper userReceiveAddressMapper;


    @Override
    public List<UserAddress> getAllUsersAddress() {
        List<UserAddress> userAddressList = userReceiveAddressMapper.selelctAllUsersAddress();
        return userAddressList;
    }

    @Override
    public List<UserAddress> getUserAddressByUserId(String id) {

        List<UserAddress> userAddressList = userReceiveAddressMapper.selectUserAddressByUserId(id);
        return userAddressList;
    }
}
