package com.luojun.core.service.impl;

import com.luojun.core.dto.User;
import com.luojun.core.mapper.UserMapper;
import com.luojun.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/8/2 11:09
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> listAllUsers() {
        return userMapper.listAllUsers();
    }

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }

    @Override
    public User queryUser(User user) {
        return userMapper.queryUser(user);
    }
}
