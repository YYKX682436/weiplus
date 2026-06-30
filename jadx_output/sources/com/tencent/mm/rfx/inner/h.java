package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.rfx.inner.i f192241d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f192242e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f192243f = false;

    public h(com.tencent.mm.rfx.inner.i iVar) {
        this.f192241d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((com.tencent.mm.rfx.inner.c) this.f192241d).run();
            synchronized (this) {
                this.f192242e = true;
                notifyAll();
                ((com.tencent.mm.rfx.inner.c) this.f192241d).b(this.f192243f);
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                this.f192242e = true;
                notifyAll();
                ((com.tencent.mm.rfx.inner.c) this.f192241d).b(this.f192243f);
                throw th6;
            }
        }
    }
}
