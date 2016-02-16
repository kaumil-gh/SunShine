package com.example.bhautik.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class
        MainActivity extends AppCompatActivity implements View.OnTouchListener {
    ViewGroup _root;

    ImageButton imageButton;
    Button button ;
    Button button1 ;
    Button button2;
    Button button3 ;
    Button button4 ;
    Button button5 ;
    Button button6 ;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _root = (ViewGroup) findViewById(R.id.root);

        imageButton = (ImageButton)findViewById(R.id.imageButton);

        button1  = (Button)findViewById(R.id.button1);
        button2  = (Button)findViewById(R.id.button2);
        button3  = (Button)findViewById(R.id.button3);
        button4  = (Button)findViewById(R.id.button4);
        button5  = (Button)findViewById(R.id.button5);
        button6  = (Button)findViewById(R.id.button6);

        imageButton.setOnTouchListener(this);

        button1.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button1.setVisibility(View.INVISIBLE);

                    }


                });


        button2.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button2.setVisibility(View.INVISIBLE);

                    }


                });


        button3.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button3.setVisibility(View.INVISIBLE);

                    }


                });


        button4.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button4.setVisibility(View.INVISIBLE);

                    }


                });


        button5.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button5.setVisibility(View.INVISIBLE);

                    }


                });


        button6.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        button6.setVisibility(View.INVISIBLE);

                    }


                });



   /*     Button _view = new Button(this);
        _view.setText("my button.");
        _view.setHeight(0);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(200, 75);
        layoutParams.leftMargin = 50;
        layoutParams.topMargin = 550;
        layoutParams.bottomMargin = 0;
        layoutParams.rightMargin = -250;
        _view.setLayoutParams(layoutParams);

        _view.setOnTouchListener(this);
        _root.addView(_view);
        */
    }





    public boolean onTouch(View view, MotionEvent event) {
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        int _xDelta = 0 ;
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_MOVE:
        //        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
       //         layoutParams.leftMargin = X - _xDelta-75;
                imageButton.setX(X - _xDelta - 65);
        //        view.setLayoutParams(layoutParams);
                break;
        }
        _root.invalidate();
        return true;
    }
}