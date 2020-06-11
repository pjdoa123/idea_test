package com.panjiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author 潘蛟
 *@create 2020-06-10-20:52
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
