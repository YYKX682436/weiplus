package t56;

/* loaded from: classes16.dex */
public final class c0 extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable, p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final u56.o f415862d;

    /* renamed from: e, reason: collision with root package name */
    public final r56.a f415863e;

    public c0(r56.a aVar) {
        this.f415863e = aVar;
        this.f415862d = new u56.o();
    }

    @Override // p56.s
    public boolean b() {
        return this.f415862d.f424839e;
    }

    @Override // p56.s
    public void c() {
        if (this.f415862d.f424839e) {
            return;
        }
        this.f415862d.c();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(java.lang.Thread.currentThread());
                this.f415863e.call();
            } finally {
                c();
            }
        } catch (q56.j e17) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e17);
            x56.m.a(illegalStateException);
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        } catch (java.lang.Throwable th6) {
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th6);
            x56.m.a(illegalStateException2);
            java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, illegalStateException2);
        }
    }

    public c0(r56.a aVar, a66.c cVar) {
        this.f415863e = aVar;
        this.f415862d = new u56.o(new t56.b0(this, cVar));
    }

    public c0(r56.a aVar, u56.o oVar) {
        this.f415863e = aVar;
        this.f415862d = new u56.o(new t56.a0(this, oVar));
    }
}
