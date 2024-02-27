package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton cse = findViewById(R.id.cse);
        cse.setOnClickListener(view -> openCse());
        ImageButton csm = findViewById(R.id.csm);
        csm.setOnClickListener(view -> openCsm());
        ImageButton csc = findViewById(R.id.csc);
        csc.setOnClickListener(view -> openCsc());
        ImageButton cso = findViewById(R.id.cso);
        cso.setOnClickListener(view -> openCso());
        ImageButton csd = findViewById(R.id.csd);
        csd.setOnClickListener(view -> openCsd());

        ImageButton it = findViewById(R.id.it);
        it.setOnClickListener(view -> openIt());
        ImageButton eee = findViewById(R.id.eee);
        eee.setOnClickListener(view -> openEee());
        ImageButton ece = findViewById(R.id.ece);
        ece.setOnClickListener(view -> openEce());
        ImageButton mech = findViewById(R.id.mech);
        mech.setOnClickListener(view -> openMech());
        ImageButton mining = findViewById(R.id.mining);
        mining.setOnClickListener(view -> openMining());
        ImageButton civil = findViewById(R.id.civil);
        civil.setOnClickListener(view -> openCivil());
        ImageButton info = findViewById(R.id.info);
        info.setOnClickListener(view -> openInfo());
    }
    public void openCse(){
        Intent intent=new Intent(this,CseSemesters.class);
        startActivity(intent);
    }
    public void openCsm(){
        Intent intent=new Intent(this,CsmSemesters.class);
        startActivity(intent);
    }
    public void openCsc(){
        Intent intent=new Intent(this,CscSemesters.class);
        startActivity(intent);
    }
    public void openCso(){
        Intent intent=new Intent(this,CsoSemesters.class);
        startActivity(intent);
    }
    public void openCsd(){
        Intent intent=new Intent(this,CsdSemesters.class);
        startActivity(intent);
    }
    public void openIt(){
        Intent intent=new Intent(this, ItSemesters.class);
        startActivity(intent);
    }
    public void openEee(){
        Intent intent=new Intent(this,EeeSemesters.class);
        startActivity(intent);
    }
    public void openEce(){
        Intent intent=new Intent(this,EceSemesters.class);
        startActivity(intent);
    }
    public void openMech(){
        Intent intent=new Intent(this,MechSemesters.class);
        startActivity(intent);
    }
    public void openMining(){
        Intent intent=new Intent(this,MiningSemesters.class);
        startActivity(intent);
    }
    public void openCivil(){
        Intent intent=new Intent(this,CivilSemesters.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent=new Intent(this,aboutDeveloper.class);
        startActivity(intent);
    }

    
}