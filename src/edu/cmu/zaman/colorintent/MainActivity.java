package edu.cmu.zaman.colorintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	public void startCritique(View view){
		Intent intent = new Intent(this, CritiqueActivity.class);
		startActivity(intent);
	}
	public void colorAssociations(View view){
		Intent intent = new Intent(this, ColorAssociations.class);
		startActivity(intent);
	}

	public void personalAssociations(View view){
		Intent intent = new Intent(this, PersonalAssociations.class);
		startActivity(intent);
	}

	public void basicConcepts(View view){
		Intent intent = new Intent(this, BasicConcepts.class);
		startActivity(intent);
	}

	public void colorSchemes(View view){
		Intent intent = new Intent(this, ColorSchemes.class);
		startActivity(intent);
	}
}
