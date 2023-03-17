package com.alkin.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alkin.listview.fragmentconfig.FragmentKedua;
import com.alkin.listview.fragmentconfig.FragmentPertama;

public class FragmentActivity extends AppCompatActivity {
    Button frag1,frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        frag1 =findViewById(R.id.fragment1);
        frag2=findViewById(R.id.fragment2);

        frag1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bukaFragment(new FragmentPertama());
                    }
                }
        );

        //TODO: BIKIN FRAGMENT 1 & 2
        frag2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    bukaFragment(new FragmentKedua());
                    }
                }
        );
    }
    private void bukaFragment(Fragment fragment){
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }
}