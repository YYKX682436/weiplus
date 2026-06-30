package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class d extends kotlinx.coroutines.f2 implements java.util.concurrent.Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.d f310607e = new kotlinx.coroutines.scheduling.d();

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.p0 f310608f;

    static {
        kotlinx.coroutines.scheduling.o oVar = kotlinx.coroutines.scheduling.o.f310621e;
        int i17 = kotlinx.coroutines.internal.n0.f310511a;
        if (64 >= i17) {
            i17 = 64;
        }
        f310608f = oVar.J(kotlinx.coroutines.internal.m0.b("kotlinx.coroutines.io.parallelism", i17, 0, 0, 12, null));
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        f310608f.D(lVar, runnable);
    }

    @Override // kotlinx.coroutines.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        f310608f.F(lVar, runnable);
    }

    @Override // kotlinx.coroutines.p0
    public kotlinx.coroutines.p0 J(int i17) {
        return kotlinx.coroutines.scheduling.o.f310621e.J(i17);
    }

    @Override // kotlinx.coroutines.f2
    public java.util.concurrent.Executor K() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        D(oz5.m.f350329d, runnable);
    }

    @Override // kotlinx.coroutines.p0
    public java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
