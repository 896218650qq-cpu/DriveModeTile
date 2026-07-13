# DriveModeTile

极致轻量的Android驾驶模式应用

## 功能特性

- ✅ 极致轻量化设计（最小化CPU和内存占用）
- ✅ 不显示桌面图标
- ✅ 快速设置磁贴（白色矢量小汽车图标）
- ✅ 磁贴名称：驾驶模式
- ✅ 点击磁贴启动Activity，立即退出并结束进程
- ✅ Android 14+兼容

## 项目结构

```
DriveModeTile/
├── app/src/main/
│   ├── kotlin/com/drivetile/mode/
│   │   ├── DriveModeActivity.kt      # 驾驶模式Activity（启动后立即退出）
│   │   └── DriveModeService.kt       # 快速设置磁贴服务
│   └── AndroidManifest.xml
├── build.gradle.kts
└── settings.gradle.kts
```

## Activity名称

**`com.drivetile.mode.DriveModeActivity`**

## 使用说明

1. 编译构建应用
2. 在快速设置中找到"驾驶模式"磁贴
3. 点击磁贴启动驾驶模式Activity
4. Activity自动退出并结束进程

## 技术栈

- Kotlin
- Android API Level 34 (Android 14)
- 极致轻量化配置（启用ProGuard混淆）

## 开发信息

- minSdkVersion: 34
- targetSdkVersion: 34
- compileSdkVersion: 34
