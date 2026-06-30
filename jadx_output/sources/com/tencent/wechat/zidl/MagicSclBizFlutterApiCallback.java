package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
class MagicSclBizFlutterApiCallback implements com.tencent.wechat.zidl.MagicSclBizFlutterApi.Callback {
    private native void jniOnInvokeBizFlutterApiComplete(long j17, byte[] bArr);

    @Override // com.tencent.wechat.zidl.MagicSclBizFlutterApi.Callback
    public void onInvokeBizFlutterApiComplete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse) {
        jniOnInvokeBizFlutterApiComplete(j17, magicSclBizApiResponse.toByteArray());
    }
}
