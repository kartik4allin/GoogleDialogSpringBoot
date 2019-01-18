package com.techprimers.springbootwebsocketexample.model;

import com.techprimers.springbootwebsocketexample.model.Text;

public class FulfillmentMessages {

    private Text text;

    public FulfillmentMessages() {
    }

    public FulfillmentMessages(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }

}
