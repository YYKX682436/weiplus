package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPNativeLibraryLoader {
    private static final java.lang.String DEFAULT_LIB_PLAYER_CORE_VERSION = "2.33.0.1025.wechat";
    private static final java.lang.String MAIN_PLAYER_CORE_VERSION = "2.33.0";
    private static boolean mIsLibLoaded = false;
    private static java.lang.Object mIsLibLoadedLock = new java.lang.Object();
    private static final boolean mIsNeedLoadThirdPartiesAndFFmpeg = true;
    private static final java.lang.String mLibFFmpegPrefix = "xffmpeg";
    private static com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader mLibLoader = null;
    private static final boolean mLibNameHasArchSuffix = false;
    private static final java.lang.String mLibPlayerCorePrefix = "TPCore-master";
    private static final java.lang.String mLibThirdPartiesPrefix = "TPThirdParties-master";
    private static final boolean mLibXFFmpegEnabled = true;
    private static final int mPlayerCoreSupportMinAndroidAPILevel = 14;
    private byte _hellAccFlag_;

    private static native java.lang.String _getPlayerCoreVersion();

    public static java.lang.String getLibVersion() {
        return getPlayerCoreVersion();
    }

    public static java.lang.String getPlayerCoreVersion() {
        try {
            return _getPlayerCoreVersion();
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getPlayerCoreVersion: *.so is not loaded yet, return the hard-coded version number:2.33.0.1025.wechat");
            return DEFAULT_LIB_PLAYER_CORE_VERSION;
        }
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isLibLoadedAndTryToLoad() {
        boolean z17;
        try {
            loadLibIfNeeded(null);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "TPNativeLibraryLoader isLibLoaded error:" + th6.getMessage());
        }
        synchronized (mIsLibLoadedLock) {
            z17 = mIsLibLoaded;
        }
        return z17;
    }

    private static boolean isMatchJavaAndPlayerCore(java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "javaVersion:" + str + ", coreVersion:" + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        if (split.length < 3 || split2.length < 3) {
            return false;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            if (!split[i17].matches(split2[i17])) {
                return false;
            }
        }
        return true;
    }

    private static boolean loadLib(android.content.Context context) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "loadLib cpu arch:" + com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuArchitecture());
        if (com.tencent.thumbplayer.core.common.TPSystemInfo.getApiLevel() < 14) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, "so load failed, current api level " + com.tencent.thumbplayer.core.common.TPSystemInfo.getApiLevel() + " is less than 14");
            return false;
        }
        if (com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuArchitecture() == 3 || com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuArchitecture() == 4 || com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuArchitecture() == 0) {
            return false;
        }
        com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader = mLibLoader;
        if (!(iTPNativeLibraryExternalLoader != null ? iTPNativeLibraryExternalLoader.loadLib(mLibThirdPartiesPrefix, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(mLibThirdPartiesPrefix, context))) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to load TPThirdParties-master");
            return false;
        }
        com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader2 = mLibLoader;
        if (!(iTPNativeLibraryExternalLoader2 != null ? iTPNativeLibraryExternalLoader2.loadLib(mLibFFmpegPrefix, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(mLibFFmpegPrefix, context))) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to load xffmpeg");
            return false;
        }
        com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader3 = mLibLoader;
        boolean loadLib = iTPNativeLibraryExternalLoader3 != null ? iTPNativeLibraryExternalLoader3.loadLib(mLibPlayerCorePrefix, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(mLibPlayerCorePrefix, context);
        if (loadLib) {
            java.lang.String playerCoreVersion = getPlayerCoreVersion();
            boolean isMatchJavaAndPlayerCore = isMatchJavaAndPlayerCore(MAIN_PLAYER_CORE_VERSION, playerCoreVersion);
            if (!isMatchJavaAndPlayerCore) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "nativePlayerCoreVer(" + playerCoreVersion + ") doesn't match javaPlayerCoreVer:(2.33.0)");
            }
            loadLib = isMatchJavaAndPlayerCore;
        }
        if (loadLib) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "Native libs loaded successfully");
        } else {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to load native libs");
        }
        return loadLib;
    }

    private static boolean loadLibDefault(java.lang.String str, android.content.Context context) {
        boolean z17 = false;
        try {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "loadLibDefault loading " + str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            z17 = true;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "loadLibDefault " + str + " loaded successfully");
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "loadLibDefault failed to load " + str + "," + th6.getMessage());
        }
        if (!z17 && context != null && com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuArchitecture() >= 6) {
            try {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "loadLibDefault try to load " + str + " from APK");
                z17 = com.tencent.thumbplayer.core.common.TPLoadLibFromApk.load(str, com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.class.getClassLoader(), context);
                if (z17) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "loadLibDefault loaded " + str + " from APK successfully");
                } else {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed");
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed," + th7.getMessage());
            }
        }
        return z17;
    }

    public static void loadLibIfNeeded(android.content.Context context) {
        synchronized (mIsLibLoadedLock) {
            if (!mIsLibLoaded) {
                boolean loadLib = loadLib(context);
                mIsLibLoaded = loadLib;
                if (loadLib) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "TPNativeLibraryLoader load lib successfully");
                } else {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "TPNativeLibraryLoader load lib failed");
                }
            }
            if (!mIsLibLoaded) {
                throw new java.lang.UnsupportedOperationException("Failed to load native library");
            }
        }
    }

    public static void setLibLoader(com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader) {
        mLibLoader = iTPNativeLibraryExternalLoader;
    }
}
