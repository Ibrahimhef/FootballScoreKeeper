package com.example.scorekeeper;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int defGoalsAll=0;
    int defCardsAll=0;
    int team1Goals=0;
    int team2Goals=0;
    int redCards1=0;
    int redCards2=0;
    int yCards1=0;
    int yCards2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstTeamGoal(View view){
        team1Goals++;
        TextView firstTeamGoals = (TextView) findViewById(R.id.score_first_team);
        firstTeamGoals.setText(""+ team1Goals);
    }
    public void scoundTeamGoal(View view){
        team2Goals++;
        TextView scoundTeamGoals = (TextView) findViewById(R.id.score_secound_team);
        scoundTeamGoals.setText(""+ team2Goals);
    }
    //maximum number of yellow cards is 16
    //maximum number of yellow cards is 4
    public void yellowCardFirstTeam(View view){
        if (yCards1 < 16) {
            yCards1++;
            TextView firstTeamYCards = (TextView) findViewById(R.id.yelloy_cards_first);
            firstTeamYCards.setText("" + yCards1);
        }
    }
    public void yellowCardSecoundTeam(View view){
        if (yCards2 < 16) {
            yCards2++;
            TextView secoundTeamYCards = (TextView) findViewById(R.id.yelloy_cards_second);
            secoundTeamYCards.setText("" + yCards2);
        }
    }
    public void redCardFirstTeam(View view){
        if(redCards1 < 4) {
            redCards1++;
            TextView firstTeamRCards = (TextView) findViewById(R.id.red_cards_first);
            firstTeamRCards.setText("" + redCards1);
        }
    }
    public void redCardSecoundTeam(View view){
        if (redCards2 < 4) {
            redCards2++;
            TextView secoundTeamRCards = (TextView) findViewById(R.id.red_cards_second);
            secoundTeamRCards.setText("" + redCards2);
        }
    }
    public void rest(View view){
        TextView firstTeamGoals = (TextView) findViewById(R.id.score_first_team);
        TextView scoundTeamGoals = (TextView) findViewById(R.id.score_secound_team);
        TextView firstTeamYCards = (TextView) findViewById(R.id.yelloy_cards_first);
        TextView secoundTeamYCards = (TextView) findViewById(R.id.yelloy_cards_second);
        TextView firstTeamRCards = (TextView) findViewById(R.id.red_cards_first);
        TextView secoundTeamRCards = (TextView) findViewById(R.id.red_cards_second);
        firstTeamGoals.setText(""+ defGoalsAll);
        scoundTeamGoals.setText(""+ defGoalsAll);
        firstTeamYCards.setText(""+ defCardsAll);
        secoundTeamYCards.setText(""+ defCardsAll);
        firstTeamRCards.setText(""+ defCardsAll);
        secoundTeamRCards.setText(""+ defCardsAll);
        team1Goals=0;
        team2Goals=0;
        redCards1=0;
        redCards2=0;
        yCards1=0;
        yCards2=0;
    }

}
