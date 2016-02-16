package com.example.bhautik.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class
        MainActivity extends AppCompatActivity implements View.OnTouchListener {
    ViewGroup _root;

    Button button ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _root = (ViewGroup) findViewById(R.id.root);
       button  = (Button)findViewById(R.id.button);
        button.setOnTouchListener(this);


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
                button.setX(X - _xDelta-75);
       //         view.setLayoutParams(layoutParams);
                break;
        }
        _root.invalidate();
        return true;
    }
}