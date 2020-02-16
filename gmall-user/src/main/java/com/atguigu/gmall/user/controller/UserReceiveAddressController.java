package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserReceiveAddressController {

    @Autowired
   private UserReceiveAddressService UserReceiveAddressService;


    /**
     * 查询所有用户地址信息
     * @return 用户信息列表
     */
    @GetMapping("getAllUsersAddress")
    @ResponseBody
    public List<UserAddress> getAllUsersAddress(){

        List<UserAddress> userAddressList = UserReceiveAddressService.getAllUsersAddress();

        return userAddressList;
    }

    @GetMapping("getUserAddressByUserId")
    @ResponseBody
    public List<UserAddress> getUserAddressByUserId(@RequestParam(value = "UserId") String id){
        List<UserAddress> userAddressList = UserReceiveAddressService.getUserAddressByUserId(id);
        return userAddressList;
    }

}
