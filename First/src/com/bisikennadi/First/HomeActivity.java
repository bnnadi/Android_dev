package com.bisikennadi.First;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.bisikennadi.First.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		setContentView(textView, null);;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_search:
			openSearch();
			return true;
		case R.id.action_settings:
			openSettings();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
		
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		
	}

	private void openSettings() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_home, container,
					false);
			return rootView;
		}
	}
	
	public void nextPage(View view){
		switch (view.getId()) {
			case R.id.MyProjects_btn:
				Intent projIntent = new Intent(this, MainListActivity.class);
				String page = "My Projects";
				projIntent.putExtra(EXTRA_MESSAGE, page);
			    startActivity(projIntent);
			    break;
			case R.id.Estimates_btn:
				Intent estIntent = new Intent(this, MainListActivity.class);		
			    startActivity(estIntent);
			    break;
			case R.id.Presentation_btn:
				Intent presIntent = new Intent(this, MainListActivity.class);		
			    startActivity(presIntent);
			    break;
			case R.id.ProductLit_btn:
				Intent prodIntent = new Intent(this, MainListActivity.class);		
			    startActivity(prodIntent);
			    break;
			case R.id.Shingle_btn:
				Intent shinIntent = new Intent(this, MainListActivity.class);		
			    startActivity(shinIntent);
			    break;
			case R.id.EagleView_btn:
				Intent eagleIntent = new Intent(this, MainListActivity.class);		
			    startActivity(eagleIntent);
			    break;
			case R.id.AtlasStore_btn:
				Intent storeIntent = new Intent(this, MainListActivity.class);		
			    startActivity(storeIntent);
			    break;
			case R.id.Distributor_btn:
				Intent distIntent = new Intent(this, MainListActivity.class);		
			    startActivity(distIntent);
			    break;
			case R.id.Warranty_btn:
				Intent warrIntent = new Intent(this, MainListActivity.class);		
			    startActivity(warrIntent);
			    break;
			case R.id.AtlasRebates_btn:
				Intent rebateIntent = new Intent(this, MainListActivity.class);		
			    startActivity(rebateIntent);
			    break;
			case R.id.Homeowner_btn:
				Intent homeIntent = new Intent(this, MainListActivity.class);		
			    startActivity(homeIntent);
			    break;
			case R.id.StormTracker_btn:
				Intent stormIntent = new Intent(this, MainListActivity.class);		
			    startActivity(stormIntent);
			    break;
			case R.id.Testimonials_btn:
				Intent testIntent = new Intent(this, MainListActivity.class);		
			    startActivity(testIntent);
			    break;
			case R.id.MainSocial_btn:
				Intent socialIntent = new Intent(this, MainListActivity.class);		
			    startActivity(socialIntent);
			    break;

				
				
		}
	}

}
