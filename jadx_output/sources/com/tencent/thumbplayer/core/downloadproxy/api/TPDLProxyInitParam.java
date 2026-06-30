package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public class TPDLProxyInitParam implements java.io.Serializable {
    private java.lang.String appVer;
    private java.lang.String cacheDir;
    private java.lang.String configStr;
    private java.lang.String dataDir;
    private java.lang.String guid;
    private int platform;

    public TPDLProxyInitParam(int i17, java.lang.String str, java.lang.String str2) {
        this.cacheDir = "";
        this.dataDir = "";
        this.configStr = "";
        this.platform = i17;
        this.appVer = str;
        this.guid = str2;
    }

    public java.lang.String getAppVer() {
        return this.appVer;
    }

    public java.lang.String getCacheDir() {
        return this.cacheDir;
    }

    public java.lang.String getConfigStr() {
        return this.configStr;
    }

    public java.lang.String getDataDir() {
        return this.dataDir;
    }

    public java.lang.String getGuid() {
        return this.guid;
    }

    public int getPlatform() {
        return this.platform;
    }

    public TPDLProxyInitParam(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(i17, str, str2);
        if (android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        this.dataDir = str3;
    }

    public TPDLProxyInitParam(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(i17, str, str2, str4);
        if (!android.text.TextUtils.isEmpty(str3)) {
            this.cacheDir = str3;
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            this.dataDir = str4;
        }
        if (android.text.TextUtils.isEmpty(str5)) {
            return;
        }
        this.configStr = str5;
    }
}
