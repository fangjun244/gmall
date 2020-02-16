package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public UmsMember getUserById(Integer id) {
        UmsMember UmsMember = userMapper.selectUserByPrimeryId(id);
        return UmsMember;
    }

    @Override
    public boolean updateUser(UmsMember umsMember) {
        //查询用户是否存在
        UmsMember user = userMapper.selectUserByPrimeryId(umsMember.getId());
        if (umsMember != null) {
            userMapper.updateUSer(umsMember);
            return true;
        }
        return false;

    }

    @Override
    public boolean addUser(UmsMember umsMember) {
        Integer addUserId = userMapper.insertUSer(umsMember);
        if (addUserId != null){ return true;}
        return false;
    }
}
