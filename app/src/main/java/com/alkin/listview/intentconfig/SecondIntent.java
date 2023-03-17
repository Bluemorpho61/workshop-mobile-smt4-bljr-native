package com.alkin.listview.intentconfig;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alkin.listview.R;

public class SecondIntent extends AppCompatActivity {
    TextView txt;
    private String nama;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtext);
        txt =findViewById(R.id.nama);

        Bundle extras =getIntent().getExtras();
        nama =extras.getString("Nama");
        txt.setText(nama);
    }
}
