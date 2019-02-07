package com.techprimers.springbootwebsocketexample.model;

public class UserResponse {
    String content;

    String from;

    String text;
    public UserResponse() {
    }

    public UserResponse(String content) {
        this.content = content;
    }

    public UserResponse(String from,String text) {
      this.from =from;
      this.text=text;
    }

    public String getContent() {
        return content;
    }


    public String getText() {
        return text;
    }

    public String getFrom() {
        return from;
    }



}
