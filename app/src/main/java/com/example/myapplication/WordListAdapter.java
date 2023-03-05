package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{
    private LinkedList<Fruit> mFruitList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<Fruit> fruitList){
        mInflater = LayoutInflater.from(context);
        this.mFruitList = fruitList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Nạp layout cho View biểu diễn phần tử Fruit
        View mItemView = mInflater.inflate(R.layout.item_layout, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Fruit mCurrent = mFruitList.get(position);
        holder.tvTitle.setText(mCurrent.getName());
        holder.tvDescription.setText(mCurrent.getShort_description(mCurrent.getDescription()));
        Picasso.get().load(mFruitList.get(position).getCoverUrl()).into(holder.imvDetail);
        //Glide.with(mInflater.getContext()).load(mCurrent.getCoverUrl()).into(holder.imvDetail);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mInflater.getContext(), DetailActivity.class);
                intent.putExtra("id", holder.getBindingAdapterPosition());
                /*intent.putExtra("Detail", holder.tvDescription.getText().toString());
                intent.putExtra("Title", holder.tvTitle.getText().toString());
                intent.putExtra("ImageDetail", mCurrent.getCoverUrl());*/
                mInflater.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }



}
