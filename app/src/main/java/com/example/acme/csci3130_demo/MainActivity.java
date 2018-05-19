package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Mybutton = (Button) findViewById(R.id.Mybutton);
        final TextView Show = (TextView)findViewById(R.id.show);
        final EditText text = (EditText) findViewById(R.id.text);

        Mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Show.setText(text.getText());
            }
        });


    }
}
