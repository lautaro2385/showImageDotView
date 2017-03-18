package com.lautaro.showimagedotview.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.lautaro.showimagedotview.MainActivity;
import com.lautaro.showimagedotview.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ShowImageActivity extends AppCompatActivity {
    @BindView(R.id.ivImage)
    protected ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_image);

        ButterKnife.bind(ShowImageActivity.this);

        Picasso picasso = Picasso.with(ShowImageActivity.this);
        picasso.invalidate("https://toolcasepruebas.000webhostapp.com/Imagenes/pruebacase.png");
        picasso.load("https://toolcasepruebas.000webhostapp.com/Imagenes/pruebacase.png").into(ivImage);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        if(intent.getBooleanExtra("Close", false)) {
            Picasso.with(this).invalidate("https://toolcasepruebas.000webhostapp.com/Imagenes/pruebacase.png");
            finish();
        }
    }
}
