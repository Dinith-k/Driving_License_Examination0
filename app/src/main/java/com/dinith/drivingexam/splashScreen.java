package com.dinith.drivingexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
        {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                nextscreen();

            }
        }, 2000);

    }

    private void nextscreen() {
        Intent intent = new Intent(getApplication(), onboarding_screen.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void finish() {
        super.finish();

      //  overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
