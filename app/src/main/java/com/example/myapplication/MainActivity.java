package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
//tạo sự kiện onclick
//tạo xml mới với bố cục như hình,sau khi click vào item thì nhảy qua activity khác
public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<Fruit> mFruitList = Fruit.generateFruit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("text1");
        mWordList.add("text2");
        mWordList.add("text3");
        mWordList.add("text4");
        mWordList.add("text5");
        mWordList.add("text6");
        mWordList.add("text7");
        mWordList.add("text8");
        mWordList.add("text9");
        mWordList.add("text10"); */


        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mFruitList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}