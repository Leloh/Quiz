

package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class  Main3Activity extends AppCompatActivity {

    int score;
    RadioButton rdoOption1,rdoOption2,rdoOption3,rdoOption4,rdoOption5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        rdoOption1=(RadioButton)findViewById(R.id.rb_option_a);
        rdoOption2=(RadioButton)findViewById(R.id.rb_option_b1);
        rdoOption3=(RadioButton)findViewById(R.id.rb_option_c2);
        rdoOption4=(RadioButton)findViewById(R.id.rb_option_b3);
        rdoOption5=(RadioButton)findViewById(R.id.rb_option_a4);


    }

    public void onCheckedChanged() {

        if(rdoOption1.isChecked()){
            score++;
        }
        if(rdoOption2.isChecked()){
            score++;
        }
        if(rdoOption3.isChecked()){
            score++;
        }
        if(rdoOption4.isChecked()){
            score++;
        }
        if(rdoOption5.isChecked()){
            score++;
        }
        Toast.makeText(this,"your score is:"+score,Toast.LENGTH_LONG).show();
    }
    public void display(View v){
        onCheckedChanged();
    }


    public void  next (View v){
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }
}