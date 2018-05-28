package com.example.aadegoke.bitcoinretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by a.adegoke on 5/23/2018.
 */

public class Bcdata {
@SerializedName("data")
@Expose
ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public Bcdata(ArrayList<Data> data) {
        this.data = data;
    }

//    public ArrayList<Data> getBitcoin() {
//        return data;
//    }
//
//    public void setBitcoin(ArrayList<Data> data) {
//        this.data = data;
//    }
}
