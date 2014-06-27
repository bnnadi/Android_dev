package com.bisikennadi.alpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.bisikennadi.alpha.MESSAGE";
    private EditText username = null;
    private EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

    }
    public void signUp(View view){
        Intent sign = new Intent(this, SignUp.class);
        startActivity(sign);
    }

    public void login(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            //correct password
            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();

            goToHome();
        }else{
            //wrong password
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
        }
    }

    private void goToHome() {
        Intent intent = new Intent(this, Home.class);
        EditText editText = username;
        String header = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, header);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

