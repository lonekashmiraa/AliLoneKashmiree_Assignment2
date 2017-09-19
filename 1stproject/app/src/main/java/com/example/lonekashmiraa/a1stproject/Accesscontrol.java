package com.example.lonekashmiraa.a1stproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Accesscontrol extends AppCompatActivity {
    String code = "";  //decalred code as blank
    TextView codeDis;
    static boolean RESULT_OK = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesscontrol);
        Button one = (Button) findViewById(R.id.button1);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);
        Button four = (Button) findViewById(R.id.button4);
        Button submit = (Button) findViewById(R.id.Submitbutton);
        codeDis = (TextView) findViewById(R.id.textView2);
        submit.setOnClickListener(new View.OnClickListener() {           //Sets an onClickListener to make button click for intent
            public void onClick(View view) {
                // code = findViewById(R.id.textView2).toString();

                if(code.equals("1234")){        //If code = 1234 then the function will run

                    code = "";   // resets code to blank
                    codeDis.setText(code);  //sets textview variable to the code inputted
                    RESULT_OK = true; //sets result to true for the if statement in the welcome screen to run
                    Intent myIntent = new Intent(Accesscontrol.this, Welcome_screen.class);     //Sets intent of button after its clicked to go from 'this', (Access control) to Welcome_screen.class page
                    startActivity(myIntent);  //Starts intent
                }
                else if(!code.equals("1234")){

                    code = "";
                    codeDis.setText(code);
                    Intent myIntent = new Intent(Accesscontrol.this, Welcome_screen.class);     //Sets intent of button after its clicked to go from 'this', (Welcome Screen) to Accesscontrol.class pager
                    startActivity(myIntent);  //Starts intent
                }


            }
        });
        one.setOnClickListener(new View.OnClickListener() {           //Sets an onClickListener to make button usable to input number
            public void onClick(View view) {
                code += "1";  //Inputs 1 into code string
                codeDis.setText(code.toString()); //Inputs 1 into code textview variable
            }
        });
        two.setOnClickListener(new View.OnClickListener() {           //Sets an onClickListener to make button click for intent
            public void onClick(View view) {
                code += "2";

                codeDis.setText(code);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {           //Sets an onClickListener to make button click for intent
            public void onClick(View view) {
                code += "3";
                codeDis.setText(code);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {           //Sets an onClickListener to make button click for intent
            public void onClick(View view) {
                code += "4";
                codeDis.setText(code);
            }
        });



    }
}
