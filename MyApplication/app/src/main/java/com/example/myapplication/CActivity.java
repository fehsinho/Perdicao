package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    ConstraintLayout layout;
    ProgressBar progressBar;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_c);

        progressBar = findViewById(R.id.barra);
        layout = findViewById(R.id.tealooo);

        Button btn2 = new Button(this);
        btn2.setText(R.string.my_button);



        layout.addView(btn2);

        builder=new AlertDialog.Builder(this);
        builder.setMessage(R.string.app_name).setTitle(R.string.app_name);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (progressBar.isShown()){
                    progressBar.setVisibility(View.GONE);
                }else{
                    progressBar.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}
