package com.example.mybatisdemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: mybatisdemo
 * @description: 33
 * @packagename: com.example.mybatisdemo.pojo
 * @author: 姚泽宇
 * @date: 2022-06-29 13:13
 **/
@Data
public class UserTest {
    private int id;

    private String username;

    private int age;

    private int tel;

    private Date create_time;


    private Date update_time;

    private int version;

}
