package com.example.welcomepage;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivitydriversignup extends AppCompatActivity {


    ImageView notuploadeddriverslicense;
    ImageView notuploadedvehicalinsurance;
    ImageButton nextbtn;
    ImageButton photocamera;
    ImageButton pphotocamera2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitydriversignup);

        nextbtn = findViewById(R.id.next);
        photocamera = findViewById(R.id.photocamera);
        pphotocamera2 = findViewById(R.id.photocamera);

        photocamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePicker.Companino.with(MainActivitydriversignup.this)
                        /*.crop()	    			//Crop image(Optional), Check Customization for more option
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)*/
                        .start();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Uri uri = data.getData();
        notuploadeddriverslicense.setImageURI(uri);
    }
}