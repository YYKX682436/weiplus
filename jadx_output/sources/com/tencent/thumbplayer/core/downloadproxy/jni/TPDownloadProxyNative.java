package com.tencent.thumbplayer.core.downloadproxy.jni;

/* loaded from: classes16.dex */
public class TPDownloadProxyNative {
    private static final java.lang.String FILE_NAME = "TPDownloadProxyNative";
    private static android.content.Context appContext;
    private static boolean isLoadDownloadProxySucceed;
    private byte _hellAccFlag_;
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader mLibLoader;

    /* loaded from: classes15.dex */
    public static class SingletonHolder {
        private static final com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative INSTANCE = new com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative();

        private SingletonHolder() {
        }
    }

    private TPDownloadProxyNative() {
    }

    public static com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative getInstance() {
        return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.SingletonHolder.INSTANCE;
    }

    private static int nativeIntMessageCallback(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().handleIntCallbackMessage(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    private static void nativeLogCallback(int i17, byte[] bArr, int i18, byte[] bArr2, byte[] bArr3) {
        if (i17 == 6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr), i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr3));
            return;
        }
        if (i17 == 5) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.w(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr), i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr3));
            return;
        }
        if (i17 == 4) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr), i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr3));
        } else if (i17 == 3) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.d(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr), i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr3));
        } else {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr), i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(bArr3));
        }
    }

    private static void nativeMessageCallback(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().handleCallbackMessage(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    private static java.lang.String nativeStringMessageCallback(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().handleStringCallbackMessage(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    public native int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17);

    public native int clearCache(java.lang.String str, java.lang.String str2, int i17);

    public native int createDownloadTask(int i17, java.lang.String str, int i18, int i19);

    public native int deInitService(int i17);

    public native int deleteCache(java.lang.String str, java.lang.String str2);

    public android.content.Context getAppContext() {
        return appContext;
    }

    public native byte[] getClipPlayUrl(int i17, int i18, int i19);

    public native byte[] getErrorCodeStr(int i17);

    public native byte[] getHLSOfflineExttag(java.lang.String str, java.lang.String str2, int i17, long j17);

    public native byte[] getNativeInfo(int i17);

    public java.lang.String getNativeVersion() {
        java.lang.String byteArrayToString = isLoadDownloadProxySucceed ? com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(getVersion()) : "2.20.0.00016";
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "get native version:" + byteArrayToString);
        return byteArrayToString;
    }

    public native long getResourceSize(java.lang.String str, java.lang.String str2);

    public native byte[] getVersion();

    public native int initService(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    public boolean isNativeLoaded() {
        if (!isLoadDownloadProxySucceed) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader = this.mLibLoader;
                if (iTPDLProxyNativeLibLoader != null) {
                    boolean loadLib = iTPDLProxyNativeLibLoader.loadLib("DownloadProxy", getNativeVersion());
                    isLoadDownloadProxySucceed = loadLib;
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "third module so load ret:".concat(loadLib ? "0" : "1"));
                }
            } catch (java.lang.Throwable th6) {
                isLoadDownloadProxySucceed = false;
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "third module so load failed, error:" + th6.toString());
            }
            try {
                if (!isLoadDownloadProxySucceed) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add("DownloadProxy");
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    isLoadDownloadProxySucceed = true;
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "system so load success!");
                }
            } catch (java.lang.Throwable th7) {
                isLoadDownloadProxySucceed = false;
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "system so load failed, error:" + th7.toString());
            }
        }
        return isLoadDownloadProxySucceed;
    }

    public native boolean isNativeReadyForWork();

    public boolean isReadyForWork() {
        if (isLoadDownloadProxySucceed) {
            return isNativeReadyForWork();
        }
        return false;
    }

    public native int pauseDownload(int i17);

    public native void pushEvent(int i17);

    public native int resumeDownload(int i17);

    public void setAppContext(android.content.Context context) {
        if (context != null) {
            appContext = context.getApplicationContext();
        }
    }

    public native int setClipInfo(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public void setLibLoader(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "set third module so loader!!!");
        this.mLibLoader = iTPDLProxyNativeLibLoader;
    }

    public native int setMaxStorageSizeMB(int i17, long j17);

    public native void setPlayerState(int i17, int i18);

    public native void setServiceConfig(int i17, java.lang.String str);

    public native void setUserData(java.lang.String str, java.lang.String str2);

    public native int startDownload(int i17);

    public native int stopAllDownload(int i17);

    public native int stopDownload(int i17);

    public native void updatePlayerPlayMsg(int i17, int i18, int i19, int i27);

    public native int updateStoragePath(int i17, java.lang.String str);

    public native void updateTaskInfo(int i17, java.lang.String str, java.lang.String str2);

    public native long verifyOfflineCacheSync(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);
}
