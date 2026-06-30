package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
class ZIDL_YZ4qH7TgzK {
    private static final java.lang.String TAG = "WebSearchManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebSearchCallback) obj).complete((bw5.gs0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.gs0.f27986o, bArr));
    }

    private void ZIDL_CX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebSuggestCallback) obj).complete((bw5.gs0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.gs0.f27986o, bArr));
    }

    private void ZIDL_DX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebQueryCallback) obj).complete((bw5.fj0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.fj0.f27309g, bArr));
    }

    private void ZIDL_EX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMSearchReportCallback) obj).complete((bw5.ui0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.ui0.f33928e, bArr));
    }

    private void ZIDL_FX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_GX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public native boolean ZIDL_A(long j17);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_CV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_DV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_EV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_GV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_YZ4qH7TgzC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
