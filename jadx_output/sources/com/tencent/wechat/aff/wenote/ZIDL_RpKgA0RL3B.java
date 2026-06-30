package com.tencent.wechat.aff.wenote;

/* loaded from: classes8.dex */
class ZIDL_RpKgA0RL3B extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.wenote.c f217671a;

    private native void ZIDL_AX(long j17, long j18);

    public void ZIDL_AV(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        ((dz4.s0) this.f217671a).getClass();
        com.tencent.mars.xlog.Log.i("WeNoteDartToNativeHelperImpl", "firstPaintFinishAsync: taskId=" + j17 + ", noteLocalId=" + j18 + ", initDuration=" + j19 + ", openNoteDuration=" + j27 + ", htmlDownloadDuration=" + j28 + ", htmlParseDuration=" + j29 + ", viewPaintDuration=" + j37);
        pm0.v.X(new dz4.r0(j18, j19, j27, j28, j29, j37));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.wenote.c cVar = (com.tencent.wechat.aff.wenote.c) obj;
        this.f217671a = cVar;
        cVar.getClass();
    }
}
