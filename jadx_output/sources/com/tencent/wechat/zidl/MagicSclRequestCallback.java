package com.tencent.wechat.zidl;

/* loaded from: classes7.dex */
class MagicSclRequestCallback implements com.tencent.wechat.zidl.MagicSclRequest.Callback {
    private native void jniOnPreInitFrameSetComplete(long j17, double d17);

    @Override // com.tencent.wechat.zidl.MagicSclRequest.Callback
    public void onPreInitFrameSetComplete(long j17, double d17) {
        jniOnPreInitFrameSetComplete(j17, d17);
    }
}
