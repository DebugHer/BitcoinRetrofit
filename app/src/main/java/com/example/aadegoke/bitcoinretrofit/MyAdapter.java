package com.example.aadegoke.bitcoinretrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Callback;

/**
 * Created by a.adegoke on 5/24/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {
    ArrayList<Data> data;
    Callback<Bcdata> callback;


    public MyAdapter(Callback<Bcdata> callback, ArrayList<Data> data) {
        this.data = data;
        this.callback = callback;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new MyViewholder(view, data);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        Data objectData = data.get(position);
        holder.id.setText(objectData.getId());
        holder.name.setText(objectData.getName());
        holder.symbol.setText(objectData.getSymbol());
        holder.website_slug.setText(objectData.getWebsiteSlug());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
       public TextView id;
       public TextView name;
       public TextView symbol;
       public TextView website_slug;
       public ArrayList<Data> data;
        public MyViewholder(View itemView, ArrayList<Data> data) {

            super(itemView);
            this.data = data;
            id = itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.name);
            symbol = itemView.findViewById(R.id.symbol);
            website_slug = itemView.findViewById(R.id.slug);
        }
    }


}
