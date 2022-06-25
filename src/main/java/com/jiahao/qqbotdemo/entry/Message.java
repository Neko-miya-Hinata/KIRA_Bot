package com.jiahao.qqbotdemo.entry;

import lombok.Data;

@Data
public class Message {
    private String subType;
    private int messageId;
    private long userId;
    private String rawMessage;
    private int font;
    private Object sender;
    private long time;
    private long selfId;
    private String post_type;
}
