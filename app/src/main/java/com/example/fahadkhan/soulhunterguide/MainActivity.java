package com.example.fahadkhan.soulhunterguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class MainActivity extends AppCompatActivity {

    public static String url;
    public static InterstitialAd fbInterstitialAd, fbInterstitialAd2;
    LinearLayout one, two, three, four;
    AdView fbAdView;

    @Override
    protected void onDestroy() {
        fbInterstitialAd.destroy();
        fbInterstitialAd2.destroy();
        fbAdView.destroy();
        super.onDestroy();
    }

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
                fbInterstitialAd.show();
            }
        });

        two = (LinearLayout) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://heavy.com/games/2015/06/soul-hunters-tips-tricks-cheats-guide-ios-android-mobile-games/";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();
            }
        });

        three = (LinearLayout) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://forum.us.kick9.com/viewtopic.php?f=41&t=3750";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();
            }
        });

        four = (LinearLayout) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                url = "http://www.18hacker.com/soul-hunters-cheats-hack-tool-online-generator/";
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();

            }
        });

        RelativeLayout adViewContainer = (RelativeLayout) findViewById(R.id.adViewContainer);
        fbAdView = new com.facebook.ads.AdView(this, "1568007433496063_1568007756829364", AdSize.BANNER_HEIGHT_50);
        adViewContainer.addView(fbAdView);
        fbAdView.loadAd();

        fbInterstitialAd = new com.facebook.ads.InterstitialAd(this, "1568007433496063_1568469900116483");
        fbInterstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                fbInterstitialAd.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }
        });
        fbInterstitialAd.loadAd();


        fbInterstitialAd2 = new com.facebook.ads.InterstitialAd(this, "1568007433496063_1568469900116483");
        fbInterstitialAd2.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                MainActivity.this.finish();
            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }
        });
        fbInterstitialAd2.loadAd();
    }

    @Override
    public void onBackPressed() {
        if (fbInterstitialAd2.isAdLoaded()) {
            fbInterstitialAd2.show();
        } else {
            MainActivity.this.finish();
        }
    }

}