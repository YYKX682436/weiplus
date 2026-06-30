package com.tencent.tmassistantsdk.openSDK.QQDownloader;

/* loaded from: classes13.dex */
public class QQDownloaderInstalled extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "QQDownloaderInstalled";
    protected static com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled mInstance;
    protected boolean isRegisted = false;
    protected com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.IQQDownloaderInstalled mListener = null;

    /* loaded from: classes13.dex */
    public interface IQQDownloaderInstalled {
        void onQQDownloaderInstalled(android.content.Context context);
    }

    private QQDownloaderInstalled() {
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled getInstance() {
        com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled qQDownloaderInstalled;
        synchronized (com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled();
            }
            qQDownloaderInstalled = mInstance;
        }
        return qQDownloaderInstalled;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final android.content.Context context, android.content.Intent intent) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onReceive!");
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.IQQDownloaderInstalled iQQDownloaderInstalled = com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.this.mListener;
                if (iQQDownloaderInstalled != null) {
                    iQQDownloaderInstalled.onQQDownloaderInstalled(context);
                }
            }
        });
    }

    public void registeListener(com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.IQQDownloaderInstalled iQQDownloaderInstalled) {
        this.mListener = iQQDownloaderInstalled;
    }

    public void registeReceiver(android.content.Context context) {
        if (this.isRegisted) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
        try {
            this.isRegisted = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "registeReceiver exception!!!");
            this.isRegisted = false;
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    public void unRegisteReceiver(android.content.Context context) {
        if (context == null || mInstance == null || !this.isRegisted) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
        try {
            this.isRegisted = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "unRegisteReceiver exception!!!");
            this.isRegisted = false;
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    public void unregisteListener() {
        this.mListener = null;
    }
}
