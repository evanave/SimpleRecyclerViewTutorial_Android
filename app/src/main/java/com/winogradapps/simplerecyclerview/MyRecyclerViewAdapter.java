package com.winogradapps.simplerecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by evan on 2/5/17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MyCustomClass[] myData;

    public MyRecyclerViewAdapter(MyCustomClass[] myData){
        this.myData = myData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /* Inflate the view */
        MyViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v1 = inflater.inflate(R.layout.my_view_holder_layout, parent, false);
        viewHolder = new MyViewHolder(v1);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        /* This is where you set your data to the different views */
        MyViewHolder viewHolder = (MyViewHolder) holder;
        viewHolder.Title.setText(myData[position].Title);
        viewHolder.SubTitle.setText(myData[position].SubTitle);

    }

    @Override
    public int getItemCount() {
        /* Let's the adapter know how many rows to fill in */
        return myData.length;
    }
}
