package com.example.android.quizapp;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
RadioButton rdmenu1,rdmenu2,rdmenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button) findViewById(R.id.btn_nxt);
        next.setOnClickListener(this);
        rdmenu1=(RadioButton)findViewById(R.id.rd_menu1);
        rdmenu2=(RadioButton)findViewById(R.id.rd_menu2);
        rdmenu3=(RadioButton)findViewById(R.id.rd_menu3);

}




    @Override
    public void onClick(View v) {
        Intent goToQuestions = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(goToQuestions);

    }
    public void gp1(View v) {
        Intent goToQuestions = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(goToQuestions);
    }


    public void gp2(View v) {
        Intent goToQuestions = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(goToQuestions);
    }
    public void gp3(View v) {
        Intent goToQuestions= new Intent(MainActivity.this, Main3Activity.class);
        startActivity(goToQuestions);


    }
}