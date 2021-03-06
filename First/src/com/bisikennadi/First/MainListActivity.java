package com.bisikennadi.First;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_list);
		
		Intent intent = getIntent();
		String page = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
		
		 // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(page);

	    // Set the text view as the activity layout
	    setContentView(textView);
	    
	    grabData(textView);
	    
	    ListAdapter adapter = createAdapter();
	    setListAdapter(adapter);
	    
	}

	private void grabData(TextView textView) {
		// TODO Auto-generated method stub
		
	}

	private ListAdapter createAdapter() {
		// TODO Auto-generated method stub
		
		String[] testValues = new String[] {"Test", "Test1", "Test2", "Test3"};
		
		ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , testValues);
		
		return adapter;
	}
}
