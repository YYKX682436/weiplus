package com.tencent.wechat.zidl;

/* loaded from: classes14.dex */
class MagicSclBizHostApiCallback implements com.tencent.wechat.zidl.MagicSclBizHostApi.Callback {
    private native void jniOnInvokeBizHostApiComplete(long j17, byte[] bArr);

    @Override // com.tencent.wechat.zidl.MagicSclBizHostApi.Callback
    public void onInvokeBizHostApiComplete(long j17, com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse) {
        jniOnInvokeBizHostApiComplete(j17, magicSclBizApiResponse.toByteArray());
    }
}
