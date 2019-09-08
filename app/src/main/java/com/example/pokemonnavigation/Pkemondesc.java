package com.example.pokemonnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pkemondesc extends Fragment {

    ImageView img_poke;
    TextView txt_name, txt_type, txt_ability, txt_h, txt_w, txt_desc;
   // Toolbar mActionBarToolbar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pkemondesc, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        super.onViewCreated(view, savedInstanceState);


        img_poke = view.findViewById(R.id.desc_img);
        txt_name = view.findViewById(R.id.txt_name);
        txt_type = view.findViewById(R.id.txt_type);
        txt_ability = view.findViewById(R.id.txt_ability);
        txt_h = view.findViewById(R.id.txt_height);
        txt_w = view.findViewById(R.id.txt_weight);
        txt_desc = view.findViewById(R.id.txt_desc);

//        String uName = getArguments().getParcelable("name");
//        String uImage = getArguments().getParcelable("image");
//        String uType = getArguments().getParcelable("type");
//        String uAbility = getArguments().getParcelable("ability");
//        String uHeight = getArguments().getParcelable("height");
//        String uWeight = getArguments().getParcelable("weight");
//        String uDescription = getArguments().getParcelable("description");
//
//
//        txt_name.setText(uName);
//        Glide.with(this).load(uImage).placeholder(R.drawable.desc_img).into(img_poke);
//
//        txt_type.setText(uType);
//        txt_ability.setText(uAbility);
//        txt_h.setText(uHeight);
//        txt_w.setText(uWeight);
//        txt_desc.setText(uDescription);
//        txt_desc.setMovementMethod(new ScrollingMovementMethod());
//
//        //getSupportActionBar().setTitle("Pokemon Details");
    }


}
