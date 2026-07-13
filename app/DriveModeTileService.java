package com.sui.drivemodetile;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;

public class DriveModeTileService extends TileService {

    @Override
        public void onClick() {
                super.onClick();

                        // 创建指向 MainActivity 的意图
                                Intent intent = new Intent(this, MainActivity.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                                                // Android 14 强制要求使用 PendingIntent 来从后台（如磁贴）安全启动 Activity
                                                        PendingIntent pendingIntent = PendingIntent.getActivity(
                                                                        this, 
                                                                                        0, 
                                                                                                        intent, 
                                                                                                                        PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT
                                                                                                                                );

                                                                                                                                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) { // Android 14+
                                                                                                                                                    startActivityAndCollapse(pendingIntent);
                                                                                                                                                            } else {
                                                                                                                                                                        startActivityAndCollapse(intent);
                                                                                                                                                                                }
                                                                                                                                                                                    }
                                                                                                                                                                                    }