package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vending.base.p f212657b;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f212660e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f212656a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f212658c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f212659d = new byte[0];

    public r(android.os.Looper looper, com.tencent.mm.vending.base.p pVar) {
        this.f212657b = null;
        this.f212657b = pVar;
        this.f212660e = new com.tencent.mm.vending.base.o(this, looper);
    }

    public final void a() {
        this.f212660e.removeCallbacksAndMessages(null);
        jm5.b.b("Vending.Loader", "clear()", new java.lang.Object[0]);
        synchronized (this.f212659d) {
            this.f212656a.clear();
        }
        com.tencent.mm.vending.base.Vending vending = ((com.tencent.mm.vending.base.h) this.f212657b).f212648a;
        vending.loaderClear();
        vending.deadlock();
    }
}
