package com.example.myproject3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainHobby extends AppCompatActivity {
    Button btninput;
    Button btnprev1;
    TextView tv_result;
    TextView tv_result2;
    ImageView enfj, enfp, entj, entp, esfj, esfp, estj, estp,
    infj, infp, intj, intp, isfj, isfp, istj, istp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hobby);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnprev1 = (Button)findViewById(R.id.btnprev1);
        btninput = (Button) findViewById(R.id.btninput);
        tv_result = (TextView)findViewById(R.id.tv_result);
        tv_result2 = (TextView)findViewById(R.id.tv_result2);
        enfj = (ImageView)findViewById(R.id.enfj);
        enfp = (ImageView)findViewById(R.id.enfp);
        entj = (ImageView)findViewById(R.id.entj);
        entp = (ImageView)findViewById(R.id.entp);
        esfj = (ImageView)findViewById(R.id.esfj);
        esfp = (ImageView)findViewById(R.id.esfp);
        esfj = (ImageView)findViewById(R.id.esfj);
        estj = (ImageView)findViewById(R.id.estj);
        estp = (ImageView)findViewById(R.id.estp);
        infj = (ImageView)findViewById(R.id.infj);
        infp = (ImageView)findViewById(R.id.infp);
        intj = (ImageView)findViewById(R.id.intj);
        intp = (ImageView)findViewById(R.id.intp);
        isfj = (ImageView)findViewById(R.id.isfj);
        isfp = (ImageView)findViewById(R.id.isfp);
        istj = (ImageView)findViewById(R.id.istj);
        isfp = (ImageView)findViewById(R.id.isfp);
        istp = (ImageView)findViewById(R.id.istp);

        btnprev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnprev1.setVisibility(View.VISIBLE);
                Intent intent = new Intent(MainHobby.this, SelectActivity1.class);
                startActivity(intent);
            }
        });

//        지금 해야 할 거는  esfp를 만약에 다이얼로그에 입력하면  esfp에 맞는 멘트, 사진를 보이도록 한다.
        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(MainHobby.this);
                ad.setIcon(R.drawable.ic_launcher_foreground);
                ad.setTitle("입력창");
                ad.setMessage("당신의 MBTI를 입력하세요");


                final EditText et = new EditText(MainHobby.this);
                ad.setView(et);

                ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String result = et.getText().toString();
                        tv_result.setText(result);
                        switch(result) {
                            case "enfj":
                                tv_result2.setText("짱구는 못말려 중 '유리'같은 당신, 사교적이며 타인의 의견을 " +
                                        "존중한다. 따라서 < 친구, 가족을 위한 이벤트 만들기와 낭독회 >를 추천!");
                                enfj.setVisibility(View.VISIBLE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "enfp":
                                tv_result2.setText("짱구는 못말려 중 '짱아'같은 당신, 상상력이 풍부하고 " +
                                        "일상적인 활동은 지루하다고 느낀다. 따라서 < 악기연주, 새로운 음식만들기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.VISIBLE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "entj":
                                tv_result2.setText("짱구는 못말려 중 '나미리쌤'같은 당신, 철저한 준비력과 " +
                                        "활동성을 가졌다. 따라서 < 친구, 가족을 위한 이벤트 만들기와 낭독회 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.VISIBLE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "entp":
                                tv_result2.setText("짱구는 못말려 중 '짱구'같은 당신, 박학다식하고 독창적이며 " +
                                        "끊임없이 새로운 시도를 한다. 따라서 < 전략게임, 인테리어 소품 조립하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.VISIBLE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "esfj":
                                tv_result2.setText("짱구는 못말려 중 '신형만'같은 당신, 사람에 대해 관심과 동정심이 많고 " +
                                        "친절하다. 따라서 < 가족, 친구와 집에서 영화감상, 다같이 대청소하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.VISIBLE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "esfp":
                                tv_result2.setText("짱구는 못말려 중 '봉미선'같은 당신, 호기심이 많고 개방적인 " +
                                        "성격을 가졌다. 따라서 < 친목모임, 그룹통화 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.VISIBLE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "estj":
                                tv_result2.setText("짱구는 못말려 중 '철수'같은 당신, 체계적인 일처리를 좋아하며 " +
                                        "사실적인 목표설정을 좋아한다. 따라서 < 아침마다 데일리플랜을 짠 후 실천하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.VISIBLE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "estp":
                                tv_result2.setText("짱구는 못말려 중 '수지'같은 당신, 느긋하고 관용적이며 " +
                                        "타협을 잘한다. 따라서 < 노래부르기, 인터넷에서 인테리어 소품 구경하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.VISIBLE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "infj":
                                tv_result2.setText("짱구는 못말려 중 '이슬이 누나'같은 당신, 공동체 이익을 중요시하며 " +
                                        "높은 통찰력을 가졌다. 따라서 < 독서 리뷰, 베이킹해서 주변사람에게 나눠주기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.VISIBLE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "infp":
                                tv_result2.setText("짱구는 못말려 중 '흰둥이'같은 당신, 성실하고 이해심이 많으며 " +
                                        "내적신념이 누구보다 강하다. 따라서 < 블로그 활동, 소설같은 글쓰기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.VISIBLE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "intj":
                                tv_result2.setText("짱구는 못말려 중 '오수'같은 당신, 의지가 강하고 독립적이며" +
                                        "분석력이 뛰어나다. 따라서 < 영화감상 후 인물 분석, 집안 청소 꿀팁알아내기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.VISIBLE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "intp":
                                tv_result2.setText("짱구는 못말려 중 '맹구'같은 당신, 지적 호기심이 높으며 " +
                                        "잠재력을 중요시한다. 따라서 < 추리 소설 / 영화 감상, 범죄사건 탐색하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.VISIBLE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "isfj":
                                tv_result2.setText("짱구는 못말려 중 '원장(두목)님'같은 당신, 차분하고 인내심이 강하며 " +
                                        "헌신적이다. 따라서 < 자수놓기, 퍼즐맞춰 액자 완성하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.VISIBLE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "isfp":
                                tv_result2.setText("짱구는 못말려 중 '훈이'같은 당신, 온화하고 삶의 여유를 " +
                                        "만끽할 수 있는 성격이다. 따라서 < 좋아하는 음식 요리하기, 식물기르기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.VISIBLE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "istj":
                                tv_result2.setText("짱구는 못말려 중 '채성아쌤'같은 당신, 책임감이 강하며 " +
                                        "매사에 철저하고 현실적이다. 따라서 < 가구배치 변화주기, 플래너 작성 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.VISIBLE);
                                istp.setVisibility(View.GONE);
                                break;
                            case "istp":
                                tv_result2.setText("짱구는 못말려 중 '옆집아줌마'같은 당신, 과묵하고 분석적이며 " +
                                        "적응력이 강하다. 따라서 < 드라이브, 역사 속 사건 분석하기 >를 추천!");
                                enfj.setVisibility(View.GONE);
                                enfp.setVisibility(View.GONE);
                                entj.setVisibility(View.GONE);
                                entp.setVisibility(View.GONE);
                                esfj.setVisibility(View.GONE);
                                esfp.setVisibility(View.GONE);
                                estj.setVisibility(View.GONE);
                                estp.setVisibility(View.GONE);
                                infj.setVisibility(View.GONE);
                                infp.setVisibility(View.GONE);
                                intj.setVisibility(View.GONE);
                                intp.setVisibility(View.GONE);
                                isfj.setVisibility(View.GONE);
                                isfp.setVisibility(View.GONE);
                                istj.setVisibility(View.GONE);
                                istp.setVisibility(View.VISIBLE);
                                break;


                        }
                        dialogInterface.dismiss();
                    }
                });
                ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                });
                ad.show();

            }
        });
    }
}