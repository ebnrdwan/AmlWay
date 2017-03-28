package com.example.android.amlway2.logic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.android.amlway2.R;
import com.example.android.amlway2.adapters.adapterdata;
import com.example.android.amlway2.models.billModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

         recyclerView = (RecyclerView) findViewById(R.id.recMain);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        FloatingActionButton actionButton = (FloatingActionButton) findViewById(R.id.mainAction);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,addingNewBill.class));
            }
        });
        List<billModel> mylist = new ArrayList<>();
//        String date, String customerName, String employeeName, String from, String to, double price, double weight, String element, String type, String quantity
        mylist.add(new billModel("23/2","elbarakah","ahmed","store1","store2",2.3,22.2,"cheese","sell",3.3));
        adapterdata adapter = new adapterdata(MainActivity.this,mylist);
        recyclerView.setAdapter(adapter);

    }
}
