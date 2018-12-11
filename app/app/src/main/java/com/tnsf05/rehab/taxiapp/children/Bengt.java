package com.tnsf05.rehab.taxiapp.children;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.tnsf05.rehab.taxiapp.R;

import java.util.ArrayList;

public class Bengt extends AppCompatActivity {

    private ArrayList<String> scheduleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengt);
        populateList();

        ListView mListView = (ListView) findViewById(R.id.mylistv2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, (String[]) scheduleList.toArray(new String[scheduleList.size()]));
        mListView.setAdapter(adapter);
    }


    private void populateList() {
        scheduleList = new ArrayList<String>();
        scheduleList.add("Bengt Bills");
        scheduleList.add("Tid enligt Schema: 12:30");
        scheduleList.add("Beräknad tid: 12:37");
        scheduleList.add("Chaufför: Bengt-Åke");
        scheduleList.add("Telefonnummer: 0123456789");
    }

}
