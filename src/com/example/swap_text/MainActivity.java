package com.example.swap_text;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.*;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void Change_text(View view){

		Button txt_gn=(Button)findViewById(R.id.btn_gn);
		Button txt_gm=(Button)findViewById(R.id.btn_gm);
		Button txt_ge=(Button)findViewById(R.id.btn_ge);
		Button txt_ga=(Button)findViewById(R.id.btn_ga);
		txt_gm.setText(txt_ga.getText().toString());
		txt_ge.setText(txt_gm.getText().toString());
		txt_gn.setText(txt_ge.getText().toString());
		txt_ga.setText(txt_gn.getText().toString());
	}
}
