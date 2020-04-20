package com.example.signup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class signupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

    }


    public void login (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}