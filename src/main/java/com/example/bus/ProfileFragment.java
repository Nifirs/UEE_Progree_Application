package com.example.bus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ProfileFragment extends Fragment {

    private Spinner spinner;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        String [] values =
                {"2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028"};
        Spinner spinner = (Spinner) view.findViewById(R.id.year);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        String [] value =
                {"01","02","03","04","05","06","07","08","09","10","11","12"};
        Spinner spinne = (Spinner) view.findViewById(R.id.month);
        ArrayAdapter<String> adapte = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, value);
        adapte.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinne.setAdapter(adapte);


        return view;
    }


}
