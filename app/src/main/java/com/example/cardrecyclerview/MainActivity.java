package com.example.cardrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardrecyclerview.cardmodel.cardmodel;
import com.example.cardrecyclerview.mycustomadapter.mycustomadapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    mycustomadapter mycustomadapter;
    List<cardmodel>cardmodelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        cardmodelList=new ArrayList<>();

        cardmodel a1=new cardmodel("app1",R.drawable.android,20);
        cardmodel a2=new cardmodel("app2",R.drawable.android,250);
        cardmodel a3=new cardmodel("app12",R.drawable.android,230);
        cardmodel a4=new cardmodel("app14",R.drawable.android,200);
        cardmodel a5=new cardmodel("app17",R.drawable.android,250);
        cardmodel a6=new cardmodel("app13",R.drawable.android,207);
        cardmodel a7=new cardmodel("app3",R.drawable.android,2440);


        cardmodelList.add(a1);
        cardmodelList.add(a2);
        cardmodelList.add(a3);
        cardmodelList.add(a4);
        cardmodelList.add(a5);
        cardmodelList.add(a6);
        cardmodelList.add(a7);

        mycustomadapter = new mycustomadapter(cardmodelList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mycustomadapter);
    }
}