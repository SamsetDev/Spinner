package com.samset.customspinner.fragments;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.samset.customspinner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleSpinnerFragment extends Fragment {

    String[] values = new String[]{
            "Android Cupcake",
            "Android Donut",
            "Android Ecleir",
            "Android Frayo",
            "Android Gingerbread",
            "Android Honycomb",
            "Android Icecreame",
            "Android Jellybean",
            "Android Kitkat",
            "Android Lollypop",
            "Android Marsmolo"
    };
    View view;
    Spinner spinner;
    RelativeLayout layout;
    public SimpleSpinnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_simple_spinner, container, false);
        spinner = (Spinner) view.findViewById(R.id.simple_spinner);
        layout=(RelativeLayout)view.findViewById(R.id.parent);
        setSpinner();
        return view;
    }

    private void setSpinner() {
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, values);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        //set OnItemselected listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(layout, "You click "+values[position], Snackbar.LENGTH_LONG);

                snackbar.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
