package com.example.teamcharizard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class LandingPageActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);



        Button start_game_button =  findViewById(R.id.start_game_button);
        start_game_button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), StartNewGameActivity.class);
        startActivity(intent);

    }


    public void selectFrag(View view){

        Fragment fr;

        if(view == findViewById(R.id.team_stats_button)){
            fr = new MainActivityTeamStatsFragment();
        }else{
            fr = new MainActivityViewGamesFragment();
        }

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment, fr);
        transaction.commit();
    }

}



