package com.dam.snippets;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class A42_Video extends AppCompatActivity {

    MediaController mediaController;
    int position;
    VideoView vvVideo;

    @Override
    protected void onPause() {
        position = vvVideo.getCurrentPosition();
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a42_video2);


        // *****  lecture automatique au on create de l'activite
        // Oon lie le design et le code
        // VideoView videoView_Audio = (VideoView) findViewById(R.id.videoView1);
        // On ajoute le chemin vers la video
        //  LE DOSSIER RACINE  +  LE PACKAG SOURCE + le nom de la video
        //String uriPath = ("android.resource://" + getPackageName() + "/raw" + R.raw.mp_ts_drunk);
        // Uri uri = Uri.parse(uriPath);
        // videoView_Audio.setVideoURI(uri);
        // On lance simplement la video
        // videoView_Audio.start();


        // Phase 2 avec le mediacontroller
        VideoView vvVideo = findViewById(R.id.VideoView1);
        String uriPath = ("android.resource://" + getPackageName() + "/raw" + R.raw.mp_ts_drunk);
        Uri uri = Uri.parse(uriPath);
        vvVideo.setVideoURI(uri);

        // Création d'un nouvel objet mediacontroller que l'on associe à la vue

        if (this.mediaController == null){
              this.mediaController = new MediaController(A42_Video.this);

              mediaController.setAnchorView(vvVideo);
              vvVideo.setMediaController(mediaController);

              vvVideo.start();

              if (savedInstanceState != null){
                  position = savedInstanceState.getInt("CurrentPosition");
                  vvVideo.seekTo(position);

              }

        }



    }
}