package com.example.notquietbob;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageButton;


public class StartScreen extends AppCompatActivity {

    ImageButton nachatbutton;
    ImageButton settingsbutton;
//    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nachatbutton = findViewById(R.id.start);
        settingsbutton = findViewById(R.id.settings);
//        dialog = new Dialog(StartScreen.this);

        nachatbutton.setOnClickListener(v -> {
            Intent intent = new Intent(StartScreen.this, MainActivity.class);
            startActivity(intent);
        });
        
//        settingsbutton.setOnClickListener(v -> {
//            showsettmenu();
//        });
    }

//    private void showsettmenu() {
//        dialog.setContentView(R.layout.activity_settings_menu);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//        ImageButton savebutt = findViewById(R.id.settsave);
//
//        savebutt.setOnClickListener(v -> {
//            dialog.setContentView(R.layout.activity_main);
//        });
//    }


}