package com.example.crickspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class UserScreen extends AppCompatActivity implements View.OnClickListener {

    Button createTeam;
    Button chellange;
    Button player;
    Button statics;
    Button scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_screen);

        createTeam = (Button)findViewById(R.id.teamcreate);
        createTeam.setOnClickListener(this);

        chellange = (Button)findViewById(R.id.chellange);
        chellange.setOnClickListener(this);

        player = (Button)findViewById(R.id.players);
        player.setOnClickListener(this);

        statics = (Button)findViewById(R.id.statics);
        statics.setOnClickListener(this);

        scores = (Button)findViewById(R.id.scores);
        scores.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.teamcreate:
                openCreateTeam();
                break;

            case R.id.chellange:
                break;
            case R.id.players:
                break;

            case R.id.statics:
                break;

            case R.id.scores:
                break;
        }
    }

    private void openCreateTeam() {
        Intent intent = new Intent(this,Create_Team.class);
        startActivity(intent);
    }
}
