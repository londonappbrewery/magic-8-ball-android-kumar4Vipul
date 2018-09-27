package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Tv=findViewById(R.id.Text_view);
        Button AskButton=findViewById(R.id.ask_Button);
        final ImageView Image= findViewById(R.id.imageone);
        final int[] array={R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,R.drawable.ball5};

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator= new Random();
                int rand =randomNumberGenerator.nextInt(3);
//                Toast.makeText(MainActivity.this,"random number is"+rand,Toast.LENGTH_LONG).show();
                Image.setImageResource(array[rand+1]);


            }
        });


    }
}
