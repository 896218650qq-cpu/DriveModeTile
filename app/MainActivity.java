package com.sui.drivemodetile;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                        // TODO: 第二阶段我们将在这里加入跳转到你指定的那个最终 Activity 的逻辑

                                // 核心要求：立即退出并彻底杀掉当前进程，不留后台
                                        finishAndRemoveTask(); 
                                                android.os.Process.killProcess(android.os.Process.myPid());
                                                    }
                                                    }