package com.example.aadegoke.bitcoinretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> mydata;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        //Creation of the retrofit instance
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinmarketcap.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Building the Api interface
        Api api = retrofit.create(Api.class);



        //Making a call to the api
        Call<Bcdata> call = api.getBitcoinData();

        call.enqueue(new Callback<Bcdata>() {
            @Override
            public void onResponse(Call<Bcdata> call, Response<Bcdata> response) {
                mydata = response.body().getData();
                RecyclerView recyclerView =  findViewById(R.id.rv);
                LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
                DividerItemDecoration decoration = new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL);
               recyclerView.addItemDecoration(decoration);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(new MyAdapter(this, mydata));

            }

            @Override
            public void onFailure(Call<Bcdata> call, Throwable t) {

            }
        });


    }
}
