package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        textView = findViewById(R.id.textView3);

    }

    public void createAccount (View view){
        Intent intent = new Intent (this, signupActivity.class);
        startActivity(intent);
    }
}
