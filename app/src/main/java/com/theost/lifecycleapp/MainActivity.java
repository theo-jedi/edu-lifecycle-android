package com.theost.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.theost.lifecycleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ViewBinding example
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.startButton.setOnClickListener(view -> startSecondActivity());

        Log.e("lifecycle", "onCreate()");
    }

    private void startSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        count += 1;
        Log.e("lifecycle", "onStop(), count: " + count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle", "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle", "onRestart()");
    }
}