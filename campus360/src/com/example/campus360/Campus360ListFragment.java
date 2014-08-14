package com.example.campus360;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Campus360ListFragment extends ListFragment implements LoaderCallbacks<PostItem> {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return super.onCreateView(inflater, container, savedInstanceState);

	
	
	}
	
	
	
	
	
	
	
 // LoaderCallBackMethods	
	
	@Override
	public Loader<PostItem> onCreateLoader(int arg0, Bundle arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onLoadFinished(Loader<PostItem> arg0, PostItem arg1) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onLoaderReset(Loader<PostItem> arg0) {
		// TODO Auto-generated method stub
	}


}
