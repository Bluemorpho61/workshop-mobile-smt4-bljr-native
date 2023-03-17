package com.alkin.listview.listconfig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alkin.listview.R;

public class CountryAdapter extends ArrayAdapter<String> {
    String namaNegara[];
    int benderaNegara[];
    Context mContext;
    public CountryAdapter(@NonNull Context context, String namaNegara[], int bendera[]) {
        super(context, R.layout.list_item);
        this.namaNegara =namaNegara;
        this.benderaNegara =bendera;
        this.mContext =context;
    }

    @Override
    public int getCount() {
        return namaNegara.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView==null) {
            LayoutInflater mFlater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mFlater.inflate(R.layout.list_item, parent, false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.bendera);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.negara);

        }else {
            viewHolder =(ViewHolder)convertView.getTag();
        }
            viewHolder.imageView.setImageResource(benderaNegara[position]);
            viewHolder.textView.setText(namaNegara[position]);

        return convertView;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
