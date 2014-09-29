package com.example.chapter3interface;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// action to call LinearLayout
		Button btn_linear_layout = (Button) findViewById(R.id.btn_linear_layout);
		
		btn_linear_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, LinearLayout.class);
				startActivity(it);
			}
		});
		// action to call AbsoluteLayout
		Button btn_absolute_layout = (Button) findViewById(R.id.btn_absolute_layout);
		
		btn_absolute_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, AbsoluteLayout.class);
				startActivity(it);
			}
		});
		
		// action to call TableLayout
		Button btn_table_layout = (Button) findViewById(R.id.btn_table_layout);
		
		btn_table_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, TableLayout.class);
				startActivity(it);
			}
		});
		
		// action to call RelativeLayout
		Button btn_relative_layout = (Button) findViewById(R.id.btn_relative_layout);
		
		btn_relative_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, RelativeLayout.class);
				startActivity(it);
			}
		});
		
		// action to call RelativeLayout
		Button btn_frame_layout = (Button) findViewById(R.id.btn_frame_layout);
		
		btn_frame_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, FrameLayout.class);
				startActivity(it);
			}
		});
		
		// action to call RelativeLayout
		Button btn_scroll_layout = (Button) findViewById(R.id.btn_scroll_layout);
		
		btn_scroll_layout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, ScrollLayout.class);
				startActivity(it);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
