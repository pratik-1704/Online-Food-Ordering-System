package com.example.foodApp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.foodApp.R;

public class WelcomeActivity extends AppCompatActivity {

    TextView tv1,tv2,signin;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        signin = findViewById(R.id.txt_signin);

        register = findViewById(R.id.btn_Register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this,RegisterActivity.class));

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));

            }
        });
    }
}