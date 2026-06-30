package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public final class pd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f209501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f209502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f209503f;

    public pd(kotlin.jvm.internal.h0 h0Var, yz5.a aVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f209501d = h0Var;
        this.f209502e = aVar;
        this.f209503f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f209501d.f310123d = this.f209502e.invoke();
        this.f209503f.countDown();
    }
}
