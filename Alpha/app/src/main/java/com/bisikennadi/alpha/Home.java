package com.bisikennadi.alpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.bisikennadi.alpha.R;

public class Home extends Activity {

    public final static String PAGE_NAME = "com.bisikennadi.alpha.MESSAGE";
    private String page = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String header = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        TextView showHeader = new TextView(this);
        showHeader.setTextSize(40);
        showHeader.setText(header);

        setContentView(showHeader);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }else if(id == R.id.action_search) {
            openSearch();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openSearch() {

    }

    private void openSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void nextPage(View view){
//        switch (view.getId()) {
//            case R.id.myProjects_btn:
//                Intent projIntent = new Intent(this, TempList.class);
//                page = "My Projects";
//                projIntent.putExtra(PAGE_NAME, page);
//                startActivity(projIntent);
//                break;
//            case R.id.estimates_btn:
//                Intent estIntent = new Intent(this, TempList.class);
//                page = "Estimates";
//                estIntent.putExtra(PAGE_NAME, page);
//                startActivity(estIntent);
//                break;
//            case R.id.presentation_btn:
//                Intent presIntent = new Intent(this, TempList.class);
//                page = "Presentation Builder";
//                presIntent.putExtra(PAGE_NAME, page);
//                startActivity(presIntent);
//                break;
//            case R.id.productLit_btn:
//                Intent prodIntent = new Intent(this, TempList.class);
//                page = "Product Literature";
//                prodIntent.putExtra(PAGE_NAME, page);
//                startActivity(prodIntent);
//                break;
//            case R.id.shingle_btn:
//                Intent shinIntent = new Intent(this, TempList.class);
//                page = "Shingle Visualization";
//                shinIntent.putExtra(PAGE_NAME, page);
//                startActivity(shinIntent);
//                break;
//            case R.id.eagleView_btn:
//                Intent eagleIntent = new Intent(this, TempList.class);
//                page = "Eagle View";
//                eagleIntent.putExtra(PAGE_NAME, page);
//                startActivity(eagleIntent);
//                break;
//            case R.id.atlas_store_btn:
//                Intent storeIntent = new Intent(this, TempList.class);
//                page = "Atlas Store";
//                storeIntent.putExtra(PAGE_NAME, page);
//                startActivity(storeIntent);
//                break;
//            case R.id.locateDist_btn:
//                Intent distIntent = new Intent(this, TempList.class);
//                page = "Locate A Distributor";
//                distIntent.putExtra(PAGE_NAME, page);
//                startActivity(distIntent);
//                break;
//            case R.id.warranty_btn:
//                Intent warrIntent = new Intent(this, TempList.class);
//                page = "Warranty Submissions";
//                warrIntent.putExtra(PAGE_NAME, page);
//                startActivity(warrIntent);
//                break;
//            case R.id.atlas_rebates_btn:
//                Intent rebateIntent = new Intent(this, TempList.class);
//                page = "Atlas Rebates";
//                rebateIntent.putExtra(PAGE_NAME, page);
//                startActivity(rebateIntent);
//                break;
//            case R.id.homeowner_lead_btn:
//                Intent homeIntent = new Intent(this, TempList.class);
//                page = "Homeowners Leads";
//                homeIntent.putExtra(PAGE_NAME, page);
//                startActivity(homeIntent);
//                break;
//            case R.id.storm_track_btn:
//                Intent stormIntent = new Intent(this, TempList.class);
//                page = "Storm Tracking";
//                stormIntent.putExtra(PAGE_NAME, page);
//                startActivity(stormIntent);
//                break;
//            case R.id.testimonials_btn:
//                Intent testIntent = new Intent(this, TempList.class);
//                page = "Testimonials";
//                testIntent.putExtra(PAGE_NAME, page);
//                startActivity(testIntent);
//                break;
//            case R.id.social_share_btn:
//                Intent socialIntent = new Intent(this, TempList.class);
//                page = "Social Sharing";
//                socialIntent.putExtra(PAGE_NAME, page);
//                startActivity(socialIntent);
//                break;
//
//
//
//        }
    }
}
