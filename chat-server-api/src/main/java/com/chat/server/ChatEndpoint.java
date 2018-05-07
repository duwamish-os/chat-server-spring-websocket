package com.chat.server;

import com.chat.server.schema.ChatRequest;
import com.chat.server.schema.ChatResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatEndpoint {

    private static Logger logger = LoggerFactory.getLogger(ChatEndpoint.class);

    @RequestMapping("/heartbeat")
    public String heartbeat() {
        return "ChatServer";
    }

    @MessageMapping("/chat")
    @SendTo("/stream/greetings") //stream/chat-responses
    public ChatResponse chat(ChatRequest req) throws Exception {
        logger.info("received chat request: " + req);
        Thread.sleep(1000); // simulated delay
        return new ChatResponse("Hello, " + HtmlUtils.htmlEscape(req.getUtterance()) + "!");
    }

}
