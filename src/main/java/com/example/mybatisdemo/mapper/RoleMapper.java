package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Select;

import javax.management.relation.Role;

/**
 * @program: mybatisdemo
 * @description: 333
 * @packagename: com.example.mybatisdemo.mapper
 * @author: 姚泽宇
 * @date: 2022-06-29 20:21
 **/
public interface RoleMapper {
    @Select("select * from role where id = #{id}")
    Role selectById(Integer id);

    @Select("select * from role where role_name = #{roleName}")
    Role selectByRoleName(String roleName);

}
