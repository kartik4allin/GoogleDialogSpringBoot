package com.techprimers.springbootwebsocketexample.resource;

import java.util.HashMap;
import java.util.Map;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GoogleDialogFlowController {

  @Autowired
  SimpMessagingTemplate template;


   @RequestMapping(value = "/webhookSpringBoot")
   public String receiveDatafromDialogflow() {
    System.out.println("inside receiveDatafromDialogflow !!!!");
     template.convertAndSend("/topic/user", new UserResponse("data from google dialog flow"));
      return "Hello World";
   }
}
