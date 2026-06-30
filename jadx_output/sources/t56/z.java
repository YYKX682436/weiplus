package t56;

/* loaded from: classes15.dex */
public final class z implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future f415951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t56.c0 f415952e;

    public z(t56.c0 c0Var, java.util.concurrent.Future future) {
        this.f415952e = c0Var;
        this.f415951d = future;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415951d.isCancelled();
    }

    @Override // p56.s
    public void c() {
        java.lang.Object obj = this.f415952e.get();
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.util.concurrent.Future future = this.f415951d;
        if (obj != currentThread) {
            future.cancel(true);
        } else {
            future.cancel(false);
        }
    }
}
