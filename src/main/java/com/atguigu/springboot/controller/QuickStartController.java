package com.atguigu.springboot.controller;


import com.atguigu.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController ////等价于@Controller + @ResponseBody
public class QuickStartController {

    @Autowired
    User user;

    @Value("${server.port}")
    private String port;

    @Value("${user.uname}")
    private String uname;

    @RequestMapping("/quick")
    public String quick(){

        System.out.println("uname = " + uname);
        System.out.println("port = " + port);
        System.out.println("user = " + user);
        return "springboot 访问成功1222!";
    }
}
