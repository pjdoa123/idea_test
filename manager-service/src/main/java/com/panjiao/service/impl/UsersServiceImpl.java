package com.panjiao.service.impl;

import com.panjiao.mapper.UsersMapper;
import com.panjiao.pojo.Users;
import com.panjiao.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@author 潘蛟
 *@create 2020-06-10-20:59
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    public void addUser(Users users) {
        this.usersMapper.insertUsers(users);
    }
}
