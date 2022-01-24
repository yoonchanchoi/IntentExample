package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_test=findViewById(R.id.et_test);
                                                                    // getText()경위 editext의 값을 가져오는다 하지만여기서 toString()을 해주므로써 String형으로 다시 가져온다.

        btn_move=findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);      //Intent를 이용한 이동
                                                                                                        //첫번째 매개 변수는 현재 자신의  activity 두번째 매개변수 인자는 이동하고 싶은 activity
                intent.putExtra("str", str);                                                  //intert로 넘어갈때 데이터를 담아서 쏴주는것이다.
                                                                                                        //첫번재 인자는 별명으로 보낼 변수이름(별명)이라고 보는게 맞다
                                                                                                        //두번째 인자는 실제 데이터가 들어가는 변수이다.
                startActivity(intent);                                                              //실제적으로 activity 이동을 해주는 구문
            }
        });


    }
}