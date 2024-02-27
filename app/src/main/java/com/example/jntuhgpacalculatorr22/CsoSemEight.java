package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CsoSemEight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cso_sem_eight);
        EditText sOne,sTwo,sThree,sFour;
        Button calc;
        TextView result;
        sOne=findViewById(R.id.editTextNumber);
        sTwo=findViewById(R.id.editTextNumber2);
        sThree=findViewById(R.id.editTextNumber3);
        sFour=findViewById(R.id.editTextNumber4);


        calc=findViewById(R.id.calculate);
        result=findViewById(R.id.resultGpa);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subOne=Integer.parseInt(sOne.getText().toString());
                int subTwo=Integer.parseInt(sTwo.getText().toString());
                int subThree=Integer.parseInt(sThree.getText().toString());
                int subFour=Integer.parseInt(sFour.getText().toString());



                double res=(subOne*3+subTwo*3+subThree*3+subFour*11);
                res=res/20;
                result.setText("GPA:"+res);


            }
        });
    }
}