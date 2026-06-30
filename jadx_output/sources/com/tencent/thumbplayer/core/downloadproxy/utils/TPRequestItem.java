package com.tencent.thumbplayer.core.downloadproxy.utils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class TPRequestItem {
    private int mRequestType;
    private java.lang.String mUrl;
    private int mRequestTimes = 0;
    private long mRequestFailedTime = -1;

    public TPRequestItem(java.lang.String str, int i17) {
        this.mUrl = str;
        this.mRequestType = i17;
    }

    public long getRequestFailedTime() {
        return this.mRequestFailedTime;
    }

    public int getRequestTimes() {
        return this.mRequestTimes;
    }

    public int getRequestType() {
        return this.mRequestType;
    }

    public java.lang.String getUrl() {
        return this.mUrl;
    }

    public void updateFailedTime() {
        this.mRequestFailedTime = java.lang.System.currentTimeMillis();
        this.mRequestTimes++;
    }
}
