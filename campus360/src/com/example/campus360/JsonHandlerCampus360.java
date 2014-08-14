package com.example.campus360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Comparator;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.net.Uri;
import android.util.Log;

public class JsonHandlerCampus360 {
	
/*------------------Authentication------------------*/
	
	public boolean Authentication(){
	return true;
	}
	
/*------------------Method To Write Post -----------------*/
	
	public void sendJsonPost(JSONObject jobj){
   
	HttpClient client = new DefaultHttpClient();
    try{
	HttpPost httppost = new HttpPost("url here");	
	StringEntity strentity = new StringEntity(jobj.toString());
	httppost.setEntity(strentity);
	httppost.setHeader("Accept", "application/json");
	httppost.setHeader("Content-type", "application/json");
	
	ResponseHandler respHandler = new BasicResponseHandler();
	HttpResponse httprespo = client.execute(httppost, respHandler);
	
	}
	catch(Exception e){
	Log.i("post", e.getMessage());
	}
	
	} 

	
/*-------------------Method TO Recieve------------------*/
	
	public JSONArray getJsonPostArray(String strurl){

		JSONArray jArray = null;
		HttpClient client = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(strurl);
		
    	try{
    		
    		HttpResponse response = client.execute(httppost);
    		
    		StatusLine statusLine = response.getStatusLine();
    		int statusCode = statusLine.getStatusCode();
    		
    		if(statusCode == 200)
    		{
    			HttpEntity entity = response.getEntity();
    			InputStream content = entity.getContent();
    			String strin = convertStreamToString(content);
    			jArray = new JSONArray(strin);
    			
    		} else {
    			Log.e(MainActivity.class.toString(),"Failedet JSON object");
    		}
    	}catch(ClientProtocolException e){
    		e.printStackTrace();
    	} catch (IOException e){
    		e.printStackTrace();
    	} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return jArray ;
	}
	
	
	private static String convertStreamToString(InputStream is) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	

	/*-------------comparator------------------*/
	private static final Comparator<PostItem> ALPHA_COMPARATOR = new Comparator<PostItem>() {
	    @Override
	    public int compare(PostItem object1, PostItem object2) {
	      return 0;
	    }
	  };
	
	
	
	
}
