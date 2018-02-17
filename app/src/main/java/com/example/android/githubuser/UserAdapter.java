package com.example.android.githubuser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by sugianto on 2/16/2018.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    List<User> users;
    Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row, parent, false);

        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(final UserHolder holder, final int position) {
        holder.login.setText(users.get(position).getLogin());
        holder.id.setText(users.get(position).getId());


        Picasso.with(holder.itemView.getContext())
                .load("https://avatars2.githubusercontent.com/u/140?v=4" +users.get(position).getAvatar())
                .into(holder.foto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User data = users.get(position);
                Intent i = new Intent(holder.itemView.getContext(), Repository.class);
                i.putExtra("user", new GsonBuilder().create().toJson(data));
                holder.itemView.getContext().startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
    class UserHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView login, id, url,type, siteAdmin;
        public UserHolder(View itemView) {
            super(itemView);

            foto = (ImageView)itemView.findViewById(R.id.avatar_url);
            login = (TextView)itemView.findViewById(R.id.login);
            url = (TextView)itemView.findViewById(R.id.url);
            type = (TextView)itemView.findViewById(R.id.type);
            siteAdmin = (TextView)itemView.findViewById(R.id.site_admin)  ;
            id = (TextView)itemView.findViewById(R.id.id);
        }
    }
}
