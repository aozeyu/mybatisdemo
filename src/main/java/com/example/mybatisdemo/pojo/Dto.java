package com.example.mybatisdemo.pojo;

import lombok.Data;

import java.util.Arrays;

/**
 * @program: mybatisdemo
 * @description: 333
 * @packagename: com.example.mybatisdemo.pojo
 * @author: 姚泽宇
 * @date: 2022-06-29 13:22
 **/
@Data
public class Dto {
    private Boolean success;
    private String errorCode;
    private String msg;
    private String data;
}
