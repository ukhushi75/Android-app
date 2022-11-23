package com.example.welcomepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class appsignup extends AppCompatActivity {

    public static final String TAG ="TAG";

    EditText name,lastname,Yorkemail,verifyyorkemail,phone,studentnumber;
    Button nextBtn;
    Button previousBtn;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysignup);

        name = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        Yorkemail= findViewById(R.id.emailaddress);
        verifyyorkemail= findViewById(R.id.confirmemailaddress);
        phone= findViewById(R.id.phonenumber);
        studentnumber= findViewById(R.id.studentnumber);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivitydriversignup.class));

                final String firstname = name.getText().toString().trim();
                String lname = lastname.getText().toString().trim();
                String email = Yorkemail.getText().toString().trim();
                String phonenumber = phone.getText().toString().trim();
                String studentemployeenumber= studentnumber.getText().toString().trim();

                if (TextUtils.isEmpty(firstname))
                {
                    name.setError("Firstname is Required");
                    return;
                }

                if (TextUtils.isEmpty(lname))
                {
                    lastname.setError("Lastname is Required");
                    return;
                }

                if (TextUtils.isEmpty(email))
                {
                    Yorkemail.setError("Yorku email is Required");
                    return;
                }

                if (TextUtils.isEmpty(phonenumber))
                {
                    phone.setError("phonenumber is Required");
                    return;
                }

                if (TextUtils.isEmpty(studentemployeenumber))
                {
                    studentnumber.setError("Student/employee number is Required");
                    return;
                }
                progressBar.setVisibility(view.VISIBLE);


                previousBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),applogin.class));

                    }
                });


            }
        });


    }
}