package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public class TPDownloadProxyFactory {
    private static final java.lang.String FILE_NAME = "TPDownloadProxyFactory";
    private static com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl downloadProxyFactoryAidl;
    private static java.lang.Object mMapObject = new java.lang.Object();
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy> mvTPDownloadProxyMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient> mvTPDownloadProxyClientMap = new java.util.HashMap<>();
    private static boolean mUseService = false;
    private static boolean mCanUseAIDL = false;
    private static boolean mIsReadyForDownload = false;
    private static com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyBindServiceCallback mCallback = null;
    private static android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl unused = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.downloadProxyFactoryAidl = com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub.asInterface(iBinder);
            try {
                for (java.util.Map.Entry entry : com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.mvTPDownloadProxyClientMap.entrySet()) {
                    ((com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient) entry.getValue()).updateAidl(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.downloadProxyFactoryAidl.getTPDownloadProxy(((java.lang.Integer) entry.getKey()).intValue()));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onServiceConnected failed, error:" + th6.toString());
            }
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on service connected!");
            if (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.downloadProxyFactoryAidl == null) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl is null!");
                return;
            }
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl not null!");
            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.setCanUseAIDL(true);
            if (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.mCallback != null) {
                com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.mCallback.onBindSuccess();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on service disconnected");
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl unused = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.downloadProxyFactoryAidl = null;
            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.setCanUseAIDL(false);
            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.ensurePlayManagerService(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.mCallback);
        }
    };

    public static synchronized boolean canUseService() {
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            if (!mUseService) {
                return true;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    tPDownloadProxyFactoryAidl.isReadyForPlay();
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "canUseService failed, error:" + th6.toString());
                }
            }
            return false;
        }
    }

    public static boolean ensurePlayManagerService(com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyBindServiceCallback tPDLProxyBindServiceCallback) {
        android.content.Context context = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getContext();
        if (context == null) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService get context null!");
            return false;
        }
        mCallback = tPDLProxyBindServiceCallback;
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService ".concat("ok"));
        try {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.class);
            context.startService(intent);
            if (!context.bindService(intent, mConnection, 1)) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService bind service failed!");
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService failed, error:" + th6.toString());
            return false;
        }
    }

    public static synchronized boolean getCanUseAIDL() {
        boolean z17;
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            z17 = mCanUseAIDL;
        }
        return z17;
    }

    public static java.lang.String getNativeVersion() {
        if (mUseService && mCanUseAIDL) {
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    return tPDownloadProxyFactoryAidl.getNativeVersion();
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getNativeVersion failed, error:" + th6.toString());
                }
            }
            return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getNativeVersion();
        }
        return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getNativeVersion();
    }

    public static com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy getTPDownloadProxy(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy iTPDownloadProxy;
        if (i17 <= 0) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy is invalid, serviceType:" + i17);
            return null;
        }
        if (!mUseService) {
            synchronized (mMapObject) {
                iTPDownloadProxy = mvTPDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
                if (iTPDownloadProxy == null) {
                    iTPDownloadProxy = new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy(i17);
                    mvTPDownloadProxyMap.put(java.lang.Integer.valueOf(i17), iTPDownloadProxy);
                }
            }
            return iTPDownloadProxy;
        }
        if (!mCanUseAIDL) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, can't use aidl!");
            return null;
        }
        try {
            return getTPDownloadProxyService(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, error:" + th6.toString());
            return null;
        }
    }

    private static synchronized com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy getTPDownloadProxyService(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient tPDownloadProxyClient;
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            if (downloadProxyFactoryAidl == null) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, aidl is null!");
                return null;
            }
            synchronized (mvTPDownloadProxyClientMap) {
                tPDownloadProxyClient = mvTPDownloadProxyClientMap.get(java.lang.Integer.valueOf(i17));
                if (tPDownloadProxyClient == null) {
                    try {
                        tPDownloadProxyClient = new com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient(downloadProxyFactoryAidl.getTPDownloadProxy(i17));
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, error:" + th6.toString());
                    }
                }
                mvTPDownloadProxyClientMap.put(java.lang.Integer.valueOf(i17), tPDownloadProxyClient);
            }
            return tPDownloadProxyClient;
        }
    }

    public static boolean getUseService() {
        return mUseService;
    }

    public static synchronized boolean isReadyForDownload() {
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            boolean z17 = false;
            if (!mUseService) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload ret:" + mIsReadyForDownload);
                return mIsReadyForDownload;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    z17 = tPDownloadProxyFactoryAidl.isReadyForDownload();
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload failed, error:" + th6.toString());
                }
            }
            return z17;
        }
    }

    public static synchronized boolean isReadyForPlay() {
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            boolean z17 = false;
            if (!mUseService) {
                boolean isReadyForWork = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isReadyForWork();
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay ret:" + isReadyForWork);
                return isReadyForWork;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    z17 = tPDownloadProxyFactoryAidl.isReadyForPlay();
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay failed, error:" + th6.toString());
                }
            }
            return z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setCanUseAIDL(boolean z17) {
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            mCanUseAIDL = z17;
        }
    }

    public static synchronized void setReadyForDownload(boolean z17) {
        synchronized (com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.class) {
            mIsReadyForDownload = z17;
        }
    }

    public static void setUseService(boolean z17) {
        mUseService = z17;
    }
}
