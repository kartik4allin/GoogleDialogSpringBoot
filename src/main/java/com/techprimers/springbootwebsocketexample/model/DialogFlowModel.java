package com.techprimers.springbootwebsocketexample.model;

public class DialogFlowModel {

    private String fulfillmentText;

    private String source="googledilagoueapp";

    public DialogFlowModel() {
    }

    public DialogFlowModel(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
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
