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

        Intent callingIntent = getIntent();
        Serializable intentAction = callingIntent.getSerializableExtra("Planeta");

        if (intentAction instanceof Serializable)
                handleReceivedObject(callingIntent);
    }

    private void handleReceivedObject(Intent intent){
        planeta = intent.getSerializableExtra("Planeta");
        Planetas planeta1=(Planetas) planeta;

        textViewTitle.setText(planeta1.getTitulo());
        textViewDescription.setText(planeta1.getDescripcion());

    }

    TextView textViewTitle;
    TextView textViewDescription;
    ImageView imageView;
    Serializable planeta;
}
