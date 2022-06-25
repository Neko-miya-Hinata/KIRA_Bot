package com.jiahao.qqbotdemo.server.serverImpl;

import com.jiahao.qqbotdemo.entry.Message;
import com.jiahao.qqbotdemo.server.Server;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
@EnableScheduling
public class ServerImpl implements Server {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public Object receiveMessage(Message message) {
        return null;
    }


}
