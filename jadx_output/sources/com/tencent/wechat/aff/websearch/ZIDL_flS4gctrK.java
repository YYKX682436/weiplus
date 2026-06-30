package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
class ZIDL_flS4gctrK {
    private static final java.lang.String TAG = "WebSearchPlatformManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_DX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.websearch.WebSearchPlatformManager.GetWebViewPixelsCallback) obj).complete(bArr);
    }

    private void ZIDL_EX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.aff.websearch.WebSearchPlatformManager.NotifyFilterShowOrHideCallback) obj).complete(i17);
    }

    public static native void ZIDL_flS4gctrD(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_B(long j17, double d17, boolean z17);

    public native void ZIDL_C(long j17, boolean z17);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_EV(long j17, java.lang.Object obj, boolean z17);

    public native void ZIDL_F(long j17, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public native void ZIDL_G(long j17, int i17);

    public native void ZIDL_flS4gctrC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.Object obj3);
}
