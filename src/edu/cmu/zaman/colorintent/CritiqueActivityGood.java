package edu.cmu.zaman.colorintent;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by zackaman on 11/22/14.
 */
public class CritiqueActivityGood extends Activity {
    MediaPlayer mediaPlayer;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.example_critique_good);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_critique_good);
    }

    public void next(View view){
        Intent intent = new Intent(this, CritiqueActivityBad.class);
        startActivity(intent);
        mediaPlayer.stop();
//        mediaPlayer.release();
    }

    @Override
    public void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }
    @Override
    public void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.example_critique_good);
    }


    public void playCritique(View view){
        if(mediaPlayer.isPlaying() == false){
            mediaPlayer.start();
        }
    }

    public void onMediaComplete(){

    }
}