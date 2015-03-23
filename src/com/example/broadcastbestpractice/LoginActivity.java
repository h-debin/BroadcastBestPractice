package com.example.broadcastbestpractice;

import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.Intent;

public class LoginActivity extends BaseActivity implements OnClickListener {
	
	private EditText accountText;
	private EditText passwordText;
	private Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		accountText = (EditText) findViewById(R.id.account);
		passwordText = (EditText) findViewById(R.id.password);
		login = (Button) findViewById(R.id.login);
		login.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		String account = accountText.getText().toString();
		String password = passwordText.getText().toString();
		if (!"".equals(account) && !"".equals(password)) {
			Intent intent = new Intent(LoginActivity.this, MainActivity.class);
			startActivity(intent);
		} else {
			Toast.makeText(LoginActivity.this, "account or password is invalid",
					Toast.LENGTH_SHORT).show();
		}
	}

}
