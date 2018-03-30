package com.newer.spbtdemo1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//支持跨域请求：协议不同，地址不同，端口号不同
//只要存在以上三个的任何一个不同，就是跨域请求
@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello springboot!";
    }
}
