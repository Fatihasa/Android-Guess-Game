package com.fatih.guessgame;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber(){

        Random rand = new Random();

        randomNumber= rand.nextInt(20)+1;

    }

    public void guessgame(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        Log.i("entered value",editText.getText().toString());

        int guessNumber = Integer.parseInt(editText.getText().toString());

        if (guessNumber == randomNumber){

            Toast.makeText(this, "Congratulations Try again", Toast.LENGTH_SHORT).show();
            generateRandomNumber();
        }

        else if (guessNumber > randomNumber){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }

        else if  (guessNumber < randomNumber){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }





        Log.i("Random Number", Integer.toString(randomNumber));





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber= rand.nextInt(20)+1;

    }
}
