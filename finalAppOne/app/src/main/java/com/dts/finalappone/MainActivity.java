package com.dts.finalappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.edtTxt);
        textView = findViewById(R.id.txt1);
    }
    public void pencetTampil(View view){
        String nama = editTextName.getText().toString();

        textView.setText("Nama anda : " +nama);

    }
}
