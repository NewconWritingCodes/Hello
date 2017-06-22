package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liukang on 2017/6/22.
 */

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    @RequestMapping("/mvc")
    public String helloMvc(){

        return "home";
    }
}
