package com.example.android.githubuser;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sugianto on 2/15/2018.
 */

public class ApiClient {

    public static final String URL = "https://api.github.com/";
    public static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit  = new Retrofit.Builder().baseUrl(URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
