package com.jiahao.qqbotdemo.controller;

import com.jiahao.qqbotdemo.entry.Message;
import com.jiahao.qqbotdemo.server.Server;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class controllerDemo {

    @Resource
    private Server server;

    @RequestMapping(value = "/controller", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void controller(@RequestBody Message message){
        server.receiveMessage(message);
    }
}
