package com.magic;

import com.magic.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MySecondProjectActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TextView fajrText = (TextView) findViewById(R.id.textView12);
		fajrText.setText("06h02");
		TextView shouroukText = (TextView) findViewById(R.id.textView22);
		shouroukText.setText("07h18");
		TextView dhorText = (TextView) findViewById(R.id.textView32);
		dhorText.setText("13h46");
		TextView asrText = (TextView) findViewById(R.id.textView42);
		asrText.setText("17h23");
		TextView magrebText = (TextView) findViewById(R.id.textView52);
		magrebText.setText("20h14");
		TextView ishaText = (TextView) findViewById(R.id.textView62);
		ishaText.setText("21h24");

	}
}