package com.techprimers.springbootwebsocketexample.resource;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import com.techprimers.springbootwebsocketexample.model.User;
import com.techprimers.springbootwebsocketexample.model.DialogFlowModel;
import com.techprimers.springbootwebsocketexample.model.FulfillmentMessages;
import com.techprimers.springbootwebsocketexample.model.Text;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.json.JsonObject;
import javax.json.Json;



@RestController
public class GoogleDialogFlowController {

  @Autowired
  SimpMessagingTemplate template;


   @RequestMapping(value = "/webhookSpringBoot",produces = "application/json")
   public DialogFlowModel receiveDatafromDialogflow() {
    System.out.println("Added new text for GDF !!!!@@@@");
    JsonObject value = Json.createObjectBuilder()
    .add("firstName", "John")
    .add("lastName", "Smith").build();
      System.out.println("JsonObject Object created i Java "+value);
     template.convertAndSend("/topic/messages", "");
     String[] textmessage = {"Text is coming from spring boot websocket Heroku.Adding channel"};
    FulfillmentMessages[] fullfillmentMessage =new FulfillmentMessages[1];
     fullfillmentMessage[0] =new FulfillmentMessages(new Text(textmessage));
      return new DialogFlowModel("hi",fullfillmentMessage);

      // return res.json({
      //       "fulfillmentText": "",
      //       "fulfillmentMessages": [
      //           {
      //             "text": {
      //               "text": [
      //                   "Text is coming from webhook Heroku.Adding channel "+channel+"and the price is "+temp_min
      //                 ]
      //               }
      //           }
      //         ],
      //       source: "googledilagoueapp"
      //     });
   }
}
