package com.dts.choosey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msgText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msgText =  findViewById(R.id.txt_msg);
        btn_bio = findViewById()
    }
    public void sendEmail(View view){
        Intent i = new Intent (Intent.ACTION_SEND)
    }
}
