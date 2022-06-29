package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.UserRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: mybatisdemo
 * @description: 333
 * @packagename: com.example.mybatisdemo.mapper
 * @author: 姚泽宇
 * @date: 2022-06-29 20:21
 **/
public interface UserRoleMapper {
    @Select("select * from user_role where user_id = #{userId}")
    List<UserRole> selectByUserId(Integer userId);
}
