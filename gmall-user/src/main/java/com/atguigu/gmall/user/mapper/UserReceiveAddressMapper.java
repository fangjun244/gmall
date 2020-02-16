package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserAddress;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReceiveAddressMapper {
    List<UserAddress> selelctAllUsersAddress();

    List<UserAddress> selectUserAddressByUserId(String id);
}
