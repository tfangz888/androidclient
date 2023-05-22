
package com.mylab.androidclient;
// 新建WebSocketEvent，用于传递websocket消息事件
public class WebSocketEvent {
    private String message;

    public WebSocketEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
