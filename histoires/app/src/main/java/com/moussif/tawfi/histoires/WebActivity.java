package com.moussif.tawfi.histoires;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webView=(WebView)findViewById(R.id.web);
        Intent data =getIntent();
        int page=data.getExtras().getInt("page");
        webView.loadUrl("file:///android_asset/www/"+page+".html");
    }
}
