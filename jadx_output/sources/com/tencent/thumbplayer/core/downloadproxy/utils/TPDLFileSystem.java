package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes13.dex */
public class TPDLFileSystem {
    public static void clearCache(android.content.Context context) {
        clearInternalCache(context);
        clearExternalCache(context);
    }

    public static void clearExternalCache(android.content.Context context) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getExternalCacheDirectory(context));
    }

    public static void clearInternalCache(android.content.Context context) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getInternalCacheDirectory(context));
    }

    public static void deleteDirectory(android.content.Context context, java.lang.String str) {
        deleteInternalDirectory(context, str);
        deleteExternalDirectory(context, str);
    }

    public static void deleteExternalDirectory(android.content.Context context, java.lang.String str) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getExternalDirectory(context, str));
    }

    public static void deleteInternalDirectory(android.content.Context context, java.lang.String str) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getInternalDirectory(context, str));
    }

    public static java.io.File getExternalCacheDirectory(android.content.Context context) {
        return context.getExternalCacheDir();
    }

    public static java.io.File getExternalCacheFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File externalCacheDirectory = getExternalCacheDirectory(context, str);
        if (externalCacheDirectory == null) {
            return null;
        }
        return new java.io.File(externalCacheDirectory, str2);
    }

    public static java.io.File getExternalDirectory(android.content.Context context) {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(externalStorageDirectory.getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append("Android");
        sb6.append(str);
        sb6.append(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        sb6.append(str);
        sb6.append(context.getPackageName());
        sb6.append(str);
        sb6.append("files");
        return new java.io.File(sb6.toString());
    }

    public static java.io.File getExternalFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File externalDirectory = getExternalDirectory(context, str);
        if (externalDirectory == null) {
            return null;
        }
        return new java.io.File(externalDirectory, str2);
    }

    public static java.io.File getInternalCacheDirectory(android.content.Context context) {
        return context.getCacheDir();
    }

    public static java.io.File getInternalCacheFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File internalCacheDirectory = getInternalCacheDirectory(context, str);
        if (internalCacheDirectory == null) {
            return null;
        }
        return new java.io.File(internalCacheDirectory, str2);
    }

    public static java.io.File getInternalDirectory(android.content.Context context) {
        return context.getFilesDir();
    }

    public static java.io.File getInternalFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File internalDirectory = getInternalDirectory(context, str);
        if (internalDirectory == null) {
            return null;
        }
        return new java.io.File(internalDirectory, str2);
    }

    public static java.io.File getNewerCacheFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.compare(getInternalCacheFile(context, str, str2), getExternalCacheFile(context, str, str2));
    }

    public static java.io.File getNewerFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.compare(getInternalFile(context, str, str2), getExternalFile(context, str, str2));
    }

    public static java.io.File getProperCacheDirectory(android.content.Context context, java.lang.String str) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.isExternalStorageMounted() ? getExternalCacheDirectory(context, str) : getInternalCacheDirectory(context, str);
    }

    public static java.io.File getProperCacheFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.isExternalStorageMounted() ? getExternalCacheFile(context, str, str2) : getInternalCacheFile(context, str, str2);
    }

    public static java.io.File getProperDirectory(android.content.Context context, java.lang.String str) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.isExternalStorageMounted() ? getExternalDirectory(context, str) : getInternalDirectory(context, str);
    }

    public static java.io.File getProperFile(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.isExternalStorageMounted() ? getExternalFile(context, str, str2) : getInternalFile(context, str, str2);
    }

    public static void clearExternalCache(android.content.Context context, java.lang.String str) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getExternalCacheDirectory(context, str));
    }

    public static void clearInternalCache(android.content.Context context, java.lang.String str) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.recursiveDelete(getInternalCacheDirectory(context, str));
    }

    public static java.io.File getExternalCacheDirectory(android.content.Context context, java.lang.String str) {
        java.io.File externalCacheDirectory = getExternalCacheDirectory(context);
        if (externalCacheDirectory == null) {
            return null;
        }
        return new java.io.File(externalCacheDirectory.getAbsolutePath() + java.io.File.separator + str);
    }

    public static java.io.File getInternalCacheDirectory(android.content.Context context, java.lang.String str) {
        java.io.File internalCacheDirectory = getInternalCacheDirectory(context);
        if (internalCacheDirectory == null) {
            return null;
        }
        return new java.io.File(internalCacheDirectory.getAbsolutePath() + java.io.File.separator + str);
    }

    public static java.io.File getInternalDirectory(android.content.Context context, java.lang.String str) {
        java.io.File internalDirectory = getInternalDirectory(context);
        if (internalDirectory == null) {
            return null;
        }
        return new java.io.File(internalDirectory.getAbsolutePath() + java.io.File.separator + str);
    }

    public static void clearCache(android.content.Context context, java.lang.String str) {
        clearInternalCache(context, str);
        clearExternalCache(context, str);
    }

    public static java.io.File getExternalDirectory(android.content.Context context, java.lang.String str) {
        java.io.File externalDirectory = getExternalDirectory(context);
        if (externalDirectory == null) {
            return null;
        }
        return new java.io.File(externalDirectory.getAbsolutePath() + java.io.File.separator + str);
    }
}
