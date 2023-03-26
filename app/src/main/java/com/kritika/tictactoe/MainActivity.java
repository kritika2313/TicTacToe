package com.kritika.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        b=findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"enter some value",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i=new Intent(MainActivity.this,gameActivity.class);
                    i.putExtra("Player1",s1);
                    i.putExtra("Player2",s2);
                    startActivity(i);
                }
            }
        });
    }
}