package com.chat.server.schema;

public class ChatResponse {
    private String fulfillmentText;

    public ChatResponse() {
    }

    public ChatResponse(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }
}
