package com.example.pg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void openActivity(View v)
    {
        Toast.makeText(this,"Opening Exit page",Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}