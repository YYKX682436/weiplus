package t2;

/* loaded from: classes14.dex */
public final class o implements wa.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f414657d;

    /* renamed from: e, reason: collision with root package name */
    public final t2.j f414658e = new t2.n(this);

    public o(t2.k kVar) {
        this.f414657d = new java.lang.ref.WeakReference(kVar);
    }

    @Override // wa.a
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f414658e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        t2.k kVar = (t2.k) this.f414657d.get();
        boolean cancel = this.f414658e.cancel(z17);
        if (cancel && kVar != null) {
            kVar.f414652a = null;
            kVar.f414653b = null;
            kVar.f414654c.i(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f414658e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f414658e.f414649d instanceof t2.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f414658e.isDone();
    }

    public java.lang.String toString() {
        return this.f414658e.toString();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f414658e.get(j17, timeUnit);
    }
}
