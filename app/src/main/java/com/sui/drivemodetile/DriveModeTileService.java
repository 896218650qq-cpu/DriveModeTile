package com.sui.drivemodetile;

import android.content.Intent;
import android.service.quicksettings.TileService;

public class DriveModeTileService extends TileService {
    @Override
    public void onClick() {
        startActivityAndCollapse(new Intent(this, MainActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
    }
}
