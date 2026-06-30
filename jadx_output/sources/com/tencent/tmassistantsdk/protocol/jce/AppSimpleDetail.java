package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class AppSimpleDetail extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl> cache_apkDownUrl;
    public java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl> apkDownUrl;
    public long apkId;
    public java.lang.String apkMd5;
    public long appId;
    public java.lang.String appName;
    public java.lang.String channelId;
    public java.lang.String diffApkMd5;
    public long diffFileSize;
    public long fileSize;
    public java.lang.String iconUrl;
    public java.lang.String packageName;
    public java.lang.String signatureMd5;
    public int versionCode;
    public java.lang.String versionName;

    public AppSimpleDetail() {
        this.appId = 0L;
        this.apkId = 0L;
        this.appName = "";
        this.iconUrl = "";
        this.packageName = "";
        this.versionName = "";
        this.versionCode = 0;
        this.signatureMd5 = "";
        this.apkMd5 = "";
        this.fileSize = 0L;
        this.apkDownUrl = null;
        this.diffApkMd5 = "";
        this.diffFileSize = 0L;
        this.channelId = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.appId = jceInputStream.read(this.appId, 0, false);
        this.apkId = jceInputStream.read(this.apkId, 1, false);
        this.appName = jceInputStream.readString(2, false);
        this.iconUrl = jceInputStream.readString(3, false);
        this.packageName = jceInputStream.readString(4, false);
        this.versionName = jceInputStream.readString(5, false);
        this.versionCode = jceInputStream.read(this.versionCode, 6, false);
        this.signatureMd5 = jceInputStream.readString(7, false);
        this.apkMd5 = jceInputStream.readString(8, false);
        this.fileSize = jceInputStream.read(this.fileSize, 9, false);
        if (cache_apkDownUrl == null) {
            cache_apkDownUrl = new java.util.ArrayList<>();
            cache_apkDownUrl.add(new com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl());
        }
        this.apkDownUrl = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_apkDownUrl, 10, false);
        this.diffApkMd5 = jceInputStream.readString(11, false);
        this.diffFileSize = jceInputStream.read(this.diffFileSize, 12, false);
        this.channelId = jceInputStream.readString(13, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appId, 0);
        jceOutputStream.write(this.apkId, 1);
        java.lang.String str = this.appName;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        java.lang.String str2 = this.iconUrl;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        java.lang.String str3 = this.packageName;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        java.lang.String str4 = this.versionName;
        if (str4 != null) {
            jceOutputStream.write(str4, 5);
        }
        jceOutputStream.write(this.versionCode, 6);
        java.lang.String str5 = this.signatureMd5;
        if (str5 != null) {
            jceOutputStream.write(str5, 7);
        }
        java.lang.String str6 = this.apkMd5;
        if (str6 != null) {
            jceOutputStream.write(str6, 8);
        }
        jceOutputStream.write(this.fileSize, 9);
        java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl> arrayList = this.apkDownUrl;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 10);
        }
        java.lang.String str7 = this.diffApkMd5;
        if (str7 != null) {
            jceOutputStream.write(str7, 11);
        }
        jceOutputStream.write(this.diffFileSize, 12);
        java.lang.String str8 = this.channelId;
        if (str8 != null) {
            jceOutputStream.write(str8, 13);
        }
    }

    public AppSimpleDetail(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, long j19, java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl> arrayList, java.lang.String str7, long j27, java.lang.String str8) {
        this.appId = j17;
        this.apkId = j18;
        this.appName = str;
        this.iconUrl = str2;
        this.packageName = str3;
        this.versionName = str4;
        this.versionCode = i17;
        this.signatureMd5 = str5;
        this.apkMd5 = str6;
        this.fileSize = j19;
        this.apkDownUrl = arrayList;
        this.diffApkMd5 = str7;
        this.diffFileSize = j27;
        this.channelId = str8;
    }
}
