package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes8.dex */
public interface ITMQQDownloaderOpenSDK {
    long addDownloadTaskFromAuthorize(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str);

    long addDownloadTaskFromTaskList(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18);

    void destroyQQDownloaderOpenSDK();

    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam);

    void initQQDownloaderOpenSDK(android.content.Context context);

    boolean registerListener(com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener);

    boolean removeDownloadTask(long j17);

    void startToAuthorized(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str);

    void startToDownloadTaskList(android.content.Context context);

    void startToDownloadTaskList(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18);

    boolean unregisterListener(com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener);
}
