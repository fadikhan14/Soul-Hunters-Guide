package com.example.fahadkhan.soulhunterguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;


public class webView extends AppCompatActivity {

    public WebView webView;
    AdView fbAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        webView = (WebView) findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.loadUrl(MainActivity.url);
        webView.setWebViewClient(new WebViewClient());
        RelativeLayout adViewContainer = (RelativeLayout) findViewById(R.id.adViewContainer);
        fbAdView = new com.facebook.ads.AdView(this, "1568007433496063_1568007756829364", AdSize.BANNER_HEIGHT_50);
        adViewContainer.addView(fbAdView);
        fbAdView.loadAd();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainActivity.fbInterstitialAd.show();
    }
}
