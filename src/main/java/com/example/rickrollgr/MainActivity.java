package com.example.rickrollgr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        rickRoll();
    }

    private void rickRoll(){
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.setMediaController(null);
        videoView.start();
    }

}
