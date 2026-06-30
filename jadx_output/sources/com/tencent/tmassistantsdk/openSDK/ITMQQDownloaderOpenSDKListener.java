package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public interface ITMQQDownloaderOpenSDKListener {
    void OnDownloadTaskProgressChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, long j17, long j18);

    void OnDownloadTaskStateChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i17, int i18, java.lang.String str);

    void OnQQDownloaderInvalid();

    void OnServiceFree();
}
