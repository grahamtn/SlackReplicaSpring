package com.zipcode.slackclone.slackclone.handler;


import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.Session;

public class MessageHandler extends TextWebSocketHandler {

    public static WebSocketSession session;

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception{

    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        session.sendMessage(new TextMessage("Hello"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage textMessage) throws Exception {
        System.out.println("Message received: " + textMessage.getPayload());
    }
}
