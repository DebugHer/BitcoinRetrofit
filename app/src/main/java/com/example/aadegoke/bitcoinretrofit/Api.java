package com.example.aadegoke.bitcoinretrofit;

import java.util.List;

import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by a.adegoke on 5/23/2018.
 */

public interface Api {

    String BASE_URL = "https://api.coinmarketcap.com/v2/";

    @GET("listings/")
    Call<Bcdata> getBitcoinData();
}
