package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<UmsMember> selectAllUser();

    UmsMember selectUserByPrimeryId(@Param(value = "id") Integer id);

    void updateUSer(UmsMember umsMember);

    Integer insertUSer(UmsMember umsMember);
}
