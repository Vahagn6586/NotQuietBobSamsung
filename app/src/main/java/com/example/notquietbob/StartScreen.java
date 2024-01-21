package com.example.notquietbob;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
        import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;


public class StartScreen extends AppCompatActivity {

    private ImageButton startButton, settingsButton, saveButton;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        startButton = findViewById(R.id.start);
        settingsButton = findViewById(R.id.settings);
        dialog = new Dialog(StartScreen.this);

        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(StartScreen.this, MainActivity.class);
            startActivity(intent);
        });
        
        settingsButton.setOnClickListener(v -> showSettMenu());
    }

    private void showSettMenu() {
        dialog.setContentView(R.layout.activity_settings_menu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        saveButton = dialog.findViewById(R.id.settsave);
        saveButton.setOnClickListener(v -> dialog.hide());

    }


}