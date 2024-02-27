package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CsoSemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cso_semesters);
        Button semOne = findViewById(R.id.button18);
        semOne.setOnClickListener(view -> openSemOne());
        Button semTwo = findViewById(R.id.button19);
        semTwo.setOnClickListener(view -> openSemTwo());
        Button semThree = findViewById(R.id.button20);
        semThree.setOnClickListener(view -> openSemThree());
        Button semFour = findViewById(R.id.button21);
        semFour.setOnClickListener(view -> openSemFour());
        Button semFive = findViewById(R.id.button22);
        semFive.setOnClickListener(view -> openSemFive());
        Button semSix = findViewById(R.id.button23);
        semSix.setOnClickListener(view -> openSemSix());
        Button semSeven = findViewById(R.id.button24);
        semSeven.setOnClickListener(view -> openSemSeven());
        Button semEight = findViewById(R.id.button25);
        semEight.setOnClickListener(view -> openSemEight());
    }
    public void openSemOne(){
        Intent intent=new Intent(this,CsoSemOne.class);
        startActivity(intent);
    }
    public void openSemTwo(){
        Intent intent=new Intent(this,CsoSemTwo.class);
        startActivity(intent);
    }
    public void openSemThree(){
        Intent intent=new Intent(this,CsoSemThree.class);
        startActivity(intent);
    }
    public void openSemFour(){
        Intent intent=new Intent(this,CsoSemFour.class);
        startActivity(intent);
    }
    public void openSemFive(){
        Intent intent=new Intent(this,CsoSemFive.class);
        startActivity(intent);
    }
    public void openSemSix(){
        Intent intent=new Intent(this,CsoSemSix.class);
        startActivity(intent);
    }
    public void openSemSeven(){
        Intent intent=new Intent(this,CsoSemSeven.class);
        startActivity(intent);
    }
    public void openSemEight(){
        Intent intent=new Intent(this,CsoSemEight.class);
        startActivity(intent);
    }
}