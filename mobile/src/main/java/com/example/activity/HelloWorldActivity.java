package com.example.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.R;


public class HelloWorldActivity extends BaseActivity
{
	public static Intent newIntent(Context context)
	{
		Intent intent = new Intent(context, HelloWorldActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}


	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		setupActionBar(INDICATOR_BACK);
	}
}
