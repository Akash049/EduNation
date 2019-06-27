package com.edu.edunation;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    Typeface font;
    TextView appName, tagLine;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
        font = Typeface.createFromAsset(getAssets(),"fonts/merienda_regular.ttf");
        appName = (TextView)findViewById(R.id.app_name);
        appName.setTypeface(font);
        tagLine = (TextView)findViewById(R.id.tagline);
        tagLine.setTypeface(font);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        startActivity(new Intent(Splash.this,MainActivity.class));
                    }
                }, 1000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
