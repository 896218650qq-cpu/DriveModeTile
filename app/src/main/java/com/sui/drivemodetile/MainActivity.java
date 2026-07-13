package com.sui.drivemodetile;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishAndRemoveTask();
        Process.killProcess(Process.myPid());
    }
}
