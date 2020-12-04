package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
SharedPreferences sPrefs;
int a=0;

    final String SAVED_TEXT = "saved_text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        EditText height = (EditText)findViewById(R.id.height);
        EditText weight = (EditText)findViewById(R.id.weight);
        Button save = (Button)findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                    a = 1;
                    startActivity(intent);

                    if ( a == 1) {
                        intent = new Intent(MainActivity7.this,MainActivity8.class);
                        startActivity(intent);
                    }else {
                        intent = new Intent(MainActivity7.this, MainActivity.class);
                        startActivity(intent);
                    }

                } catch (Exception e) {

                }
                switch (v.getId()) {
                    case R.id.save:
                        height();
                        weight();
                        break;
                    default:
                        break;

                }
            }

            private void weight() {
                sPrefs = getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor ed = sPrefs.edit();
                ed.putString(SAVED_TEXT, weight.getText().toString());
                ed.commit();
                Toast.makeText(MainActivity7.this, "Saved", Toast.LENGTH_SHORT).show();
            }

            private void height() {
                sPrefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                SharedPreferences.Editor ed = sPrefs.edit();
                ed.putString(SAVED_TEXT, height.getText().toString());
                ed.commit();
                Toast.makeText(MainActivity7.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });




        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }



}