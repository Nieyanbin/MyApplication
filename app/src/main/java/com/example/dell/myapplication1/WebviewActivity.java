package com.example.dell.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {

    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        wb = findViewById(R.id.wb);
        //支持js语言
        wb.getSettings().setJavaScriptEnabled(true);
        // 缩放至屏幕的大小
        wb.getSettings().setLoadWithOverviewMode(true);
        //支持缩放
        wb.getSettings().setSupportZoom(true);
        //声明一个Intent意图，用来接受MainActivity传过来的值
        Intent intent = getIntent();
        //拿到MainActivity传过来的值并返回一个字符串，
        //口令要一致
        String jxString = intent.getStringExtra("path");
        //webVew去加载网页
        wb.loadUrl(jxString);
    }


}
