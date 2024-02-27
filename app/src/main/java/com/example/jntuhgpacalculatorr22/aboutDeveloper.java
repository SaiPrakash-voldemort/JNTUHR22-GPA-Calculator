package com.example.jntuhgpacalculatorr22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class aboutDeveloper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        TextView linkedIn=findViewById(R.id.textView5);
        TextView mail=findViewById(R.id.textView7);
        TextView instagram=findViewById(R.id.textView10);

        linkedIn.setMovementMethod(LinkMovementMethod.getInstance());
        mail.setMovementMethod(LinkMovementMethod.getInstance());
        instagram.setMovementMethod(LinkMovementMethod.getInstance());

    }
}