package com.example.pokemonnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pkemondesc extends Fragment {


    public Pkemondesc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pkemondesc, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

     //   Toast.makeText(getActivity().getApplicationContext(),getArguments().getString("test1"),Toast.LENGTH_LONG)
       //         .show();

        Bundle bundle = new Bundle();
     //   bundle.putString();

        View.OnClickListener clickListener = Navigation.createNavigateOnClickListener
                (R.id.firstFragment,bundle);

        //Button btnSecond = view.findViewById(R.id.btnSecondFrag);
      //  btnSecond.setOnClickListener(clickListener);


        super.onViewCreated(view, savedInstanceState);
    }
}
