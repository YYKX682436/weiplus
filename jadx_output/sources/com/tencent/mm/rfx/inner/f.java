package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f192239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f192240e;

    public f(com.tencent.mm.rfx.inner.RfxHardwareDecoder rfxHardwareDecoder, java.lang.Runnable runnable, android.os.HandlerThread handlerThread) {
        this.f192239d = runnable;
        this.f192240e = handlerThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        this.f192239d.run();
        atomicInteger = com.tencent.mm.rfx.inner.RfxHardwareDecoder.decoderThreadCount;
        atomicInteger.getAndDecrement();
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.rfx.inner.e(this));
    }
}
