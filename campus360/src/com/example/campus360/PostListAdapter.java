package com.example.campus360;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PostListAdapter extends ArrayAdapter<PostItem> {

	Context c;
	List< PostItem> list;
	
private TextView post_user;
private TextView one_liner;
private ImageView poster_pic;
private TextView post_content;
private Button like_bt;
private Button comment_bt;

	public PostListAdapter(Context context, List<PostItem> l) {
	
		super(context,R.layout.post_item);
		// TODO Auto-generated constructor stub
	   c = context;
	   l = list;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater lyinflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View postView = lyinflater.inflate(R.layout.post_item, parent, false);
	    
		post_user = (TextView)postView.findViewById(R.id.postby_username);
		one_liner = (TextView)postView.findViewById(R.id.post_one_liner);
		poster_pic = (ImageView)postView.findViewById(R.id.postby_pic);
		post_content = (TextView)postView.findViewById(R.id.post_content);
		like_bt = (Button)postView.findViewById(R.id.like_button);
		comment_bt = (Button)postView.findViewById(R.id.comment_button);
		
	
	like_bt.setOnClickListener(mOnLikeClickListener);
	comment_bt.setOnClickListener(mOnCommentClickListener);
	
	return postView;
	
	}
	
    private OnClickListener mOnLikeClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            
        }
    };

    private OnClickListener mOnCommentClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
        //..............do here............//   
        }
    };
	
	

}
