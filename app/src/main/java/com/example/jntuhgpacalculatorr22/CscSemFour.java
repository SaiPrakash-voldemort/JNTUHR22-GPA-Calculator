package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CscSemFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csc_sem_four);
        EditText sOne,sTwo,sThree,sFour,sFive,sSix,sSeven,sEight,sNine;
        Button calc;
        TextView result;
        sOne=findViewById(R.id.editTextNumber);
        sTwo=findViewById(R.id.editTextNumber2);
        sThree=findViewById(R.id.editTextNumber3);
        sFour=findViewById(R.id.editTextNumber4);
        sFive=findViewById(R.id.editTextNumber5);
        sSix=findViewById(R.id.editTextNumber6);
        sSeven=findViewById(R.id.editTextNumber7);
        sEight=findViewById(R.id.editTextNumber8);
        sNine=findViewById(R.id.editTextNumber9);

        calc=findViewById(R.id.calculate);
        result=findViewById(R.id.resultGpa);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subOne=Integer.parseInt(sOne.getText().toString());
                int subTwo=Integer.parseInt(sTwo.getText().toString());
                int subThree=Integer.parseInt(sThree.getText().toString());
                int subFour=Integer.parseInt(sFour.getText().toString());
                int subFive=Integer.parseInt(sFive.getText().toString());
                int subSix=Integer.parseInt(sSix.getText().toString());
                int subSeven=Integer.parseInt(sSeven.getText().toString());
                int subEight=Integer.parseInt(sEight.getText().toString());
                int subNine=Integer.parseInt(sNine.getText().toString());

                double res=(subOne*3+subTwo*3+subThree*3+subFour*3+subFive*3+subSix+subSeven+subEight*2+subNine);
                res=res/20;
                result.setText("GPA:"+res);


            }
        });
    }
}