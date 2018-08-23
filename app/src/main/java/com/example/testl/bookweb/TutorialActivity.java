package com.example.testl.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.testl.bookweb.R.*;


// -- action bar activity
public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tutorial);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
