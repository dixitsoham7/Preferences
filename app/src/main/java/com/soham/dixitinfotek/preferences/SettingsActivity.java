package com.soham.dixitinfotek.preferences;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // creating the object of the SettingsScreen class mentioned below of type Fragment.
        Fragment fragment = new SettingsScreen();
        // creating the object of the FragmentTransaction and starting the Transaction using the fragment manager.
        FragmentTransaction ftr = getFragmentManager().beginTransaction();

        // if we are opening the app for the first time then this condition satisfies.
        if (savedInstanceState == null) {
            ftr.add(R.id.linear_layout_settings,fragment,"preference_screen_layout");
            ftr.commit();
        }
        // if we have earlier made some changes in the app then.
        else {
            fragment.getFragmentManager().findFragmentByTag("preference_screen_layout");
        }
    }

    public static class SettingsScreen extends PreferenceFragment {
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // adding the preference screen from the resource in the xml directory created before.
            addPreferencesFromResource(R.xml.preference_screen_layout);
        }
    }
}
