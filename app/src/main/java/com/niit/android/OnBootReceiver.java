package com.niit.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class OnBootReceiver extends BroadcastReceiver {

	  @Override
	  public void onReceive(Context context, Intent intent) {
	    if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
			Toast.makeText(context, "Time has changed", Toast.LENGTH_LONG).show();
	    }
	  }
	}