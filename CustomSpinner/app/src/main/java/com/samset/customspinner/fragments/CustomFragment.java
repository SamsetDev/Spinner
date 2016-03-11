package com.samset.customspinner.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.samset.customspinner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomFragment extends Fragment {
    Spinner spinner;
    String data[];
    View view;
    public CustomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_custom, container, false);
        spinner=(Spinner)view.findViewById(R.id.cust_spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.planets_array, R.layout.customspinner_item);
        spinner.setAdapter(adapter);
        adapter.setDropDownViewResource(R.layout.dropdown_custom_item);

        return view;
    }

}
