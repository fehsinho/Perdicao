package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    ConstraintLayout layout1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);





        layout1=findViewById(R.id.tela);

        TextView tvi = new TextView(this);
        tvi.setText(R.string.my_string);

        Button btn=new Button(this);
        btn.setText(R.string.my_button);

        Button btn2=new Button(this);
        btn2.setText(R.string.my_button);

        layout1.addView(tvi);
        layout1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(), "you choose yes action for alertbox", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(), "you choose  no action for alertbox", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alert=builder.create();
                alert.show();
            }
        });


    }
}