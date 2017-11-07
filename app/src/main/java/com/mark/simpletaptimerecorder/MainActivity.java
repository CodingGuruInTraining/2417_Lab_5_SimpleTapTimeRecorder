package com.mark.simpletaptimerecorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Makes variables to hold widgets.
    Button clickBtn;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defines widgets.
        clickBtn = (Button) findViewById(R.id.click_button);
        mListView = (ListView) findViewById(R.id.stamplist);

        // Creates a custom ArrayAdapter.
        final StampAdapter stampAdapter = new StampAdapter(this, R.layout.stamp_item);
        // Sets the ListView's adapter.
        mListView.setAdapter(stampAdapter);

        // Button click event.
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creates new Stamp object and adds it to the adapter.
                Stamp newStamp = new Stamp();
                stampAdapter.add(newStamp);
                stampAdapter.notifyDataSetChanged();
            }
        });
    }
}
