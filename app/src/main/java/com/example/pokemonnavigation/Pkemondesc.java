package com.example.pokemonnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pkemondesc extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pkemondesc, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //Bundle bundle = new Bundle();
//        View.OnClickListener clickListener = Navigation.createNavigateOnClickListener
//                (R.id.firstFragment, bundle);


        TextView txt_name = view.findViewById(R.id.txt_name);
        txt_name.setText(getArguments().getString("name"));

        TextView txt_desc = view.findViewById(R.id.txt_desc);
        txt_desc.setText(getArguments().getString("description"));



        super.onViewCreated(view, savedInstanceState);

    }


}
