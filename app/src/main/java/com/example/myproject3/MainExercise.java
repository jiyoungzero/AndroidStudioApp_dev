package com.example.myproject3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainExercise extends AppCompatActivity {
    Button btnprev2;
    Button btncheck;
    int state;
    RadioGroup rg1;
    RadioGroup rg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnprev2 = (Button) findViewById(R.id.btnprev2);
        btncheck = (Button) findViewById(R.id.btncheck);

        rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
        rg2 = (RadioGroup)findViewById(R.id.radioGroup2);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rg_btn1) {                // 첫 번째 버튼이 선택 되었을 때
                    state = 1;
                } else if (i == R.id.rg_btn2) {
                    state = 2;
                }
                else if (i == R.id.rg_btn3) {
                    state = 3;
                }
                else if (i == R.id.rg_btn4) {
                    state = 4;
                }

            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rg_btn5) {                // 첫 번째 버튼이 선택 되었을 때
                    state = 5;
                } else if (i == R.id.rg_btn6) {
                    state = 6;
                }
                else if (i == R.id.rg_btn7) {
                    state = 7;
                }
                else if (i == R.id.rg_btn8) {
                    state = 8;
                }

            }
        });

        btnprev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnprev2.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MainExercise.this, SelectActivity1.class);
                startActivity(intent);
            }
        });

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == 1) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "IN_J");

                    startActivity(intent);
                } else if(state == 2) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "EN_J");
                    startActivity(intent);
                }
                else if(state == 3) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "ES_J");
                    startActivity(intent);
                }
                else if(state == 4) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "IS_J");
                    startActivity(intent);
                }
                else if(state == 5) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "ES_P");
                    startActivity(intent);
                }
                else if(state == 6) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "IS_P");
                    startActivity(intent);
                }
                else if(state == 7) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "IN_P");
                    startActivity(intent);
                }
                else if(state == 8) {
                    Intent intent = new Intent(MainExercise.this, ExerciseResult.class);

                    intent.putExtra("r_btn1", "EN_P");
                    startActivity(intent);
                }

            }
        });

    }



}
