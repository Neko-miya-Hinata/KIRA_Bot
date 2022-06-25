package com.jiahao.qqbotdemo.server;

import com.jiahao.qqbotdemo.entry.Message;

public interface Server {

    Object receiveMessage(Message message);

}
