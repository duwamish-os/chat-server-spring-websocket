chat server with WS
-------------------

```
mvn spring-boot:run
```

on request,

```
2018-05-06 19:27:20.561  INFO 54728 --- [nboundChannel-7] com.chat.server.ChatEndpoint             : received chat request: com.chat.server.schema.ChatRequest@4385ec87
2018-05-06 19:27:46.144  INFO 54728 --- [MessageBroker-4] o.s.w.s.c.WebSocketMessageBrokerStats    : WebSocketSession[1 current WS(1)-HttpStream(0)-HttpPoll(0), 1 total, 0 closed abnormally (0 connect failure, 0 send limit, 0 transport error)], stompSubProtocol[processed CONNECT(1)-CONNECTED(1)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 9, active threads = 0, queued tasks = 0, completed tasks = 9], outboundChannelpool size = 2, active threads = 0, queued tasks = 0, completed tasks = 2], sockJsScheduler[pool size = 8, active threads = 1, queued tasks = 2, completed tasks = 6]
```