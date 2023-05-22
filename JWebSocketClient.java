package com.mylab.androidclient;

import android.util.Log;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;
import javax.net.ssl.SSLParameters;

// 新建一个客户端类并继承WebSocketClient
public class JWebSocketClient extends WebSocketClient {

    private final static String TAG = JWebSocketClient.class.getSimpleName();

    @Override
    protected void onSetSSLParameters(SSLParameters sslParameters) {
//        super.onSetSSLParameters(sslParameters);
    }

    public JWebSocketClient(URI serverUri) {
        super(serverUri, new Draft_6455());
    }

    @Override
    public void onOpen(ServerHandshake handShakeData) {//在webSocket连接开启时调用
        Log.i(TAG, "onOpen  $handShakeData");
    }

    @Override
    public void onMessage(String message) {//接收到消息时调用
        Log.i(TAG, "onMessage  $message");
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {//在连接断开时调用
        Log.i(TAG, "onMessage  $code $reason $remote");
    }

    @Override
    public void onError(Exception ex) {//在连接出错时调用
        Log.i(TAG, "onError  $ex");
    }
}
