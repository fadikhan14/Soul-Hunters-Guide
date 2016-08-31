package com.example.fahadkhan.soulhunterguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static String url;
    LinearLayout one, two, three, four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (LinearLayout) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://forum.lilithgame.com/viewforum.php?f=9";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);

            }
        });

        two = (LinearLayout) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://heavy.com/games/2015/06/soul-hunters-tips-tricks-cheats-guide-ios-android-mobile-games/";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
            }
        });

        three = (LinearLayout) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://forum.us.kick9.com/viewtopic.php?f=41&t=3750";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
            }
        });

        four = (LinearLayout) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://www.18hacker.com/soul-hunters-cheats-hack-tool-online-generator/";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);

            }
        });

    }
}