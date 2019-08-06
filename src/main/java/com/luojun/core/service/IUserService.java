package com.luojun.core.service;

import com.luojun.core.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/8/2 11:07
 */

public interface IUserService {

    List<User> listAllUsers();


    User queryUserByName(String name);


    User queryUser(User user);

}
