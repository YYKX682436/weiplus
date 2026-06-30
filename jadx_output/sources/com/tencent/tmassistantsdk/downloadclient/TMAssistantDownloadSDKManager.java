package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKManager {
    protected static com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager mInstance;
    protected android.content.Context mContext;
    protected static java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient> mSDKClientList = new java.util.ArrayList<>();
    protected static com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient mSDKSettingClient = null;
    protected static java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient> mOpenSDKClientList = new java.util.ArrayList<>();

    public TMAssistantDownloadSDKManager(android.content.Context context) {
        this.mContext = context;
    }

    public static java.lang.String about() {
        return "TMAssistantDownloadSDKManager_2014_03_04_17_55_release_25406";
    }

    public static synchronized void closeAllService(android.content.Context context) {
        synchronized (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.class) {
            com.tencent.tmassistantsdk.util.TMLog.i("TMAssistantDownloadSDKManager", "closeAllService method!");
            if (mInstance == null) {
                com.tencent.tmassistantsdk.util.TMLog.i("TMAssistantDownloadSDKManager", "manager minstance == null");
                return;
            }
            java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient> arrayList = mSDKClientList;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
                while (it.hasNext()) {
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient next = it.next();
                    if (next != null) {
                        next.unInitTMAssistantDownloadSDK();
                    }
                }
                mSDKClientList.clear();
            }
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = mSDKSettingClient;
            if (tMAssistantDownloadSDKSettingClient != null) {
                tMAssistantDownloadSDKSettingClient.unInitTMAssistantDownloadSDK();
                mSDKSettingClient = null;
            }
            mInstance = null;
        }
    }

    public static synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager getInstance(android.content.Context context) {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager tMAssistantDownloadSDKManager;
        synchronized (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager(context);
            }
            tMAssistantDownloadSDKManager = mInstance;
        }
        return tMAssistantDownloadSDKManager;
    }

    public synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient getDownloadOpenSDKClient(java.lang.String str) {
        java.util.Iterator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient> it = mOpenSDKClientList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient next = it.next();
            if (next.mClientKey.equals(str)) {
                return next;
            }
        }
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient(this.mContext, str, "com.tencent.android.qqdownloader.SDKService");
        if (!tMAssistantDownloadOpenSDKClient.initTMAssistantDownloadSDK()) {
            return null;
        }
        mOpenSDKClientList.add(tMAssistantDownloadOpenSDKClient);
        return tMAssistantDownloadOpenSDKClient;
    }

    public synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient getDownloadSDKClient(java.lang.String str) {
        if (str != null) {
            if (str.length() > 0) {
                java.util.Iterator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
                while (it.hasNext()) {
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient next = it.next();
                    if (next.mClientKey.equals(str)) {
                        return next;
                    }
                }
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient(this.mContext, str);
                tMAssistantDownloadSDKClient.initTMAssistantDownloadSDK();
                mSDKClientList.add(tMAssistantDownloadSDKClient);
                return tMAssistantDownloadSDKClient;
            }
        }
        return null;
    }

    public synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient getDownloadSDKSettingClient() {
        if (mSDKSettingClient == null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient(this.mContext, "TMAssistantDownloadSDKManager");
            mSDKSettingClient = tMAssistantDownloadSDKSettingClient;
            tMAssistantDownloadSDKSettingClient.initTMAssistantDownloadSDK();
        }
        return mSDKSettingClient;
    }

    public synchronized boolean releaseDownloadSDKClient(java.lang.String str) {
        java.util.Iterator<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient next = it.next();
            if (next != null && next.mClientKey.equals(str)) {
                next.unInitTMAssistantDownloadSDK();
                it.remove();
                return true;
            }
        }
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = mSDKSettingClient;
        if (tMAssistantDownloadSDKSettingClient == null || !tMAssistantDownloadSDKSettingClient.mClientKey.equals(str)) {
            return false;
        }
        mSDKSettingClient.unInitTMAssistantDownloadSDK();
        mSDKSettingClient = null;
        return true;
    }
}
