package com.zgd.controller;

import com.zgd.pojo.User;
import com.zgd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        List<User> allUsers = userService.getAllUsers();
        log.info(allUsers.toString());
        System.out.println("你爱我78978979");
        return allUsers;
    }
}
