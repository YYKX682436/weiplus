package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKURLTool implements com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner {
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKExchangeURL";
    protected static com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool mInstance;
    protected com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine engine;
    protected com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner mListener;

    private TMAssistantDownloadSDKURLTool(com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        this.mListener = null;
        this.engine = null;
        if (iTMAssistantExchangeURLListenner == null) {
            com.tencent.tmassistantsdk.util.TMLog.e(TAG, "ITMAssistantExchangeURLListenner listener shouldn't be null!");
        } else {
            this.mListener = iTMAssistantExchangeURLListenner;
            this.engine = new com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine(this.mListener);
        }
    }

    public static synchronized com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool getInstance(com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool tMAssistantDownloadSDKURLTool;
        synchronized (com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool(iTMAssistantExchangeURLListenner);
            }
            tMAssistantDownloadSDKURLTool = mInstance;
        }
        return tMAssistantDownloadSDKURLTool;
    }

    public void exchangeUrlsFromPackageNames(java.util.ArrayList<java.lang.String> arrayList) {
        com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine getAppSimpleDetailEngine;
        if (arrayList == null) {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, "packageNames is null!");
            return;
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String[] split = it.next().split(";");
            if (split != null && split.length > 0) {
                com.tencent.tmassistantsdk.protocol.jce.AppDetailParam appDetailParam = new com.tencent.tmassistantsdk.protocol.jce.AppDetailParam();
                appDetailParam.packageName = split[0];
                if (split.length > 1) {
                    appDetailParam.channelId = split[1];
                }
                arrayList2.add(appDetailParam);
            }
        }
        if (arrayList2.size() <= 0 || (getAppSimpleDetailEngine = this.engine) == null) {
            return;
        }
        getAppSimpleDetailEngine.sendReuqest(arrayList2);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner
    public void onExchangedURLSucceed(java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail> arrayList, boolean z17) {
        com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner = this.mListener;
        if (iTMAssistantExchangeURLListenner != null) {
            iTMAssistantExchangeURLListenner.onExchangedURLSucceed(arrayList, z17);
        }
    }
}
