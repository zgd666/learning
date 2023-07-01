package com.zgd.controller;

import com.zgd.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private Car car;

    @GetMapping("/getCar")
    public Car getCar() {
        System.out.println(car);
        return car;
    }
}
