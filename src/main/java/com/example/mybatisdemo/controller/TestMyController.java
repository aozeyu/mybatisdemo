package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.mapper.UserTestMapper;
import com.example.mybatisdemo.pojo.Dto;
import com.example.mybatisdemo.pojo.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mybatisdemo
 * @description: 333
 * @packagename: com.example.mybatisdemo.controller
 * @author: 姚泽宇
 * @date: 2022-06-29 13:16
 **/
@RestController
@RequestMapping("api/v1/test/my")
public class TestMyController {
    @Autowired
    private UserTestMapper userTestMapper;
    @GetMapping("list")
    public List<UserTest> test() {
        List<UserTest> list = userTestMapper.selectList(null);
        for (UserTest userTest : list) {
            System.out.println(userTest.getUsername());
        }
        return list;
    }
}
