package com.alkin.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import com.alkin.listview.listconfig.CountryAdapter;

import java.util.Arrays;

public class ListViewActivity extends AppCompatActivity {
    String namaNegara[];
    int benderaNegara[] ={
            R.drawable.australian,
            R.drawable.ic_list_us,
            R.drawable.ic_list_uk,
            R.drawable.ic_list_fi,
            R.drawable.austria,
            R.drawable.ic_list_id,
            R.drawable.ic_list_sg,
            R.drawable.ic_list_th,
            R.drawable.ic_list_my,
            R.drawable.ic_list_jp,
            R.drawable.ic_list_cn,
            R.drawable.ic_list_ne,
            R.drawable.ic_list_ne
    };
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView =findViewById(R.id.list_view);
        namaNegara =getResources().getStringArray(R.array.country_array);

        System.out.println(Arrays.toString(namaNegara));

        CountryAdapter adapter = new CountryAdapter(ListViewActivity.this,namaNegara,benderaNegara);
        listView.setAdapter(adapter);
    }
}