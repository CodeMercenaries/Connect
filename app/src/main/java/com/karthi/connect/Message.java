package com.karthi.connect;

/**
 * Created by Karthi on 19-Nov-17.
 */

public class Message {
    private String content,username;
    public Message(){

    }
    public Message(String content, String username){

        this.content=content;
        this.username= username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
