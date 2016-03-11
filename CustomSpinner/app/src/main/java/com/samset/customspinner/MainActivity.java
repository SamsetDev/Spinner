package com.samset.customspinner;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.samset.customspinner.fragments.CustomFragment;
import com.samset.customspinner.fragments.SimpleSpinnerFragment;
import com.samset.customspinner.utils.Contstants;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String data[] = {"Simple Spinner", "Custom Spinner", " Multiple selection Spinner"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    startActivity(new Intent(MainActivity.this,BaseActivity.class).putExtra(Contstants._ID,position));


            }
        });


    }


}
