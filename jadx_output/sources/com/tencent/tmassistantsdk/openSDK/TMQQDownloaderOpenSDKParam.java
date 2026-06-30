package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class TMQQDownloaderOpenSDKParam {
    public java.lang.String SNGAppId;
    public java.lang.String actionFlag;
    public java.lang.String channelId;
    public java.lang.String sdkId;
    public java.lang.String taskApkId;
    public java.lang.String taskAppId;
    public java.lang.String taskPackageName;
    public int taskVersion;
    public java.lang.String uin;
    public java.lang.String uinType;
    public java.lang.String via;

    public TMQQDownloaderOpenSDKParam() {
        this.SNGAppId = "";
        this.taskAppId = "";
        this.taskApkId = "";
        this.taskVersion = 0;
        this.via = "";
        this.taskPackageName = "";
        this.uin = "";
        this.uinType = "";
        this.channelId = "";
        this.actionFlag = "0";
        this.sdkId = "";
    }

    public TMQQDownloaderOpenSDKParam(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.sdkId = "";
        this.SNGAppId = str;
        this.taskAppId = str2;
        this.taskApkId = str3;
        this.taskVersion = i17;
        this.via = str4;
        this.taskPackageName = str5;
        this.uin = str6;
        this.uinType = str7;
        this.channelId = str8;
        this.actionFlag = str9;
    }
}
