package com.tnsf05.rehab.taxiapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NotificationHistory extends ListActivity {

    String children[] = { "Bengt", "Filip", "Lars"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, children));
    }

    @Override
    protected void onListItemClick(ListView list, View view, int position, long id){
        super.onListItemClick(list,view,position,id);
        String testName = children[position];
        try{
            Class c = Class.forName("com.tnsf05.rehab.taxiapp.children." + testName);
            Intent intent = new Intent(this, c);
            startActivity(intent);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
