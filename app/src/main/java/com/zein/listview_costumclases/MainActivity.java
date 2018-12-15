package com.zein.listview_costumclases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] fruitName = {"Manggo","Banana","Water Melon","Grapes","Kiwi","Apple"};
    String[] desc = {"This is Manggo", "This is Banana", "This is Water Melon", "This is Grapes", "This is Kiwi", "This is Apples"};
    int[] images = {R.drawable.gambar_1,R.drawable.gambar_1,R.drawable.gambar_1,R.drawable.gambar_1,R.drawable.gambar_1,R.drawable.gambar_1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        CostumListView costumListView =  new CostumListView(this, fruitName, desc, images);
        listView.setAdapter(costumListView);

    }
}
