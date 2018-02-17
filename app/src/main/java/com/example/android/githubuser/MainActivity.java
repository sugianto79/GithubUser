package com.example.android.githubuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    ArrayAdapter<String> adapter;
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String username[] = {"Simmon Jefford", "Josh", "Steve Dekorte", "Chneukirchen",
                "CheapRoc", "Technomancy", "Kenphused", "Rubyist", "Ogc", "Lazyatom", "Jdhuntington",
                "Nwebb", "Nsutton", "Sevenwire", "Brandonarbini"};

        lvItem = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.input_search);
        adapter = new ArrayAdapter<String>(this, R.layout.list_user, R.id.user, username);
        lvItem.setAdapter(adapter);

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                MainActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {

            }

            @Override
            public void afterTextChanged(Editable arg0) {

                lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        if (position == 0) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 1) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 1);
                        }
                        if (position == 2) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 2);
                        }
                        if (position == 3) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 3);
                        }
                        if (position == 4) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 4);
                        }
                        if (position == 5) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 5);
                        }
                        if (position == 6) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 6);
                        }
                        if (position == 7) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 7);
                        }
                        if (position == 8) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 8);
                        }
                        if (position == 9) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 9);
                        }
                        if (position == 10) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 10);
                        }
                        if (position == 11) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 11);
                        }
                        if (position == 12) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 12);
                        }
                        if (position == 13) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 13);
                        }
                        if (position == 14) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 14);
                        }
                        if (position == 15) {
                            Intent myIntent = new Intent(view.getContext(), UserDetail.class);
                            startActivityForResult(myIntent, 15);
                        }
                    }
                });
            }
        });
    }
}








