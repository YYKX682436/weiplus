package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public interface ITMAssistantDownloadSDKClientListener {
    void OnDownloadSDKTaskProgressChanged(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, java.lang.String str, long j17, long j18);

    void OnDownloadSDKTaskStateChanged(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18);

    void OnDwonloadSDKServiceInvalid(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient);
}
