package com.example.bhautik.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView xCoord = (TextView) findViewById(R.id.textView1);
        final TextView yCoord = (TextView) findViewById(R.id.textView2);
        final Button button = (Button) findViewById(R.id.button);
        final View touchView = findViewById(R.id.button);
        touchView.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                final int action = event.getAction();
                switch (action & MotionEvent.ACTION_MASK) {

                    case MotionEvent.ACTION_DOWN: {
                        button.setX(Float.parseFloat((String.valueOf((int) event.getY()))));
                        yCoord.setText(String.valueOf((int) event.getY()));
                        break;
                    }

                    case MotionEvent.ACTION_MOVE:{
                        button.setX(Float.parseFloat(String.valueOf((int) event.getY())));
                        yCoord.setText(String.valueOf((int) event.getY()));
                        xCoord.setText(String.valueOf((int) event.getX()));
                        break;
                    }
                }
                return true;

            }

        });
    }
}
