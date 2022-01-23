package com.example.mobilecomputing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_click(View v){
        TextView tv = findViewById(R.id.msg);
        counter += 1;
        tv.setText("counter value: " + counter);

        Toast toast = Toast.makeText(this, "This is my toast message", Toast.LENGTH_LONG);
        toast.show(); //code for toast msg
    }
}