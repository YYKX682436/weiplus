package org.chromium.base;

@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int NUM_DIRECTORIES = 3;
    private static final java.lang.String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final java.lang.String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static java.lang.String sCacheDirectoryBasePath;
    private static java.lang.String sCacheSubDirectory;
    private static java.lang.String sDataDirectoryBasePath;
    private static java.lang.String sDataDirectorySuffix;
    private static java.util.concurrent.FutureTask<java.lang.String[]> sDirPathFetchTask;
    private static final java.util.concurrent.atomic.AtomicBoolean sInitializationStarted = new java.util.concurrent.atomic.AtomicBoolean();

    private PathUtils() {
    }

    private static void chmod(java.lang.String str, int i17) {
        try {
            android.system.Os.chmod(str, i17);
        } catch (java.lang.Exception unused) {
            org.chromium.base.Log.e(TAG, "Failed to set permissions for path \"" + str + "\"");
        }
    }

    public static java.lang.String[] getAllPrivateDownloadsDirectories() {
        java.util.List arrayList = new java.util.ArrayList();
        org.chromium.base.StrictModeContext allowDiskWrites = org.chromium.base.StrictModeContext.allowDiskWrites();
        try {
            java.io.File[] externalFilesDirs = org.chromium.base.ContextUtils.getApplicationContext().getExternalFilesDirs(android.os.Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = java.util.Arrays.asList(externalFilesDirs);
            }
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return toAbsolutePathStrings(arrayList);
        } catch (java.lang.Throwable th6) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static java.lang.String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static java.lang.String getDataDirectory() {
        return getDirectoryPath(0);
    }

    private static java.lang.String getDirectoryPath(int i17) {
        return getOrComputeDirectoryPaths()[i17];
    }

    public static java.lang.String getDownloadsDirectory() {
        org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
        try {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                java.lang.String path = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS).getPath();
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return path;
            }
            java.lang.String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            java.lang.String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return str;
        } catch (java.lang.Throwable th6) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static java.lang.String[] getExternalDownloadVolumesNames() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : org.chromium.base.compat.ApiHelperForQ.getExternalVolumeNames(org.chromium.base.ContextUtils.getApplicationContext())) {
            if (!android.text.TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                java.io.File volumeDir = org.chromium.base.compat.ApiHelperForR.getVolumeDir((android.os.storage.StorageManager) org.chromium.base.compat.ApiHelperForM.getSystemService(org.chromium.base.ContextUtils.getApplicationContext(), android.os.storage.StorageManager.class), android.provider.MediaStore.Files.getContentUri(str));
                java.io.File file = new java.io.File(volumeDir, android.os.Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    org.chromium.base.Log.w(TAG, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), volumeDir.getAbsolutePath(), java.lang.Boolean.valueOf(volumeDir.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return toAbsolutePathStrings(arrayList);
    }

    public static java.lang.String getExternalStorageDirectory() {
        return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static java.lang.String getNativeLibraryDirectory() {
        android.content.pm.ApplicationInfo applicationInfo = org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo();
        int i17 = applicationInfo.flags;
        return ((i17 & 128) != 0 || (i17 & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    private static java.lang.String[] getOrComputeDirectoryPaths() {
        if (!sDirPathFetchTask.isDone()) {
            org.chromium.base.StrictModeContext allowDiskWrites = org.chromium.base.StrictModeContext.allowDiskWrites();
            try {
                sDirPathFetchTask.run();
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
            } catch (java.lang.Throwable th6) {
                if (allowDiskWrites != null) {
                    try {
                        allowDiskWrites.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        try {
            return sDirPathFetchTask.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static java.lang.String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static void resetForTesting() {
        sInitializationStarted.set(false);
        sDirPathFetchTask = null;
        sDataDirectorySuffix = null;
        sCacheSubDirectory = null;
        sDataDirectoryBasePath = null;
        sCacheDirectoryBasePath = null;
    }

    public static void setPrivateDataDirectorySuffix(java.lang.String str, java.lang.String str2) {
        setPrivateDirectoryPath(null, null, str, str2);
    }

    public static void setPrivateDirectoryPath(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (sInitializationStarted.getAndSet(true)) {
            return;
        }
        sDataDirectoryBasePath = str;
        sCacheDirectoryBasePath = str2;
        sDataDirectorySuffix = str3;
        sCacheSubDirectory = str4;
        sDirPathFetchTask = new java.util.concurrent.FutureTask<>(new org.chromium.base.PathUtils$$a());
        org.chromium.base.task.AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String[] setPrivateDirectoryPathInternal() {
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr = new java.lang.String[3];
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        if (sDataDirectoryBasePath == null) {
            file = applicationContext.getDir(sDataDirectorySuffix, 0);
            file2 = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0);
        } else {
            file = new java.io.File(sDataDirectoryBasePath, sDataDirectorySuffix);
            file.mkdirs();
            java.io.File file3 = new java.io.File(sDataDirectoryBasePath, THUMBNAIL_DIRECTORY_NAME);
            file3.mkdirs();
            file2 = file3;
        }
        java.io.File file4 = sCacheDirectoryBasePath != null ? new java.io.File(sCacheDirectoryBasePath) : applicationContext.getCacheDir();
        if (file4 != null) {
            if (sCacheSubDirectory != null) {
                file4 = new java.io.File(file4, sCacheSubDirectory);
            }
            if (sCacheDirectoryBasePath != null || sCacheSubDirectory != null) {
                file4.mkdirs();
                chmod(file4.getPath(), 1472);
            }
            strArr[2] = file4.getPath();
        }
        java.lang.String path = file.getPath();
        strArr[0] = path;
        chmod(path, com.tencent.wcdb.FileUtils.S_IRWXU);
        strArr[1] = file2.getPath();
        return strArr;
    }

    private static java.lang.String[] toAbsolutePathStrings(java.util.List<java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : list) {
            if (file != null && !android.text.TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static void setPrivateDataDirectorySuffix(java.lang.String str) {
        setPrivateDataDirectorySuffix(str, null);
    }
}
