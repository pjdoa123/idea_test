package com.panjiao.test;

import com.panjiao.mapper.UsersMapper;
import com.panjiao.pojo.Users;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *@author 潘蛟
 *@create 2020-06-09-23:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-mybatis.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserAge(20);
        users.setUserName("admin");

        this.usersMapper.insertUsers(users);
    }
}
