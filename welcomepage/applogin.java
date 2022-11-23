package com.example.welcomepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class applogin extends AppCompatActivity {


    public static final String TAG = "TAG";
    EditText Passportyorkusername, Passportyorkpassword;
    Button loginBtn;
    Button SignupBtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylogin);

        Passportyorkusername = findViewById(R.id.passportyorkusername);
        Passportyorkpassword = findViewById(R.id.passportyorkpassword);
        loginBtn = findViewById(R.id.login);
        SignupBtn = findViewById(R.id.signup);

        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), appsignup.class));

            }
        });


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivitydriversignup.class));

                final String email = Passportyorkusername.getText().toString().trim();
                String password = Passportyorkpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Passportyorkusername.setError("Passport York Username is Required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Passportyorkpassword.setError("Passport York Passport is Required");
                    return;

                }
            }


        });


    }

}