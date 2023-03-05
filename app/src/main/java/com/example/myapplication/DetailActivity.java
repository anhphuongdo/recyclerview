package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvDescription;
    ImageView imvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tv_detail_title);
        tvDescription = findViewById(R.id.tv_detail_description);
        imvDetail = findViewById(R.id.imv_detail);


        Intent intent = getIntent();
        int id = (int) intent.getIntExtra("id", 0);
        tvTitle.setText(Fruit.getFruitFromId(id).getName());
        tvDescription.setText(Fruit.getFruitFromId(id).getDescription());
        Picasso.get().load(Fruit.getFruitFromId(id).getCoverUrl()).into(imvDetail);
        //Glide.with(this).load(Fruit.getFruitFromId(id).getCoverUrl()).into(imvDetail);
    }
}