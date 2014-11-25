package com.example.shalijihua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		new Handler().postDelayed(new Runnable() {
			public void run() {
				/* Create an Intent that will start the Main WordPress Activity. */
				Intent mainIntent = new Intent(StartActivity.this,
						MainActivity.class);
				StartActivity.this.startActivity(mainIntent);
				StartActivity.this.finish();
			}
		}, 3000);
	}
}
