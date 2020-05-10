package com.etho.ethokun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[ ] nw;
    public MainAdapter(Context c, String[] nw) {
        context = c;
        this.nw = nw;
    }

    @Override
    public int getCount() {
        return nw.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         if (inflater == null){
             inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         }
         if (convertView == null){
             convertView = inflater.inflate(R.layout.row_item, null);
         }

        TextView textView =  convertView.findViewById(R.id.idtext);
         textView.setText(nw[position]);
         return convertView;
    }
}
