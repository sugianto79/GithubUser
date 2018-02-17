package com.example.android.githubuser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetail extends AppCompatActivity {

    RecyclerView mView;
    UserAdapter adapter;
    RecyclerView.LayoutManager manager;
    List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        mView = (RecyclerView)findViewById(R.id.rv_user);
        manager = new LinearLayoutManager(UserDetail.this);
        mView.setLayoutManager(manager);
        load();

    }
    private void load() {
        ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<List<User>> call = api.getUser();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                users = response.body();
                adapter = new UserAdapter(users, UserDetail.this);
                mView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}
