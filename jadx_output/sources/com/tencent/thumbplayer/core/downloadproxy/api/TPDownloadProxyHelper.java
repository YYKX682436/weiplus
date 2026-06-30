package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public class TPDownloadProxyHelper {
    private static final java.lang.String FILE_NAME = "TPDownloadProxyHelper";
    private static android.content.Context applicationContext;
    private static com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineVinfoAdapter offlineVinfoAdapter;

    public static java.lang.String checkVideoStatus(java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter;
        return (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.canUseService() && (iTPOfflineVinfoAdapter = offlineVinfoAdapter) != null) ? iTPOfflineVinfoAdapter.checkVideoStatus(str, str2) : "";
    }

    public static android.content.Context getContext() {
        return applicationContext;
    }

    public static java.lang.String getHLSOfflineExttag(java.lang.String str, java.lang.String str2, int i17, long j17) {
        try {
            return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded() ? com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getHLSOfflineExttag(str, str2, i17, j17)) : "";
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "get exttag failed, error:" + th6.toString());
            return "";
        }
    }

    public static java.lang.String getNativeInfo(int i17) {
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getNativeInfo(i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    public static java.lang.String getNativeLibVersion() {
        return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.getNativeVersion();
    }

    public static int getRecordDuration(java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter = offlineVinfoAdapter;
        if (iTPOfflineVinfoAdapter != null) {
            return iTPOfflineVinfoAdapter.getRecordDuration(str, str2);
        }
        return -1;
    }

    public static boolean isReadyForPlay() {
        return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.isReadyForPlay();
    }

    public static void setContext(android.content.Context context) {
        applicationContext = context;
    }

    public static void setNativeLibLoader(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setLibLoader(iTPDLProxyNativeLibLoader);
    }

    public static void setTPOfflineVinfoAdapter(com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter) {
        offlineVinfoAdapter = iTPOfflineVinfoAdapter;
    }

    public static void setTPProxyAdapter(com.tencent.thumbplayer.core.downloadproxy.api.ITPProxyAdapter iTPProxyAdapter) {
    }

    public static void setUseService(boolean z17) {
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.setUseService(z17);
    }

    public static void setUserData(java.lang.String str, java.lang.Object obj) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th6.toString());
            }
        }
    }

    public static long verifyOfflineCacheSync(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        try {
            if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().verifyOfflineCacheSync(str, i17, str2, str3);
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "verify offline cache failed, error:" + th6.toString());
            return -1L;
        }
    }
}
