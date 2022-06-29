package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program: mybatisdemo
 * @description: 333
 * @packagename: com.example.mybatisdemo.mapper
 * @author: 姚泽宇
 * @date: 2022-06-29 20:16
 **/
@Mapper
public interface SysUserMapper {
    @Select("select * from sys_user where id = #{id}")
    SysUser selectById(Integer id);

    @Select("select * from sys_user where username = #{username} ")
    SysUser selectByUserName(String username);
}
