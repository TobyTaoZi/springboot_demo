package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taojingjing on 2017/4/5.
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String Test(@RequestParam String id){

        return id;
    }
}
