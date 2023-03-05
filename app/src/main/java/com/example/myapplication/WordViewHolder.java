package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final WordListAdapter mAdapter;
        TextView tvTitle;
        TextView tvDescription;
        ImageView imvDetail;

        Fruit mFruit;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDescription = itemView.findViewById(R.id.tv_detail);
            imvDetail = itemView.findViewById(R.id.imv_detail);

            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
