package com.example.campus360;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;




public class LikeCommentObserver extends BroadcastReceiver {

	private static final String TAG = "ADP_LikeCommentObserver";
	  private static final boolean DEBUG = true;

	  private RetrieveCampus360ListLoader mLoader;

	  public LikeCommentObserver(RetrieveCampus360ListLoader loader) {
	    mLoader = loader;
	    IntentFilter filter = new IntentFilter(Intent.ACTION_LOCALE_CHANGED);
	    mLoader.getContext().registerReceiver(this, filter);
	  
	  }
	  @Override
	  public void onReceive(Context context, Intent intent) {
	    if (DEBUG) Log.i(TAG, "+++ The observer has detected a locale change!" +
	    		" Notifying Loader... +++");

	    mLoader.onContentChanged();
	  }
	}