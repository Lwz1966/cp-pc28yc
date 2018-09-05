package com.dandanyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author LiWen 
 */
@RequestMapping("/")
@Controller
public class HomeControl {

    @RequestMapping("/")
    public String getHome() {
        return "page/index";
    }
}
