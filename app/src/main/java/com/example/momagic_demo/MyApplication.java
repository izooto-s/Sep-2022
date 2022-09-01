package com.example.momagic_demo;
import com.momagic.DATB;
import com.momagic.NotificationHelperListener;
import com.momagic.Payload;

import android.app.Application;
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DATB.initialize(this)
                .setNotificationReceiveListener(new ExampleNotificationHandler())
                .build();
    }

    private static class ExampleNotificationHandler implements NotificationHelperListener {
        @Override
        public void onNotificationReceived(Payload payload) {

        }

        public void onNotificationOpened (String data){

        }
    }
}
