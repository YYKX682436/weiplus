package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
public class MagicSclBizFlutterApiCaller {

    /* loaded from: classes14.dex */
    public interface InvokeBizFlutterApiCallback {
        void complete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse);
    }

    private native void jniInvokeBizFlutterApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.Object obj);

    public void invokeBizFlutterApiAsync(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, com.tencent.wechat.zidl.MagicSclBizFlutterApiCaller.InvokeBizFlutterApiCallback invokeBizFlutterApiCallback) {
        jniInvokeBizFlutterApiAsync(j17, str, str2, bArr, invokeBizFlutterApiCallback);
    }
}
