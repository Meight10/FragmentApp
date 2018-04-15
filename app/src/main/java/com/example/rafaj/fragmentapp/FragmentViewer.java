package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        textViewTitle = view.findViewById(R.id.titleV);
        textViewDescription = view.findViewById(R.id.descriptionV);

        imageViewPlaneta = view.findViewById(R.id.planetImageV);

        Bundle bundle = this.getArguments();

        if(bundle != null){
            planetaSerializable = bundle.getSerializable("Planeta");
            planeta = (Planetas)planetaSerializable;

            textViewTitle.setText(planeta.getTitulo());
            textViewDescription.setText(planeta.getDescripcion());

            imageViewPlaneta.setImageResource(planeta.getImageHashMap());


        }

        return view;
    }

    TextView textViewTitle;
    TextView textViewDescription;

    ImageView imageViewPlaneta;

    ImageView imageView;
    Serializable planetaSerializable;
    Planetas planeta;


}
