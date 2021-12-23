package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initRecyclerView() {
        mrecyclerView = findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyAll();
    }


    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.boyy,"Ali","How are you?","10:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Aslam","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Kashif","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"salma","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Suleman","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"basit","I am Don","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Qasim","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"Binish","How ?","11:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Hamail","How are you?","10:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"sarim","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Sam","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Dilawar","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Sameer","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Karan","I am Don","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Asim","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boyy,"Nawaz","How ?","11:55 pm","_______________________________________"));




    }

    }