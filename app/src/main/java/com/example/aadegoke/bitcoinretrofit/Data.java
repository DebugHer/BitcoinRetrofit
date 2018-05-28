package com.example.aadegoke.bitcoinretrofit;

import android.icu.text.StringSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by a.adegoke on 5/23/2018.
 */

public class Data {
    @SerializedName("id")
    @Expose
     private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("website_slug")
    @Expose
    private String websiteSlug;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getWebsiteSlug() {
        return websiteSlug;
    }
}
