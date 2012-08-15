package com.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private EditText mNumber1EditText;
	private EditText mNumber2EditText;
	private Button mPlusButton;
	private Button mMinusButton;
	private Button mMultiplicationButton;
	private Button mDivideButton;
	TextView resutText;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inistalization();
	}

	private void inistalization() {
		mNumber1EditText = (EditText) findViewById(R.id.editText1);
		mNumber2EditText = (EditText) findViewById(R.id.editText2);
		mPlusButton = (Button) findViewById(R.id.button1);
		mMinusButton = (Button) findViewById(R.id.button2);
		mMultiplicationButton = (Button) findViewById(R.id.button3);
		mDivideButton = (Button) findViewById(R.id.button4);
		resutText = (TextView) findViewById(R.id.textView2);
		mPlusButton.setOnClickListener(this);
		mMinusButton.setOnClickListener(this);
		mMultiplicationButton.setOnClickListener(this);
		mDivideButton.setOnClickListener(this);
	}

	public void onClick(View v) {
		if (mNumber1EditText.getText().toString().equals("")
				&& mNumber2EditText.getText().toString().equals("")) {
			Toast.makeText(MainActivity.this, "number field is empty",
					Toast.LENGTH_SHORT).show();
			return;
		}
		int number1 = Integer.parseInt(mNumber1EditText.getText().toString());
		int number2 = Integer.parseInt(mNumber2EditText.getText().toString());
		int result = 0;
		NativeLibrary nativeobject = new NativeLibrary();
		String operation = ((Button) v).getText().toString();
		result = nativeobject.result(operation, number1, number2);
		Log.v("RESULT", result + " is the result");
		resutText.setText(number1 + " " + operation + " " + number2 + "  =  "
				+ result);
	}
}
