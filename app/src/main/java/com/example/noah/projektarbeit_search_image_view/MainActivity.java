package com.example.noah.projektarbeit_search_image_view;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView search_city;
    ArrayAdapter<Stadt> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search_city = (ListView) findViewById(R.id.search_city);

        final ArrayList <Stadt> items = initData();

        adapter = new ArrayAdapter<Stadt>(this, android.R.layout.simple_list_item_1, items);
        search_city.setAdapter(adapter);
        search_city.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ImageMain.class);
                String st = String.valueOf(adapter.getItem(3));
                intent.putExtra("city", st);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private ArrayList<Stadt> initData() {
        ArrayList <Stadt> linkedList = new ArrayList<Stadt>();

        Stadt stadt1 = new Stadt("Wien", 189000, 414, 270, new int[]{R.drawable.wien, R.drawable.wien2});
        Stadt stadt2 = new Stadt("Linz", 204000, 95, 266, new int[]{R.drawable.Linz, R.drawable.Linz2});
        Stadt stadt3 = new Stadt("Berlin", 3620000, 891, 110, new int[]{R.drawable.Berlin, R.drawable.Berlin2});
        Stadt stadt4 = new Stadt("London", 8800000, 1572, 105, new int[]{R.drawable.London2});

        linkedList.add(stadt1);
        linkedList.add(stadt2);
        linkedList.add(stadt3);
        linkedList.add(stadt4);

        return linkedList;
    }
}
