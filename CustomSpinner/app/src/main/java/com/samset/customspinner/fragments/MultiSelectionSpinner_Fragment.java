package com.samset.customspinner.fragments;


import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.samset.customspinner.R;
import com.samset.customspinner.utils.Contstants;
import com.samset.customspinner.utils.MultiSelectionSpinner;

import java.util.List;

/**
 * Written by Samset
 */
public class MultiSelectionSpinner_Fragment extends Fragment implements View.OnClickListener{

    View view;
    String selectedides;
    String selectionString=null;
    private MultiSelectionSpinner multiSpinner;
    private TextView tv_selectedString,tv_selectedIdes;
    private Button btnDetails;

    public MultiSelectionSpinner_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_multi_selection_spinner, container, false);
        multiSpinner=(MultiSelectionSpinner)view.findViewById(R.id.multi_spinner);
        btnDetails=(Button)view.findViewById(R.id.Submit);
        tv_selectedIdes=(TextView)view.findViewById(R.id.selectedides);
        tv_selectedString=(TextView)view.findViewById(R.id.selectedString);
        btnDetails.setOnClickListener(this);
        setMultiSpinner();
        return view;
    }

    private void setMultiSpinner() {
        multiSpinner.setItems(Contstants.intrestData);

    }

    @Override
    public void onClick(View v)
    {
        //If you want only string
        selectionString = multiSpinner.getSelectedItemsAsString();
        Log.e("Multi","Selecting String "+selectionString);

        // If you want selected ides.This is mostly used when you communicating server
        List<Integer> id = multiSpinner.getSelectedIndices();
        selectedides = Contstants.intrestValue(id);

        tv_selectedString.setText("Selected Strings:: \n"+selectionString);
        tv_selectedIdes.setText("Selected Ides:: \n"+selectedides);

    }
}
