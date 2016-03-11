package com.samset.customspinner;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.samset.customspinner.fragments.CustomFragment;
import com.samset.customspinner.fragments.MultiSelectionSpinner_Fragment;
import com.samset.customspinner.fragments.SimpleSpinnerFragment;
import com.samset.customspinner.utils.Contstants;

public class BaseActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        intent = getIntent();

        int input = intent.getIntExtra(Contstants._ID, 0);
        Log.e("Id"," id "+input);
        if (input==0) {
            startTransaction(new SimpleSpinnerFragment());
        } else if (input==1) {
            startTransaction(new CustomFragment());
        } else if (input==2) {
            startTransaction(new MultiSelectionSpinner_Fragment());
        }
    }

    private void startTransaction(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.BaseContainer, fragment);
        fragmentTransaction.commit();
    }
}
