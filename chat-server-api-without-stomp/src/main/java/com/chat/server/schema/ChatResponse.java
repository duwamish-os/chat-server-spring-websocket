package com.chat.server.schema;

import org.springframework.web.socket.AbstractWebSocketMessage;

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

//class ChatMessage extends AbstractWebSocketMessage<ChatResponse> {
//
//    ChatResponse chatResponse;
//
//    public ChatMessage(ChatResponse payload) {
//        chatResponse = payload;
//
//    }
//
//    protected String toStringPayload() {
//        return chatResponse.toString();
//    }
//
//    public int getPayloadLength() {
//        return 0;
//    }
//}