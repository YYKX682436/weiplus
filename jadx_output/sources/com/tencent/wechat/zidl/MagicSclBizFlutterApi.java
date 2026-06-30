package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
public interface MagicSclBizFlutterApi {

    /* loaded from: classes14.dex */
    public interface Callback {
        void onInvokeBizFlutterApiComplete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    void invokeBizFlutterApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr);

    void setCallback(com.tencent.wechat.zidl.MagicSclBizFlutterApi.Callback callback);
}
