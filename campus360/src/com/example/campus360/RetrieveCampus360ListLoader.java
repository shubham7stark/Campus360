package com.example.campus360;

import java.util.List;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;


public class RetrieveCampus360ListLoader extends AsyncTaskLoader<List<PostItem>>{

	JsonHandlerCampus360 jsonCampus;
	List<PostItem> postList;
	private LikeCommentObserver likecommentObserver ;
	
	public RetrieveCampus360ListLoader(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/*----loading Data------------- Please consider how we may get List direct from JSONArray----------*/
	
	@Override
	public List<PostItem> loadInBackground() {
		postList = (List<PostItem>) jsonCampus.getJsonPostArray(null);
	return postList;
	}
	
	
	
	@Override
	protected void onStartLoading() {
		// TODO Auto-generated method stub
		super.onStartLoading();

	if(postList != null){
		deliverResult(postList);
	
	}
	}
	
	
	 @Override
	  public void deliverResult(List<PostItem> apps) {
	    if (isReset()) {
	       
	        return;
	      }
		    List<PostItem> oldpostList = postList;
	   }
	 

	@Override
	protected void onStopLoading() {
		// TODO Auto-generated method stub
		super.onStopLoading();
	}
	
	@Override
	protected void onReset() {
		// TODO Auto-generated method stub
		super.onReset();
	  onStopLoading();
	  
	  if(likecommentObserver != null){
		getContext().unregisterReceiver(likecommentObserver); 
	  }
	  
	}
	
}
