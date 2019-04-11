package com.example.rodpro.recyclerview_cardview;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class NewCardViewActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_card_view);

        cardView = findViewById(R.id.card_view);
        textView = findViewById(R.id.texto);

        textView.setText("Hellow Card View!!");
        cardView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case (R.id.card_view):
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}
