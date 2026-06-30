package com.tencent.thumbplayer.adapter.player;

/* loaded from: classes16.dex */
public class TPUrlDataSource {
    private java.lang.String selfPlayerUrl;
    private java.lang.String systemPlayerUrl;

    public TPUrlDataSource(java.lang.String str) {
        this.systemPlayerUrl = str;
        this.selfPlayerUrl = str;
    }

    public java.lang.String getSelfPlayerUrl() {
        return this.selfPlayerUrl;
    }

    public java.lang.String getSystemPlayerUrl() {
        return this.systemPlayerUrl;
    }

    public void setSelfPlayerUrl(java.lang.String str) {
        this.selfPlayerUrl = str;
    }

    public void setSystemPlayerUrl(java.lang.String str) {
        this.systemPlayerUrl = str;
    }
}
