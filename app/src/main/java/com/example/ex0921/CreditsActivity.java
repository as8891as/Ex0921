package com.example.ex0921;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * @author Itay Shehter as8891@bs.amalnet.k12.il
 * @version 1.0
 * @since 11/1/2026
 * The activity operates the credits screen of the application
 */
public class CreditsActivity extends AppCompatActivity {

    /**
     * The method is called when the activity is created. The method initializes the activity and the necessary attributes.
     * <p>
     *
     * @param savedInstanceState Contains the last state of the activity, may be null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    /**
     * The method is called when the button is pressed. It returns to the MainActivity.
     * <p>
     *
     * @param view The view that was clicked
     */
    public void backPressed(View view) {
        finish();
    }
}