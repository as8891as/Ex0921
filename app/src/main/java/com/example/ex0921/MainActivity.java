package com.example.ex0921;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    ConstraintLayout constLayout;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constLayout = findViewById(R.id.constLayout);
        rnd = new Random();
    }

    public void btn1Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("AlertDialog with just a message");
        adb.setMessage("Your package has just arrived!");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void btn2Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("AlertDialog with message and icon");
        adb.setMessage("Your download is complete!");
        adb.setIcon(R.drawable.icon);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void btn3Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setCancelable(false);
        adb.setTitle("AlertDialog with message, icon and button");
        adb.setMessage("Your download is complete!");
        adb.setIcon(R.drawable.icon);
        adb.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void btn4Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setCancelable(false);
        adb.setTitle("AlertDialog with message and two buttons");
        adb.setMessage("Change the color!");
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                constLayout.setBackgroundColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
            }
        });
        adb.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void btn5Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setCancelable(false);
        adb.setTitle("AlertDialog with message and three buttons");
        adb.setMessage("Change the color!");
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                constLayout.setBackgroundColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
            }
        });
        adb.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        adb.setNegativeButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                constLayout.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }
}