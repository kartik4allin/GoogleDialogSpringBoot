package com.techprimers.springbootwebsocketexample.resource;

import com.techprimers.springbootwebsocketexample.model.User;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @MessageMapping("/websocket-example/{topic}")
    @SendTo("/topic/messages")
    public UserResponse getUser(@DestinationVariable("topic") String topic,User user) {
     System.out.println("Inside USERCONTROLLER MESSAGEMAPPING IS CLALED!!!!!!!!!!!!");
        return new UserResponse("Hi " + user.getName());
    }
}
