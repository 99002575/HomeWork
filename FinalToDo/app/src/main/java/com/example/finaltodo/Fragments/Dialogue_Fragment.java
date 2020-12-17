package com.example.finaltodo.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import com.example.finaltodo.R;

public class Dialogue_Fragment extends DialogFragment {
    Button button;
    EditText catName;
    String value;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialogue_, container, false);

        button = view.findViewById(R.id.button);
        catName = view.findViewById(R.id.category);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Added", Toast.LENGTH_SHORT).show();
                value = catName.getText().toString();
                Toast.makeText(getActivity(),value, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
