package com.example.myproject3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ExerciseResult extends AppCompatActivity {
    TextView tv_rb_result, tv_result3;
    Button btnprev3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_result);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tv_rb_result = (TextView) findViewById(R.id.tv_rb_result);
        tv_result3 = (TextView)findViewById(R.id.tv_result3);
        btnprev3 = (Button)findViewById(R.id.btnprev3);

        btnprev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseResult.this, MainExercise.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String result = intent.getExtras().getString("r_btn1");
        tv_rb_result.setText(result);
        switch(result) {
            case "IN_J":
                tv_rb_result.setText("IN_J");
                tv_result3.setText("집에서 조용하게 시간을 보내기 좋아하는 ISFJ에게는 < 일대일 요가 수련> 추천!\n" +
                        "정확하고 계산된 움직임을 좋아하는 INTJ에게는 <크로스핏>을 추천!\n");
                break;
            case "EN_J":
                tv_rb_result.setText("EN_J");
                tv_result3.setText("소수와의 관계에서 더 빛을 발하는 ENTJ에게는 <골프>추천!\n" +
                        "여럿이서 함께 친목 도모하기를 좋아하는 ENFJ에게는 <등산>을 추천\n");
                break;
            case "ES_J":
                tv_rb_result.setText("ES_J");
                tv_result3.setText("다른 사람과 협동하기를 좋아하는 ESFJ에게는 <크로스핏>을 추천!\n" +
                        "외향적이며 목표지향적인 ESTJ에게는 <러닝>을 추천!\n");
                break;
            case "IS_J":
                tv_rb_result.setText("IS_J");
                tv_result3.setText("혼자 차분히 목표를 향해 가기를 좋아하는 ISTJ에게는 <수영>을 추천!\n" +
                        "조용한 완벽주의자인 ISFJ에게는 <필라테스>를 추천!\n");
                break;
            case "ES_P":
                tv_rb_result.setText("ES_P");
                tv_result3.setText("자유분방하며 민첩함이 있는 ESTP에게는 <복싱>을 추천!\n" +
                        "산만하지만 열정가능한 자유로운 영혼인 ESFP에게는 <발레>추천!\n");
                break;
            case "IS_P":
                tv_rb_result.setText("IS_P");
                tv_result3.setText("조용하지만 상황파악이 빠른 ISTP에게는 <스케이트보드>추천!\n" +
                        "규칙을 싫어하며 익스트림한 스포츠를 즐기는 ISFP <패러글라이딩>추천!\n");
                break;
            case "IN_P":
                tv_rb_result.setText("IN_P");
                tv_result3.setText("언제나 머릿속이 온갖 생각으로 가득한 INTP에게는 <요가>를 추천!\n" +
                        "자기애가 강하고 온화한 성격의 INFP에게는 <홈트레이닝>을 추천!\n");
                break;
            case "EN_P":
                tv_rb_result.setText("EN_P");
                tv_result3.setText("끈기가 부족해 쉽게 질려하는 ENTP에게는 <서핑, 스키>를 추천!\n" +
                        "자유롭고 열정적인 에너지각 가득한 ENFP에게는 <폴탠스, 에어로빅>추천!\n");
                break;
        }




    }
}