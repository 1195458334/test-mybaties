package com.luojun.core.mapper;

import com.luojun.core.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/8/2 11:11
 */
@Mapper
public interface UserMapper {

    List<User> listAllUsers();


    User queryUserByName(String name);


    User queryUser(User user);

}
