package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        i = new Intent(this, profitCategories.class);
        startActivity(i);
    }
}