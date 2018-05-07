package com.chat.server.schema;

public class ChatRequest {
    private String utterance;

    public ChatRequest() {
    }

    public ChatRequest(String utterance) {
        this.utterance = utterance;
    }

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }
}
