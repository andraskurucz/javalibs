package com.firstlib.andraskurucz.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firstlib.andraskurucz.date.DateChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.date);
        DateChecker dateChecker = new DateChecker();
        textView.setText(dateChecker.getDate());
    }
}
