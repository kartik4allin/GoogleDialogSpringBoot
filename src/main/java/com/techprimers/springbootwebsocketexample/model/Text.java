package com.techprimers.springbootwebsocketexample.model;

public class Text {

    private String[] text;

    public Text() {
    }

    public FulfillmentMessages(String[] text) {
        this.text = text;
    }

    public String[] getText() {
        return text;
    }

}
