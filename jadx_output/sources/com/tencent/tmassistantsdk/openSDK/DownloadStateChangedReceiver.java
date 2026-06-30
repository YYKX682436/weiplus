package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class DownloadStateChangedReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "DownloadStateChangedReceiver";
    protected static com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver mInstance;
    protected com.tencent.mm.sdk.platformtools.n3 handler;
    protected boolean isRegisted = false;
    java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener> mListeners = new java.util.ArrayList<>();

    public DownloadStateChangedReceiver() {
        this.handler = null;
        this.handler = new com.tencent.mm.sdk.platformtools.n3("downloadStateChangedThread");
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver getInstance() {
        com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver downloadStateChangedReceiver;
        synchronized (com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver();
            }
            downloadStateChangedReceiver = mInstance;
        }
        return downloadStateChangedReceiver;
    }

    public void addDownloadStateChangedListener(com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener iDownloadStateChangedListener) {
        if (iDownloadStateChangedListener == null || this.mListeners.contains(iDownloadStateChangedListener)) {
            return;
        }
        this.mListeners.add(iDownloadStateChangedListener);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, final android.content.Intent intent) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.handler;
        if (n3Var != null) {
            n3Var.post(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.tmassistantsdk.openSDK.TMQQDownloaderStateChangeParam tMQQDownloaderStateChangeParam = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderStateChangeParam();
                    tMQQDownloaderStateChangeParam.hostPackageName = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_HOST_PAGECKAGENAME);
                    tMQQDownloaderStateChangeParam.hostVersion = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_HOST_VERSION);
                    tMQQDownloaderStateChangeParam.taskId = intent.getStringExtra("taskId");
                    tMQQDownloaderStateChangeParam.errorCode = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE), 0);
                    tMQQDownloaderStateChangeParam.errorMsg = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
                    tMQQDownloaderStateChangeParam.state = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra("state"), 0);
                    com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam();
                    tMQQDownloaderOpenSDKParam.SNGAppId = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_SNGAPPID);
                    tMQQDownloaderOpenSDKParam.taskAppId = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_APPID);
                    tMQQDownloaderOpenSDKParam.taskApkId = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_APKID);
                    tMQQDownloaderOpenSDKParam.taskPackageName = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_PACKAGENAME);
                    tMQQDownloaderOpenSDKParam.taskVersion = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_VERSION), 0);
                    tMQQDownloaderOpenSDKParam.via = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_VIA);
                    tMQQDownloaderOpenSDKParam.uin = intent.getStringExtra("uin");
                    tMQQDownloaderOpenSDKParam.uinType = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_UINTYPE);
                    tMQQDownloaderStateChangeParam.param = tMQQDownloaderOpenSDKParam;
                    java.util.Iterator<com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener> it = com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onDownloadStateChanged(tMQQDownloaderStateChangeParam);
                    }
                }
            });
        }
    }

    public void registeReceiver(android.content.Context context) {
        if (this.isRegisted) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.OPENSDK_ACTION_NAME);
        try {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "" + (fp.h.a(33) ? context.registerReceiver(this, intentFilter) : context.registerReceiver(this, intentFilter, 2)));
            this.isRegisted = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "registeReceiver exception!!!");
            this.isRegisted = false;
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    public void removeDownloadStateChangedListener(com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener iDownloadStateChangedListener) {
        if (iDownloadStateChangedListener != null) {
            this.mListeners.remove(iDownloadStateChangedListener);
        }
    }

    public void unRegisteReceiver(android.content.Context context) {
        if (context == null || mInstance == null || !this.isRegisted) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
        try {
            context.unregisterReceiver(this);
            this.isRegisted = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "unRegisteReceiver exception!!!");
            this.isRegisted = false;
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }
}
