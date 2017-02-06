package com.winogradapps.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by evan on 2/5/17.
 */

                        /* Extend RecyclerView.ViewHolder */
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView Title, SubTitle;

    public MyViewHolder(View viewHolder) {
        super(viewHolder);

        /* Title and Subtitle will be referenced in the adapter */
        Title = (TextView) viewHolder.findViewById(R.id.Title);
        SubTitle = (TextView) viewHolder.findViewById(R.id.SubTitle);
    }
}
