package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final WordListAdapter mAdapter;
        TextView wordItemView;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);

            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
