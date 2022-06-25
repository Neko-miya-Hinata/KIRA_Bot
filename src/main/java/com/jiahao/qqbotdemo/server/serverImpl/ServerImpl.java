package com.jiahao.qqbotdemo.server.serverImpl;

import com.jiahao.qqbotdemo.entry.Message;
import com.jiahao.qqbotdemo.server.Server;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
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


    /**
     *  每日新闻, 9点执行
     * */
    @Scheduled(cron = "0 0 9 * * ?")
    private void sendDailyHot(){
        String url = "http://0.0.0.0:5700/send_msg?message_type=group&group_id=629472976&message=[CQ:image,file=https://api.vvhan.com/api/60s]";
        restTemplate.getForEntity(url, String.class);
    }
}
