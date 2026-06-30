package com.tencent.tencentmap.io;

/* loaded from: classes10.dex */
public class QStorageManager {
    public static final java.lang.String DATA = "data/";
    private static com.tencent.tencentmap.io.QStorageManager mInstance;

    private QStorageManager(android.content.Context context) {
    }

    public static com.tencent.tencentmap.io.QStorageManager getInstance(android.content.Context context) {
        if (mInstance == null) {
            mInstance = new com.tencent.tencentmap.io.QStorageManager(context);
        }
        return mInstance;
    }

    public void clearOldConfig(android.content.Context context, java.lang.String str) {
    }

    public java.lang.String getAssetsDynamicPath() {
        return null;
    }

    public java.lang.String getAssetsLoadPath(java.lang.String str) {
        return null;
    }

    public java.io.File getCacheDir() {
        return null;
    }

    public java.lang.String getConfigPath(java.lang.String str) {
        return null;
    }

    public java.lang.String getConfigTempPath(java.lang.String str) {
        return null;
    }

    public java.io.File getDataDir() {
        return null;
    }

    public java.lang.String getMapPath() {
        return null;
    }

    public java.lang.String getRouteBlockPath() {
        return null;
    }

    public java.lang.String getSatPath() {
        return null;
    }
}
