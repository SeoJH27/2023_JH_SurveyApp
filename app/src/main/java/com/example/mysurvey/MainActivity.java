package com.example.mysurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn_birth, response; DatePicker Date; EditText name;
    ToggleButton sex; RadioGroup r1;
    RadioButton elementryschool, middleschool, highschool, university;
    CheckBox check; RatingBar rating; TextView show;
    // 받아온 데이터
    String nm, school, s;
    int year, month, day;
    float rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 정의
        response = (Button) findViewById(R.id.response);
        btn_birth = (Button) findViewById(R.id.btn_birth);
        Date = (DatePicker) findViewById(R.id.Date);
        name = (EditText) findViewById(R.id.name);
        sex = (ToggleButton) findViewById(R.id.sex);
        r1 = (RadioGroup) findViewById(R.id.r1);
        elementryschool = (RadioButton) findViewById(R.id.elementryschool);
        middleschool = (RadioButton) findViewById(R.id.middleschool);
        highschool = (RadioButton) findViewById(R.id.highschool);
        university = (RadioButton) findViewById(R.id.university);
        check = (CheckBox) findViewById(R.id.check);
        rating = (RatingBar) findViewById(R.id.rating);
        show = (TextView) findViewById(R.id.show);

        btn_birth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(Date.getVisibility() == View.GONE){
                    Date.setVisibility(View.VISIBLE);
                    btn_birth.setText("닫기");
                }
                else {
                    Date.setVisibility(View.GONE);
                    btn_birth.setText("열기");
                }
            }
        });
        response.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((r1.getCheckedRadioButtonId() == -1) || (!check.isChecked()))
                    Toast.makeText(MainActivity.this,
                            "아직 모든 항목에 응답하지 않았습니다", Toast.LENGTH_SHORT).show();
                else{
                    // 데이터: 이름
                    nm = name.getText().toString();
                    // 데이터: 성별
                    boolean b = sex.isChecked();
                    if(!b) s = "남자";
                    else s="여자";
                    // 데이터: 생일
                    year = Date.getYear();
                    month = Date.getMonth();
                    day = Date.getDayOfMonth();
                    // 데이터: 학력
                    if(elementryschool.isChecked()) school = "초졸";
                    else if (middleschool.isChecked()) school = "중졸";
                    else if (highschool.isChecked()) school = "고졸";
                    else school = "대졸";
                    //데이터: 평점
                    rate =rating.getRating();
                    //데이터 출력
                    show.setText("[설문 결과]\t\n\n이름: " + nm + "\t\n성별: " + s +
                            "\t\n생일: " + year + "년 " + month + "월 " + day +
                            "일\t\n학력: " + school + "\t\n평점: " + rate);
                }
            }
        });
    }
}