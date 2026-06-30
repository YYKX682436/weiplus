package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class NetworkMonitorReceiver extends android.content.BroadcastReceiver {
    protected static final int MSG_DELAY_TIME = 3500;
    protected static final int MSG_resumeDownloadTime = 67;
    protected static final java.lang.String TAG = "NetworkMonitorReceiver";
    protected static com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver mInstance;
    protected boolean isRegisterReceiver = false;
    protected final com.tencent.mm.sdk.platformtools.n3 mNetworkChangedHandler = new com.tencent.mm.sdk.platformtools.n3() { // from class: com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.1
        @Override // com.tencent.mm.sdk.platformtools.n3
        public void handleMessage(android.os.Message message) {
            if (message.what != 67) {
                return;
            }
            com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.this.notifyNetworkChanged();
        }
    };
    java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver> mObs = new java.util.ArrayList<>();

    /* loaded from: classes13.dex */
    public interface INetworkChangedObserver {
        void onNetworkChanged();
    }

    public static synchronized com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver getInstance() {
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver networkMonitorReceiver;
        synchronized (com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver();
            }
            networkMonitorReceiver = mInstance;
        }
        return networkMonitorReceiver;
    }

    public void addNetworkChangedObserver(com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver iNetworkChangedObserver) {
        if (this.mObs.contains(iNetworkChangedObserver) || iNetworkChangedObserver == null) {
            return;
        }
        this.mObs.add(iNetworkChangedObserver);
    }

    public void notifyNetworkChanged() {
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver> it = this.mObs.iterator();
        while (it.hasNext()) {
            it.next().onNetworkChanged();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "network changed!");
        this.mNetworkChangedHandler.removeMessages(67);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 67;
        this.mNetworkChangedHandler.sendMessageDelayed(obtain, 3500L);
    }

    public void registerReceiver() {
        android.content.Context context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext();
        if (context == null) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        try {
            context.registerReceiver(this, intentFilter);
            this.isRegisterReceiver = true;
        } catch (java.lang.Throwable th6) {
            this.isRegisterReceiver = false;
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    public void removeNetworkChangedObserver(com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver iNetworkChangedObserver) {
        if (iNetworkChangedObserver != null) {
            this.mObs.remove(iNetworkChangedObserver);
        }
    }

    public void unregisterReceiver() {
        android.content.Context context;
        if (mInstance == null || (context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext()) == null) {
            return;
        }
        try {
            if (this.isRegisterReceiver) {
                context.unregisterReceiver(this);
                this.isRegisterReceiver = false;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }
}
