package com.zgd.controller;

import com.zgd.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
    @Autowired
    private People people;

    @GetMapping("/getPeopleInfo")
    private String getPeopleInfo() {
        return people.toString();
    }
}
