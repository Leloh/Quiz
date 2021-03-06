package com.example.android.quizapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Main9Activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup options;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        options=( RadioGroup) findViewById(R.id.rg_options);
        options.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Intent goToQuestions= new Intent(Main9Activity.this,Main10Activity.class);
        switch (checkedId){
            case R.id.rb_option_a:
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;

            case R.id.rb_option_b:
                score++;
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;

            case R.id.rb_option_c:
                System.out.println("your score is: "+ score);
                startActivity(goToQuestions);
                break;
        }
    }
}
