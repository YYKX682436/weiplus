package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public interface e {
    void onCallBackCheckSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar);

    void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar);

    void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar);

    void setCallback(com.tencent.wechat.aff.udr.d dVar);
}
