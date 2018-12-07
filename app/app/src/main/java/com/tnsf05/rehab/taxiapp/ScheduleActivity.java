package com.tnsf05.rehab.taxiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {
    private ArrayList<String> scheduleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateList();

        setContentView(R.layout.activity_schedule);
        ListView mListView = (ListView) findViewById(R.id.mylistv);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, (String[]) scheduleList.toArray(new String[scheduleList.size()]));
        mListView.setAdapter(adapter);

    }

    private void populateList() {
        scheduleList = new ArrayList<String>();
        scheduleList.add("Assar, 12:30");
        scheduleList.add("Bengt, 13:00");
        scheduleList.add("Charlie, 13:30");
        scheduleList.add("David, 14:00");
        scheduleList.add("Erik, 14:30");
        scheduleList.add("Felix, 15:00");
        scheduleList.add("Gunnar, 15:30");
        scheduleList.add("Herbert, 16:00");
        scheduleList.add("Isak, 16:30");
        scheduleList.add("Jascha, 17:00");
        scheduleList.add("Karl, 17:30");
        scheduleList.add("Leopold, 18:00");
        scheduleList.add("Max, 18:30");
        scheduleList.add("Niclas, 19:00");
        scheduleList.add("Ola, 19:30");
        scheduleList.add("Peter, 20:00");
        scheduleList.add("Stefan, 20:30");
        scheduleList.add("Tore, 21:00");

        int carIndex;
        for (int i = 0; i < scheduleList.size(); i++) {
            carIndex = i + 1;
            if (carIndex % 3 == 0) {
                carIndex = carIndex - i;
            }
            scheduleList.set(i, scheduleList.get(i) + ", bil " + carIndex);
        }
    }
}
