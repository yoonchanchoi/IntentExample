package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);                                 //서브 엑티비티의 텍스트 뷰를 연결


        Intent intent = getIntent();
        String str = intent.getStringExtra("str");                  //String 형태로 어딘가에서 날아온 데이터를 받겠다는 함수

        tv_sub.setText(str);                                              //str로 받은 값을 해당 서브 엑티비티의 텍스트 뷰에 넣어서 나타나게 해줌
    }
}