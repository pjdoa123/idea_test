package com.panjiao.controller;

import com.panjiao.pojo.Users;
import com.panjiao.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *@author 潘蛟
 *@create 2020-06-10-20:55
 */
@Controller
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @RequestMapping("/addUser")
    public String addUser(@RequestBody Users users){
        this.usersService.addUser(users);
        return "ok";
    }

}
