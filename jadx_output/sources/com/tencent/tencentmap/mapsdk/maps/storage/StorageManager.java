package com.tencent.tencentmap.mapsdk.maps.storage;

/* loaded from: classes12.dex */
public class StorageManager {
    private static final java.lang.String PRIVATE_ROOT_DIR = "/tencentMapSdk/";
    private static final java.lang.String ROOT_DIR = "/tencentmapsdk/";
    private static com.tencent.tencentmap.mapsdk.maps.storage.StorageManager mInstance;
    private java.lang.String mAppRootDir;
    private android.content.Context mContext;
    private java.lang.String mCustomCacheRootPath;
    private java.lang.String mPrivateFilePath;
    private java.lang.String mPrivateFileRootPath;
    private static java.lang.String[] mSharedPrefNames = {"com.tencent.tencentmap.mapsdk.maps.offlinemap", "txlbs_suid", "txlbs_duid", "Tencent_MapSDK_SUB_CONFIG"};
    private static java.lang.String[] mPrivateFileNames = {"frontiers.dat"};

    private StorageManager(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Error("context can not be null");
        }
        this.mContext = context.getApplicationContext();
        this.mCustomCacheRootPath = str;
        updatePublicPath();
        updatePrivatePath();
    }

    public static void clearMapCache(android.content.Context context, java.lang.String str) {
        com.tencent.mapsdk.internal.ks.f(getInstance(context, str).getCacheDir());
        com.tencent.mapsdk.internal.ks.f(getInstance(context, str).getPrivateCacheDir());
        for (java.lang.String str2 : mPrivateFileNames) {
            com.tencent.mapsdk.internal.ks.f(getInstance(context, str).getPrivateCacheFileName(str2));
        }
        removeAllPrefs(context);
    }

    private static long getAvailableStorageSize(java.lang.String str) {
        try {
            android.os.StatFs statFs = new android.os.StatFs(str);
            return ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024) / 1024;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    private static java.lang.String getExternalStoragePath(android.content.Context context) {
        java.io.File externalFilesDir = context.getExternalFilesDir(null);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getPath();
    }

    public static com.tencent.tencentmap.mapsdk.maps.storage.StorageManager getInstance(android.content.Context context, java.lang.String str) {
        if (mInstance == null) {
            mInstance = new com.tencent.tencentmap.mapsdk.maps.storage.StorageManager(context, str);
        }
        return mInstance;
    }

    private java.lang.String getStorageRootPath() {
        if (!android.text.TextUtils.isEmpty(this.mCustomCacheRootPath)) {
            return this.mCustomCacheRootPath;
        }
        android.content.Context context = this.mContext;
        java.lang.String externalStoragePath = getExternalStoragePath(context);
        if (getAvailableStorageSize(externalStoragePath) >= 5) {
            return externalStoragePath;
        }
        java.lang.String path = context.getFilesDir().getPath();
        return getAvailableStorageSize(path) < 5 ? getExternalStoragePath(context) : path;
    }

    public static void removeAllPrefs(android.content.Context context) {
        try {
            java.io.File[] listFiles = new java.io.File(context.getFilesDir().getParent() + java.io.File.separator + "shared_prefs").listFiles();
            if (listFiles == null) {
                return;
            }
            for (java.io.File file : listFiles) {
                for (java.lang.String str : mSharedPrefNames) {
                    if (file.getName().startsWith(str)) {
                        file.delete();
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void updatePrivatePath() {
        this.mPrivateFileRootPath = this.mContext.getFilesDir().getAbsolutePath();
        this.mPrivateFilePath = this.mPrivateFileRootPath + PRIVATE_ROOT_DIR;
    }

    private void updatePublicPath() {
        java.lang.String storageRootPath = getStorageRootPath();
        java.lang.String a17 = com.tencent.mapsdk.internal.ks.a(this.mContext);
        if (com.tencent.mapsdk.internal.hr.a(a17)) {
            this.mAppRootDir = storageRootPath + ROOT_DIR;
            return;
        }
        this.mAppRootDir = storageRootPath + ROOT_DIR + a17;
    }

    public java.io.File getCacheDir() {
        return new java.io.File(this.mAppRootDir);
    }

    public java.io.File getPrivateCacheDir() {
        return new java.io.File(this.mPrivateFilePath);
    }

    public java.io.File getPrivateCacheFileName(java.lang.String str) {
        return new java.io.File(this.mPrivateFileRootPath + java.io.File.separator + str);
    }
}
