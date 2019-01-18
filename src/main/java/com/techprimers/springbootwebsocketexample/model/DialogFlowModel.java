package com.techprimers.springbootwebsocketexample.model;

public class DialogFlowModel {

    private String fulfillmentText;

    private FulfillmentMessages fulfillmentMessages;

    private String source="googledilagoueapp";

    public DialogFlowModel() {
    }

    public DialogFlowModel(String fulfillmentText,FulfillmentMessages fulfillmentMessages) {
        this.fulfillmentText = fulfillmentText;
        this.fulfillmentMessages=fulfillmentMessages;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public String getSource() {
        return source;
    }


}

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
