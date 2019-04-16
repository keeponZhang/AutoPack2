package com.zhang.autopack;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView mTv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTv2 = (TextView) findViewById(R.id.tv2);
		getAppCode();
	}
	private void getAppCode() {
		try {
			PackageInfo packageInfo = MainActivity.this.getPackageManager().getPackageInfo(getPackageName(), 0);
			int versionCode = packageInfo.versionCode;
			String versionName = packageInfo.versionName;
			mTv2.setText(versionName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
