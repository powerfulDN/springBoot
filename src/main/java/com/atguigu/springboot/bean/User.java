package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  // 组件注解
@ConfigurationProperties(value = "user")
public class User {

    private String uname;
    private Integer age;

    public User() {
    }

    public User(String uname, Integer age) {
        this.uname = uname;
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
