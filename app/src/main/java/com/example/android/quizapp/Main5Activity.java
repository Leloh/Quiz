package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Main5Activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup options;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        options=( RadioGroup) findViewById(R.id.rg_options);
        options.setOnCheckedChangeListener(this);
    }
    @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            Intent goToQuestions= new Intent(Main5Activity.this,Main6Activity.class);
        switch (checkedId){
            case R.id.rb_option_a:
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;

            case R.id.rb_option_b:
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;

            case R.id.rb_option_c:
                score++;
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;
        }
    }
}



