package com.example.mysurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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



    }
}