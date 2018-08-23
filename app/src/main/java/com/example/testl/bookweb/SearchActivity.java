package com.example.testl.bookweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchEditText = (EditText) findViewById(R.id.searchEditText);
    }

    public void onSearchClick(View view) {
        Toast.makeText(this, searchEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
