package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton male = (ImageButton)findViewById(R.id.male);
        ImageButton fermale = (ImageButton)findViewById(R.id.fermale);
        Button next = (Button)findViewById(R.id.next);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male.setImageResource(R.drawable.malec);
                a=1;
                fermale.setImageResource(R.drawable.fermale);
            }
        });

        male.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                male.setImageResource(R.drawable.male);
                a=2;
                fermale.setImageResource(R.drawable.fermalec);
                return false;
            }
        });

        fermale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fermale.setImageResource(R.drawable.fermalec);
                a=2;
                male.setImageResource(R.drawable.male);
            }
        });

        fermale.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                fermale.setImageResource(R.drawable.fermale);
                a=1;
                male.setImageResource(R.drawable.malec);
                return false;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a==1){
                    Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                    startActivity(i);finish();
                }else{if (a==2){
                    Intent i = new Intent(MainActivity3.this,MainActivity5.class);
                    startActivity(i);finish();
                }

                }

            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}