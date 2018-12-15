package com.zein.listview_costumclases;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CostumListView extends ArrayAdapter<String> {

    private String[] fruitName;
    private String[] desc;
    private int[] images;
    private Activity context;


    public CostumListView(Activity context, String[] fruitName, String[] desc, int[] images) {
        super(context, R.layout.listview_layout,fruitName);
        this.context=context;
        this.fruitName=fruitName;
        this.desc=desc;
        this.images=images;
    }

    public View getView(int position, View converView, ViewGroup parent){
        View r = converView;
        ViewHolder viewHolder=null;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();

        }

        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.tv1.setText(fruitName[position]);
        viewHolder.tv2.setText(desc[position]);

        return r;

    }

    class ViewHolder{
        TextView tv1;
        TextView tv2;
        ImageView imageView;
        ViewHolder(View v){
            tv1=(TextView)v.findViewById(R.id.textViewFruitName);
            tv2=(TextView)v.findViewById(R.id.textViewDescription);
            imageView = (ImageView)v.findViewById(R.id.imageView);
        }
    }
}
