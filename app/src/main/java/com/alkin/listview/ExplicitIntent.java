package com.alkin.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alkin.listview.intentconfig.SecondIntent;

public class ExplicitIntent extends AppCompatActivity {

    EditText nama;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        nama =findViewById(R.id.nm_explicit);
        btnSend=findViewById(R.id.btn_explIntent);

        btnSend.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            String namas =nama.getText().toString();
                            if (namas != "") {
                                Intent i =new Intent(ExplicitIntent.this, SecondIntent.class);
                               i.putExtra("Nama",namas);
                               Toast.makeText(getApplication(),namas,Toast.LENGTH_LONG);
                               startActivity(i);
                            }else {
                                Toast.makeText(getApplication(),"Silahkan masukkan nama", Toast.LENGTH_SHORT);
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                            Toast.makeText(getApplication(),"Error",Toast.LENGTH_SHORT);
                        }
                    }
                }
        );
    }
}