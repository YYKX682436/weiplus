package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class AppDetailParam extends com.qq.taf.jce.JceStruct {
    public byte actionFlag;
    public long apkId;
    public int apkVersionCode;
    public long appId;
    public byte appType;
    public byte authPlatform;
    public java.lang.String channelId;
    public int grayVersionCode;
    public java.lang.String manifestMd5;
    public java.lang.String packageName;
    public java.lang.String signatureMd5;
    public java.lang.String token;
    public java.lang.String verifyAppId;
    public byte verifyType;
    public int versionCode;

    public AppDetailParam() {
        this.appId = 0L;
        this.packageName = "";
        this.signatureMd5 = "";
        this.versionCode = 0;
        this.manifestMd5 = "";
        this.appType = (byte) 1;
        this.apkId = 0L;
        this.apkVersionCode = 0;
        this.channelId = "";
        this.actionFlag = (byte) 0;
        this.grayVersionCode = 0;
        this.token = "";
        this.verifyType = (byte) 0;
        this.authPlatform = (byte) 0;
        this.verifyAppId = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.appId = jceInputStream.read(this.appId, 0, false);
        this.packageName = jceInputStream.readString(1, false);
        this.signatureMd5 = jceInputStream.readString(2, false);
        this.versionCode = jceInputStream.read(this.versionCode, 3, false);
        this.manifestMd5 = jceInputStream.readString(4, false);
        this.appType = jceInputStream.read(this.appType, 5, false);
        this.apkId = jceInputStream.read(this.apkId, 6, false);
        this.apkVersionCode = jceInputStream.read(this.apkVersionCode, 7, false);
        this.channelId = jceInputStream.readString(8, false);
        this.actionFlag = jceInputStream.read(this.actionFlag, 9, false);
        this.grayVersionCode = jceInputStream.read(this.grayVersionCode, 10, false);
        this.token = jceInputStream.readString(11, false);
        this.verifyType = jceInputStream.read(this.verifyType, 12, false);
        this.authPlatform = jceInputStream.read(this.authPlatform, 13, false);
        this.verifyAppId = jceInputStream.readString(14, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appId, 0);
        java.lang.String str = this.packageName;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        java.lang.String str2 = this.signatureMd5;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        jceOutputStream.write(this.versionCode, 3);
        java.lang.String str3 = this.manifestMd5;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        jceOutputStream.write(this.appType, 5);
        jceOutputStream.write(this.apkId, 6);
        jceOutputStream.write(this.apkVersionCode, 7);
        java.lang.String str4 = this.channelId;
        if (str4 != null) {
            jceOutputStream.write(str4, 8);
        }
        jceOutputStream.write(this.actionFlag, 9);
        jceOutputStream.write(this.grayVersionCode, 10);
        java.lang.String str5 = this.token;
        if (str5 != null) {
            jceOutputStream.write(str5, 11);
        }
        jceOutputStream.write(this.verifyType, 12);
        jceOutputStream.write(this.authPlatform, 13);
        java.lang.String str6 = this.verifyAppId;
        if (str6 != null) {
            jceOutputStream.write(str6, 14);
        }
    }

    public AppDetailParam(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, byte b17, long j18, int i18, java.lang.String str4, byte b18, int i19, java.lang.String str5, byte b19, byte b27, java.lang.String str6) {
        this.appId = j17;
        this.packageName = str;
        this.signatureMd5 = str2;
        this.versionCode = i17;
        this.manifestMd5 = str3;
        this.appType = b17;
        this.apkId = j18;
        this.apkVersionCode = i18;
        this.channelId = str4;
        this.actionFlag = b18;
        this.grayVersionCode = i19;
        this.token = str5;
        this.verifyType = b19;
        this.authPlatform = b27;
        this.verifyAppId = str6;
    }
}
