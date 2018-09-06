package com.example.kccistc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_view_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%BA%90%EB%A6%AD%ED%84%B0#s-1"));
               startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.btn_view_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%A0%81%20%EC%BA%90%EB%A6%AD%ED%84%B0#s-1"));
                startActivity(intent);
            }
        });
        Button btn3 = findViewById(R.id.btn_view_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EA%B0%80%EB%A7%88%ED%86%A0%ED%86%A0%20%ED%83%90%ED%97%98%EB%8C%80#s-1"));
                startActivity(intent);
            }
        });
        Button btn4 = findViewById(R.id.btn_view_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EB%A9%94%EC%9D%B8%20%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%A7%80#s-1"));
                startActivity(intent);
            }
        });
        Button btn5 = findViewById(R.id.btn_view_5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EB%A0%88%EC%A0%84%EB%93%9C%20%EC%8A%A4%ED%86%A0%EB%A6%AC#s-1"));
                startActivity(intent);
            }
        });
        Button btn6 = findViewById(R.id.btn_view_6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%EB%8C%80%EC%A0%84%EC%9F%81%20POP!#s-1"));
                startActivity(intent);
            }
        });
        Button btn7 = findViewById(R.id.btn_view_7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EB%83%A5%EC%BD%A4%EB%B3%B4#s-1"));
                startActivity(intent);
            }
        });
        Button btn8 = findViewById(R.id.btn_view_8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%8A%A4%ED%8E%98%EC%85%9C%20%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%A7%80#s-1"));
                startActivity(intent);
            }
        });
        Button btn9 = findViewById(R.id.btn_view_9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%98%A4%ED%86%A0%ED%86%A0%20%EA%B0%9C%EB%B0%9C%EB%8C%80#s-1"));
                startActivity(intent);
            }
        });
        Button btn10 = findViewById(R.id.btn_view_10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, Ani.class);
                startActivity(intent);
            }
        });
    }
}
