package com.example.myproject3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity1 extends AppCompatActivity {
    Button btnhobby;
    Button btnexer;
    Button btnprevmain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnhobby = (Button)findViewById(R.id.btnhobby);
        btnexer = (Button)findViewById(R.id.btnexer);
        btnprevmain1 = (Button)findViewById(R.id.btnprevmain1);

        // 돌아가기 버튼 클릭 시
        btnprevmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnhobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity1.this, MainHobby.class);
                startActivity(intent);
            }
        });

        btnexer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity1.this, MainExercise.class);
                startActivity(intent);
            }
        });

    }
}