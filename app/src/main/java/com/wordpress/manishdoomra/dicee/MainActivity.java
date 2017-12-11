package com.wordpress.manishdoomra.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.rollDice);
        final ImageView leftImage = findViewById(R.id.leftDice);
        final ImageView rightImage = findViewById(R.id.rightDice);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int leftDiceNumber = randomNumberGenerator.nextInt(6);
                int rightDiceNumber = randomNumberGenerator.nextInt(6);
                //Log.d("Dicee", ""+number1+","+number2);
                leftImage.setImageResource(diceArray[leftDiceNumber]);
                rightImage.setImageResource(diceArray[rightDiceNumber]);
            }
        });
    }
}
