package com.developer.zeus.gang;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       Window window = getWindow();
       window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread splashThread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        splashThread.start();

    }
}
