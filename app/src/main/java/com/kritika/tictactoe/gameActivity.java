package com.kritika.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class gameActivity extends AppCompatActivity {
    int c=0;
    int count=0;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btr;
    TextView t1,t2;
    String str1,str2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        bt1=findViewById(R.id.b1);
        bt2=findViewById(R.id.b2);
        bt3=findViewById(R.id.b3);
        bt4=findViewById(R.id.b4);
        bt5=findViewById(R.id.b5);
        bt6=findViewById(R.id.b6);
        bt7=findViewById(R.id.b7);
        bt8=findViewById(R.id.b8);
        bt9=findViewById(R.id.b9);
        btr=findViewById(R.id.btn_rst);

        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        str1=getIntent().getStringExtra("Player1");
        str2=getIntent().getStringExtra("Player2");
        t1.setText(str1);
        t2.setText(str2);

        btr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {
                       reset();
                   }
               },2000);
            }
        });

    }
    public void click(View v){
        Button current_btn=(Button) v;
        if(current_btn.getText().toString().equals("")) {
            count++;
            if (c == 0) {
                current_btn.setText("X");
                c++;
            } else {
                current_btn.setText("O");
                c = 0;
            }
            String bs1 = bt1.getText().toString();
            String bs2 = bt2.getText().toString();
            String bs3 = bt3.getText().toString();
            String bs4 = bt4.getText().toString();
            String bs5 = bt5.getText().toString();
            String bs6 = bt6.getText().toString();
            String bs7 = bt7.getText().toString();
            String bs8 = bt8.getText().toString();
            String bs9 = bt9.getText().toString();

            if (count > 4) {
                if (bs1.equals(bs2) && bs2.equals(bs3) && !bs1.equals("")) {
                    if (bs1.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }reset();
                } else if (bs4.equals(bs5) && bs5.equals(bs6) && !bs4.equals("")) {
                    if (bs4.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }reset();
                } else if (bs7.equals(bs8) && bs8.equals(bs9) && !bs7.equals("")) {
                    if (bs7.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }reset();
                } else if (bs1.equals(bs4) && bs4.equals(bs7) && !bs1.equals("")) {
                    if (bs1.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }reset();
                } else if (bs2.equals(bs5) && bs5.equals(bs8) && !bs2.equals("")) {
                    if (bs2.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }
                    reset();
                } else if (bs3.equals(bs6) && bs6.equals(bs9) && !bs3.equals("")) {
                    if (bs3.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }
                    reset();
                }
                else if (bs1.equals(bs5) && bs5.equals(bs9) && !bs1.equals("")) {
                    if (bs1.equals("X")) {
                        Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();
                    }
                    reset();
                }

            } else if (bs3.equals(bs5) && bs5.equals(bs7) && !bs3.equals("")) {
                if (bs3.equals("X")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "Winner is " + str2, Toast.LENGTH_SHORT).show();

                }
                reset();
            }
            else if(count==9){
                Toast.makeText(this, "Match was Drawn", Toast.LENGTH_SHORT).show();
                reset();
            }

        }

    }


    public void reset(){
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        count=0;
        c=0;

    }
}