package com.jiahao.qqbotdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootTest
class QqBotDemoApplicationTests {

    @Resource
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {

    }

}
