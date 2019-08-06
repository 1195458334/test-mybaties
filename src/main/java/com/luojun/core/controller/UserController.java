package com.luojun.core.controller;

import com.luojun.core.dto.User;
import com.luojun.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/8/2 10:53
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/user/toUserInfo")
    public String toUserPage(){
        return "user/userInfo";
    }


    @RequestMapping("/user/listAllUsers")
    @ResponseBody
    public List<User> listAllUsers(){
        return userService.listAllUsers();
    }

    @RequestMapping("/user/queryUserByName")
    @ResponseBody
    public User queryUserByName(String name){
        return userService.queryUserByName(name);
    }

    @RequestMapping("/user/queryUser")
    @ResponseBody
    public User queryUser(User user){
        return userService.queryUser(user);
    }
}
