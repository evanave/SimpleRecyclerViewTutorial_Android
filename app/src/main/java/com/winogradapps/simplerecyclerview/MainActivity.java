package com.winogradapps.simplerecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    MyCustomClass[] MyInfo = new MyCustomClass[3];

    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyInfo[0] = new MyCustomClass("Title 0", "SubTitle 0");
        MyInfo[1] = new MyCustomClass("Title 1", "SubTitle 1");
        MyInfo[2] = new MyCustomClass("Title 2", "SubTitle 2");

        myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        fillInRecyclerView();
    }

    public void fillInRecyclerView() {
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(MyInfo);

                            /* Because our recyclerView is in a Linear Layout */
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
