package com.example.android.githubuser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sugianto on 2/15/2018.
 */

public interface ApiInterface {

    @GET ("users?since=135")
    Call<List<User>> getUser();
}
