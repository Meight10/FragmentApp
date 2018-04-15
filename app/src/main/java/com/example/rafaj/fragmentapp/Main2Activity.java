package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewTitle = findViewById(R.id.title);
        textViewDescription = findViewById(R.id.description);

        imageViewPlaneta = findViewById(R.id.planetImage);

        Intent callingIntent = getIntent();
        Serializable intentAction = callingIntent.getSerializableExtra("Planeta");

        if (intentAction instanceof Serializable)
                handleReceivedObject(callingIntent);
    }

    private void handleReceivedObject(Intent intent){
        planetaSerializable = intent.getSerializableExtra("Planeta");
        planeta = (Planetas) planetaSerializable;

        textViewTitle.setText(planeta.getTitulo());
        textViewDescription.setText(planeta.getDescripcion());

        imageViewPlaneta.setImageResource(planeta.getImageHashMap());

    }

    TextView textViewTitle;
    TextView textViewDescription;

    ImageView imageViewPlaneta;

    Planetas planeta;
    Serializable planetaSerializable;
}
