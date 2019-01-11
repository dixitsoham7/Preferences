package com.soham.dixitinfotek.preferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button saveBtn, showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveBtn = (Button) findViewById(R.id.button1); //typecasting var to button type
        showBtn = (Button) findViewById(R.id.button2);
    }

    // method called when settings button is pressed once.
    public void storeDataEntered(View view) {
        Intent intent = new Intent(this, SettingsActivity.class); //calling SettingsActivity
        startActivity(intent);
    }

    // method called when show data button is pressed once.
    public void showDataCreated(View view) {

        Intent intent = new Intent(this, ShowData.class); //calling ShowData Activity
        startActivity(intent);
    }
}
