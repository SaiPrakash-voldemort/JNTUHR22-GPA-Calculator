package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MechSemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech_semesters);
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
        Intent intent=new Intent(this,MechSemOne.class);
        startActivity(intent);
    }
    public void openSemTwo(){
        Intent intent=new Intent(this,MechSemTwo.class);
        startActivity(intent);
    }
    public void openSemThree(){
        Intent intent=new Intent(this,MechSemThree.class);
        startActivity(intent);
    }
    public void openSemFour(){
        Intent intent=new Intent(this,MechSemFour.class);
        startActivity(intent);
    }
    public void openSemFive(){
        Intent intent=new Intent(this,MechSemFive.class);
        startActivity(intent);
    }
    public void openSemSix(){
        Intent intent=new Intent(this,MechSemSix.class);
        startActivity(intent);
    }
    public void openSemSeven(){
        Intent intent=new Intent(this,MechSemSeven.class);
        startActivity(intent);
    }
    public void openSemEight(){
        Intent intent=new Intent(this,MechSemEight.class);
        startActivity(intent);
    }
}