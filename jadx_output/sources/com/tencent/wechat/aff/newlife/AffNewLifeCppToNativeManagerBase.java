package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public interface AffNewLifeCppToNativeManagerBase {
    void feedJumpInfoSummaryDataChange(int i17, java.lang.String str, int i18, int i19, java.util.ArrayList<java.lang.String> arrayList);

    void fetchJumpInfoComplete(int i17, java.util.ArrayList<com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo> arrayList);

    void jumpInfoDataChange(int i17, java.lang.String str, int i18, int i19, byte[] bArr);

    void mentionInfoDataChange(int i17, com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention, long j17);
}
