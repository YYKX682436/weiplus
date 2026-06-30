package io.flutter.util;

/* loaded from: classes12.dex */
public final class PathUtils {
    private static java.lang.String flutterCacheDirName;

    public static java.lang.String getCacheDirectory(android.content.Context context) {
        java.io.File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new java.io.File(getDataDirPath(context), "cache");
        }
        if (flutterCacheDirName == null) {
            flutterCacheDirName = android.os.Build.MODEL;
        }
        java.io.File file = new java.io.File(codeCacheDir, "flutter_" + flutterCacheDirName);
        file.mkdirs();
        return file.getPath();
    }

    private static java.lang.String getDataDirPath(android.content.Context context) {
        return context.getDataDir().getPath();
    }

    public static java.lang.String getDataDirectory(android.content.Context context) {
        java.io.File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new java.io.File(getDataDirPath(context), "app_flutter");
        }
        return dir.getPath();
    }

    public static java.lang.String getFilesDir(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new java.io.File(getDataDirPath(context), "files");
        }
        return filesDir.getPath();
    }

    public static void setFlutterCacheDirName(java.lang.String str) {
        flutterCacheDirName = str;
    }
}
