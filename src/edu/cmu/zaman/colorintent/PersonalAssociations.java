package edu.cmu.zaman.colorintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by zackaman on 12/9/14.
 */
public class PersonalAssociations extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_associations);
    }

    public void next(View view){
        Intent intent = new Intent(getApplicationContext(), PersonalAssociations2.class);
        startActivity(intent);
    }
}