package com.lautaro.showimagedotview.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.lautaro.showimagedotview.Activity.ShowImageActivity;

public class CoverReceive extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().endsWith(".open")) {
            Intent i = new Intent(context, ShowImageActivity.class);
            //i.setClassName("com.lautaro.showimagedotview", "com.lautaro.showimagedotview.Activity.ShowImageActivity");
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            i.putExtra("Close", true);
            context.startActivity(i);
        } else if (intent.getAction().endsWith(".close")) {
            Intent i = new Intent(context, ShowImageActivity.class);
            //i.setClassName("com.lautaro.showimagedotview", "com.lautaro.showimagedotview.Activity.ShowImageActivity");
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startActivity(i);
        }
    }
}