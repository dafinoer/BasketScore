package com.wordpress.dafinoer.javafundamental2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wordpress.dafinoer.javafundamental2.countdown.BasketCase;

public class MainActivity extends AppCompatActivity {
    private BasketCase basketCase = new BasketCase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private TextView getDisplay(){
        TextView textView = (TextView) findViewById(R.id.number_team_a);
        return textView;
    }

    private TextView getDisplayTeamB(){
        TextView textView = (TextView) findViewById(R.id.number_team_b);
        return textView;
    }

    /*
    3 point button for team A
     */
    public void buttonTeamA(View view){
        int getValue = Integer.parseInt(getDisplay().getText().toString());
        getDisplay().setText(basketCase.getPointThree(getValue).toString());
    }

    /*
    5 point button for team b
     */
    public void buttonTeamA5(View view){
        int getValue = Integer.parseInt(getDisplay().getText().toString());
        getDisplay().setText(basketCase.getPoIntFive(getValue).toString());
    }

    /*
    3 point button for team b
     */
    public void buttonTeamB(View view){
        int getValue = Integer.parseInt(getDisplayTeamB().getText().toString());
        getDisplayTeamB().setText(basketCase.getPointThree(getValue).toString());
    }
    /*
    5 point button for team b
     */
    public void buttonTeamB5(View view){
        int getValue = Integer.parseInt(getDisplayTeamB().getText().toString());
        getDisplayTeamB().setText(basketCase.getPoIntFive(getValue).toString());
    }

    public void buttonFreeTeamA(View view){
        getDisplay().setText("0");
    }
    public void buttonFreeTeamB(View view){
        getDisplayTeamB().setText("0");
    }

}
