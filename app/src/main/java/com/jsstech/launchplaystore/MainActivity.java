package com.jsstech.launchplaystore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent=null,chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playStore=findViewById(R.id.bt);

        playStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://play.google.com/store?hl=en"));
                chooser=Intent.createChooser(intent,"launch play store");
                startActivity(chooser);

            }
        });
    }
}