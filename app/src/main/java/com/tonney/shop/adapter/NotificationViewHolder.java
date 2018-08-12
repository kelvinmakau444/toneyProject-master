package com.tonney.shop.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tonney.shop.R;

public class NotificationViewHolder extends RecyclerView.ViewHolder{

    public TextView notificationName;
    public TextView notificationDescription;
    public TextView notificationDuration;
    public View view;


    public NotificationViewHolder(View itemView) {
        super(itemView);

        notificationName = (TextView)itemView.findViewById(R.id.notification_name);
        notificationDescription = (TextView)itemView.findViewById(R.id.notification_description);
        notificationDuration = (TextView)itemView.findViewById(R.id.notification_duration);
        view = itemView;
    }
}
