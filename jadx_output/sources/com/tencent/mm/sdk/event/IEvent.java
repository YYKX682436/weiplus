package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public abstract class IEvent {

    /* renamed from: e, reason: collision with root package name */
    public boolean f192365e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f192364d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f192366f = 0;

    public int a() {
        if (this.f192366f == 0) {
            this.f192366f = getClass().getName().hashCode();
        }
        return this.f192366f;
    }

    public final void b(android.os.Looper looper) {
        final com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        dVar.getClass();
        iz5.a.d("EventPoolImpl.asyncPublish event", this);
        iz5.a.d("EventPoolImpl.asyncPublish looper", looper);
        a();
        new com.tencent.mm.sdk.platformtools.n3(looper).post(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.sdk.event.d.this.d(this, false);
            }
        });
    }

    public final void c(java.lang.String str) {
        final com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        dVar.getClass();
        a();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.d$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.sdk.event.d.this.d(this, false);
            }
        }, str);
    }

    public final void d(java.util.concurrent.Executor executor) {
        com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        dVar.getClass();
        iz5.a.d("EventPoolImpl.asyncPublish event", this);
        iz5.a.d("EventPoolImpl.asyncPublish executor", executor);
        a();
        executor.execute(new com.tencent.mm.sdk.event.f(dVar, this));
    }

    public final boolean e() {
        return com.tencent.mm.sdk.event.d.f192370d.d(this, false);
    }
}
