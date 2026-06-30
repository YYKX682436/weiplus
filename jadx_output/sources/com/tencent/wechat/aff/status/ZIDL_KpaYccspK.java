package com.tencent.wechat.aff.status;

/* loaded from: classes16.dex */
class ZIDL_KpaYccspK {
    private static final java.lang.String TAG = "StatusModuleCgiManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_AX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleCgiManager.getRecommendIconsByImageCallback) obj).complete((bw5.qo0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.qo0.f32209f, bArr));
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleCgiManager.uploadAndGetRecommendIconsCallback) obj).complete((bw5.pr0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.pr0.f31812g, bArr));
    }

    private void ZIDL_CX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleCgiManager.UploadMediaToStatusCDNCallback) obj).complete((bw5.rr0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.rr0.f32673f, bArr));
    }

    private void ZIDL_DX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleCgiManager.requestTextStatusDetailReadCallback) obj).complete((bw5.no0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.no0.f30765e, bArr));
    }

    private void ZIDL_EX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleCgiManager.getTextStatusReadListUsersCallback) obj).complete((bw5.lo0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.lo0.f29881g, bArr));
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_DV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_EV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_KpaYccspC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
