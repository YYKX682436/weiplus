package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class t3 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f145639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler.Callback f145640b;

    public t3(java.util.concurrent.atomic.AtomicInteger atomicInteger, android.os.Handler.Callback callback) {
        this.f145639a = atomicInteger;
        this.f145640b = callback;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f145639a;
        atomicInteger.incrementAndGet();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.arg1 = atomicInteger.get();
        this.f145640b.handleMessage(obtain);
    }
}
