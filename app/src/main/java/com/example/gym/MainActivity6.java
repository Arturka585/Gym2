package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button next1 = (Button)findViewById(R.id.next1);
        ImageButton ne= (ImageButton)findViewById(R.id.ne);
        ImageButton kee = (ImageButton)findViewById(R.id.kee);
        ImageButton ad = (ImageButton)findViewById(R.id.ad);

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ne.setImageResource(R.drawable.b9c);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11);
            }
        });

        ne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10c);
                ad.setImageResource(R.drawable.b11);
                return false;
            }
        });

        ne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11c);
                return false;
            }
        });

        kee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10c);
                ad.setImageResource(R.drawable.b11);
            }
        });

        kee.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9c);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11);
                return false;
            }
        });

        kee.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11c);
                return false;
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11c);
            }
        });

        ad.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9c);
                kee.setImageResource(R.drawable.b10);
                ad.setImageResource(R.drawable.b11);
                return false;
            }
        });

        ad.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ne.setImageResource(R.drawable.b9);
                kee.setImageResource(R.drawable.b10c);
                ad.setImageResource(R.drawable.b11);
                return false;
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(i);finish();
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}