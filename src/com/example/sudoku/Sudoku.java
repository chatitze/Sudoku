package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Sudoku extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener((OnClickListener) this);
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener((OnClickListener) this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener((OnClickListener) this);
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener((OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    		case R.xml.settings:
    			startActivity(new Intent(this, Prefs.class));
    			return true;
    		// More items go here (if any) ...
    	}
    	return false;
    }
    
    public void onClick(View v) {
    	switch (v.getId()) {
    		case R.id.about_button:
    			Intent i = new Intent(this, About.class);
    			startActivity(i);
    			break;
    	// More buttons go here (if any) ...
    	}
    }
}
