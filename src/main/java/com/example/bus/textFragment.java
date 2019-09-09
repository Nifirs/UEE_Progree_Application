package com.example.bus;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class textFragment extends Fragment {

    String[] name={" "," "," "," "};
    int [] image={R.drawable.rootb,R.drawable.busbc,R.drawable.rootb,R.drawable.busbc};


    Context c;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layoutpassword, container, false);

        ListView li=(ListView)v.findViewById(R.id.listViewPassword);
        li.setAdapter(new PasswordAdapter(getActivity(),R.layout.passwordlay,name));
        return v;
        // now set our resources on views

    }

    class PasswordAdapter extends ArrayAdapter {

        public PasswordAdapter(Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=((Activity)getContext()).getLayoutInflater().inflate(R.layout.passwordlay,null);
            TextView txt1 = (TextView) v.findViewById(R.id.textViewpasslay);
            txt1.setText(name[position]);
            ImageView img = (ImageView) v.findViewById(R.id.imageViewpasslay);
            img.setBackgroundResource(image[position]);

            return v;
        }
    }
}

