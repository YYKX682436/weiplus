package com.tencent.tmassistantsdk.channel;

/* loaded from: classes13.dex */
public class TMAssistantSDKChannel {
    public synchronized long AddDataItem(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, long j17, long j18, int i19, byte[] bArr) {
        return new com.tencent.tmassistantsdk.channel.DBOption().insert(new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem(str, i17, str2, i18, str3, j17, j18, i19, bArr));
    }

    public synchronized boolean delDataItem(long j17) {
        if (j17 < 0) {
            return false;
        }
        return new com.tencent.tmassistantsdk.channel.DBOption().delete(j17);
    }

    public synchronized java.util.ArrayList<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> getChannelDataItemList() {
        return new com.tencent.tmassistantsdk.channel.DBOption().queryAll();
    }
}
