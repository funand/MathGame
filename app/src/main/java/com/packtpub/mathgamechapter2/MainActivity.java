package com.packtpub.mathgamechapter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);

//        final Button buttonQuit = (Button) findViewById(R.id.buttonQuit);
//        buttonQuit.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonPlay:
                Intent i;
                i = new Intent(this, GameActivity.class);
                startActivity(i);
                break;

//            case R.id.buttonQuit:
//                Toast.makeText(getApplicationContext(), "This is Quit", Toast.LENGTH_SHORT).show();
//                break;
        }

    }




}
