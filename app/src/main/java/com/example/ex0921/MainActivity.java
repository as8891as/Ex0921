package com.example.ex0921;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
/**
 * @author Itay Shehter as8891@bs.amalnet.k12.il
 * @version 1.0
 * @since 11/1/2026
 * The activity has 5 buttons showcasing AlertDialog
 */
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    ConstraintLayout constLayout;
    Random rnd;
    Intent si;

    /**
     * The method is called when the activity is created. The method initializes the activity and the necessary attributes.
     * <p>
     *
     * @param savedInstanceState Contains the last state of the activity, may be null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constLayout = findViewById(R.id.constLayout);
        rnd = new Random();
        si = new Intent(this,CreditsActivity.class);
    }

    /**
     * The method is called when the first button is pressed. It makes and operates an AlertDialog with just a message.
     * <p>
     *
     * @param view The view that was clicked
     */
    public void btn1Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("AlertDialog with just a message");
        adb.setMessage("Your package has just arrived!");
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * The method is called when the second button is pressed. It makes and operates an AlertDialog with a message and icon.
     * <p>
     *
     * @param view The view that was clicked
     */
    public void btn2Pressed(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("AlertDialog with message and icon");
        adb.setMessage("Your download is complete!");
        adb.setIcon(R.drawable.icon);
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * The method is called when the third button is pressed. It makes and operates an AlertDialog with a message, icon and a button that closes it.
     * <p>
     *
     * @param view The view that was clicked
     */
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

    /**
     * The method is called when the fourth button is pressed. It makes and operates an AlertDialog with a message and two buttons. One button changes the background to a random color, the second closes the AlertDialog.
     * <p>
     *
     * @param view The view that was clicked
     */
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

    /**
     * The method is called when the Fifth button is pressed. It makes and operates an AlertDialog with a message and three buttons. The first changes the background to a random color, the second changes the background to white, the third closes the AlertDialog.
     * <p>
     *
     * @param view The view that was clicked
     */
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

    /**
     * The method is called when a menu is created. It builds the menu based on the resources.
     * <p>
     *
     * @param menu The menu being created
     * @return The method returns whether the creation of the menu was successful
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cred_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * The method is called when the menu is clicked. It changes the Activity to the credits Activity based on the item selected.
     * <p>
     *
     * @param item The item selected on the menu
     * @return The method returns whether the operations based on the selection of the item were successful
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.credits) {
            startActivity(si);
        }
        return super.onOptionsItemSelected(item);
    }
}