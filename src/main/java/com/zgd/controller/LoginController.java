package com.zgd.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    /**
     * 去到登录页面
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }
}
