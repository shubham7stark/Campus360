package com.example.campus360;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.ActionBarActivity;

public class Campus360Container extends ActionBarActivity {

	FragmentManager fManager;
	FragmentTransaction fTranslation;
	Campus360ListFragment postListFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.campus360_fragment_container);

		/*----------adding Fragment-----------*/
	
	fManager = getSupportFragmentManager();
	fTranslation = fManager.beginTransaction();
	postListFragment = new Campus360ListFragment(); 
	fTranslation.replace(R.id.list_fragment,postListFragment);
	fTranslation.commit();
	
	
	}
	
}
