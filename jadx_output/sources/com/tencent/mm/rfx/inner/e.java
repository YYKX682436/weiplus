package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.inner.f f192238d;

    public e(com.tencent.mm.rfx.inner.f fVar) {
        this.f192238d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192238d.f192240e.quitSafely();
    }
}
