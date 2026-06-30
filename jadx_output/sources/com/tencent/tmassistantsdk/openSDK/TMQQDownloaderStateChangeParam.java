package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class TMQQDownloaderStateChangeParam {
    public int errorCode;
    public java.lang.String errorMsg;
    public java.lang.String hostPackageName;
    public java.lang.String hostVersion;
    public com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam param;
    public int state;
    public java.lang.String taskId;

    public TMQQDownloaderStateChangeParam(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        this.param = tMQQDownloaderOpenSDKParam;
        this.hostPackageName = str;
        this.hostVersion = str2;
        this.taskId = str3;
        this.state = i17;
        this.errorCode = i18;
        this.errorMsg = str4;
    }

    public TMQQDownloaderStateChangeParam() {
    }
}
