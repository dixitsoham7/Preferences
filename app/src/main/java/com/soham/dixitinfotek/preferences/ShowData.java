package com.soham.dixitinfotek.preferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        tv1 = (TextView) findViewById(R.id.passwordTextView);
        tv2 = (TextView) findViewById(R.id.screenLockTextView);
        tv3 = (TextView) findViewById(R.id.reminderTextView);

        // creating the object of the shared preferences using the preference manager,
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        // storing inside variables of respective datatypes of the values of the keys passed.
        // defining the default values of the variables
        String password = sp.getString("passwordKey","No Text Data");
        boolean screenLock = sp.getBoolean("screeLockKey",false);
        String reminder = sp.getString("reminderForUpdationKey","No Updates Reminder");

        // setting the text
        tv1.setText("Password:         "+password);
        tv2.setText("Screen Lock:   "+screenLock);
        tv3.setText("Updation:         "+reminder);

    }
}
