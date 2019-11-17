package com.wang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wang.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/17 8:59
 * @description:
 */
@RestController
@RequestMapping("user")
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping(value = "createConsumer", produces = "application/json; charset=UTF-8")
    public String createConsumer(String name) {
        String s = helloService.sayHello(name);
        return s;
    }


}
