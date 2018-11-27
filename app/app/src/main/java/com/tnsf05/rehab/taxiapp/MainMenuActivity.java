package com.tnsf05.rehab.taxiapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuActivity extends ListActivity {

    String tests[] = { "MapActivity", "PushActivity","ScheduleActivity"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests));
    }

    @Override
    protected void onListItemClick(ListView list, View view, int position, long id){
        super.onListItemClick(list,view,position,id);
        String testName = tests[position];
        try{
            Class c = Class.forName("com.tnsf05.rehab.taxiapp." + testName);
            Intent intent = new Intent(this, c);
            startActivity(intent);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
