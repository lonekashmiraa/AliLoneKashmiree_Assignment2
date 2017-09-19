package com.example.lonekashmiraa.a1stproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Welcome_screen extends AppCompatActivity {
    TextView Welcometext;//makes sure you change this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Button startBtn = (Button) findViewById(R.id.unlockbutton);   //Associates startBtn with the id Unlockbutton
        Welcometext = (TextView)findViewById(R.id.textView);  //Associates welcome text to textView
        changeText();
        startBtn.setOnClickListener(new OnClickListener() {           //Sets an onClickListener to make button click for intent
            public void onClick(View view) {
                Intent myIntent = new Intent(Welcome_screen.this, Accesscontrol.class);     //Sets intent of button after its clicked to go from 'this', (Welcome Screen) to Accesscontrol.class page
                startActivity(myIntent);  //Starts intent
            }
    });


}

    protected void changeText() {
        // Check which request we're responding to
            // Make sure the request was successful
            if (Accesscontrol.RESULT_OK) { //function for unlocked page when code is inputted correctly
                Welcometext.setText("Welcome to the App! The App is UNLOCKED"); //if Result_OK is true then this will change the original text
                Accesscontrol.RESULT_OK = false; //sets result to false for app to reset at 0 when clicking submit
                //int result = data.getIntExtra("pos");
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.

                // Do something with the contact here (bigger example below)
        }
    }
}


