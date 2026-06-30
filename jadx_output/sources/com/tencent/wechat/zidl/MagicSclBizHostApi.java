package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
public interface MagicSclBizHostApi {

    /* loaded from: classes14.dex */
    public interface Callback {
        void onInvokeBizHostApiComplete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    void invokeBizHostApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr);

    void setCallback(com.tencent.wechat.zidl.MagicSclBizHostApi.Callback callback);
}
