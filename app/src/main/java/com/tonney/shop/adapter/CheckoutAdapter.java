package com.tonney.shop.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tonney.shop.R;
import com.tonney.shop.entity.CartObject;

import java.util.List;

public class CheckoutAdapter extends RecyclerView.Adapter<CheckoutViewHolder>{

    private List<CartObject> checkoutList;
    private Context context;

    public CheckoutAdapter(Context context, List<CartObject> checkoutList) {
        this.context = context;
        this.checkoutList = checkoutList;
    }

    @Override
    public CheckoutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.checkout_layout, parent, false);
        return new CheckoutViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(CheckoutViewHolder holder, int position) {
        CartObject cartObject = checkoutList.get(position);
        holder.checkoutName.setText(cartObject.getName());
        holder.checkoutQuantity.setText(String.valueOf(cartObject.getQuantity()) + " x");
        holder.checkoutPrice.setText("Ksh" + String.valueOf(cartObject.getPrice()) + "0");
    }

    @Override
    public int getItemCount() {
        return checkoutList.size();
    }
}
