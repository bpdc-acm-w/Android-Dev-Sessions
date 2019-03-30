package com.sabihashaik.samplecookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.CookieButton);
         t1 =(TextView) findViewById(R.id.CookieText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //runs when button clicked
                count= count+1;
                t1.setText("Count"+count);
            }
        });

        /*ImageView imgv = (ImageView) findViewById(R.id.CookieImageView);
        final TextView countView = findViewById(R.id.countView);
        Button cbtn = (Button) findViewById(R.id.CookieButton);
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countView.setText("Count "+count);
            }
        });*/


    }
}
