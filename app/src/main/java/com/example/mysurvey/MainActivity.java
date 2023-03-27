package com.example.mysurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn_birth, response;
    EditText name;
    ToggleButton sex;
    RadioButton elementryschool, middleschool, highschool, university;
    CheckBox check;
    RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 정의
        {
            response = (Button) findViewById(R.id.response);
            btn_birth = (Button) findViewById(R.id.btn_birth);
            name = (EditText) findViewById(R.id.name);
            sex = (ToggleButton) findViewById(R.id.sex);
            elementryschool = (RadioButton) findViewById(R.id.elementryschool);
            middleschool = (RadioButton) findViewById(R.id.middleschool);
            highschool = (RadioButton) findViewById(R.id.highschool);
            university = (RadioButton) findViewById(R.id.university);
            check = (CheckBox) findViewById(R.id.check);
            rating = (RatingBar) findViewById(R.id.rating);
        }

        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }

        });

    }
}