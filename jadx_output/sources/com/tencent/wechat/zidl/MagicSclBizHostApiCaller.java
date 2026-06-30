package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
public class MagicSclBizHostApiCaller {

    /* loaded from: classes14.dex */
    public interface InvokeBizHostApiCallback {
        void complete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    private native void jniInvokeBizHostApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.Object obj);

    public void invokeBizHostApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, com.tencent.wechat.zidl.MagicSclBizHostApiCaller.InvokeBizHostApiCallback invokeBizHostApiCallback) {
        jniInvokeBizHostApiAsync(j17, str, str2, bArr, invokeBizHostApiCallback);
    }
}
