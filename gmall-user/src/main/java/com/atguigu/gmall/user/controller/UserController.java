package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.user.bean.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<UmsMember> getAllUser(){


        List<UmsMember> umsMembers = userService.getAllUser();

        return  umsMembers;

    }


    /**
     * 根据id查询指定用户
     * @param id
     * @return
     */
    @GetMapping("getUserById")
    @ResponseBody
    public UmsMember getUserById(@RequestParam(name = "userId") Integer id ){

        UmsMember umsMember = userService.getUserById(id);

        return umsMember;
    }

    /**
     * 根据id 删除指定用户
     * @param id
     */
    @RequestMapping("deleteUserById")
    public void deleteUserById(@RequestParam(value = "userId") Integer id){


    }

    /**
     * 修改用户信息
     */
    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(UmsMember umsMember){

        umsMember.setId(100);
       try {
           umsMember = userService.getUserById(umsMember.getId());
           umsMember.setUsername("杨喆");
       }catch (Exception e){
           return "失败";
       }

        boolean updatesStatus = userService.updateUser(umsMember);
        if (updatesStatus){
            return "成功";
        }
        return "失败";
    }

    /**
     *  新增用户
     * @param umsMember
     * @return
     */
    public String addUSer(UmsMember umsMember){

        boolean addStatus = userService.addUser(umsMember);
        return null;
    }

}
