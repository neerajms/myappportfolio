package com.neerajms99b.neeraj.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openApp(View view){
        Button button = (Button)view;
        Toast.makeText(this,"This will launch "+button.getText().toString()+" app",Toast.LENGTH_SHORT).show();
    }
}
