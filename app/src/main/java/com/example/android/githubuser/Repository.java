package com.example.android.githubuser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.GsonBuilder;

public class Repository extends AppCompatActivity {

    TextView url;
    TextView type;
    TextView siteAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);

        url = (TextView)findViewById(R.id.url);
        type = (TextView)findViewById(R.id.type);
        siteAdmin = (TextView)findViewById(R.id.site_admin);


        User data = new GsonBuilder().create().
                fromJson(this.getIntent().getStringExtra("user"),User.class);

        url.setText("URL : \n" + data.getUrl("https://github.com/simonjefford?tab=repositories"));
        type.setText("Type : "+ data.getType());
        siteAdmin.setText("SiteAdmin : " + data.getSiteAdmin());

    }
}
