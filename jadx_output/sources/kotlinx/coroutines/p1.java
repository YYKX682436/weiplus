package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class p1 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f310564d;

    public p1(kotlinx.coroutines.p0 p0Var) {
        this.f310564d = p0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f310564d.D(oz5.m.f350329d, runnable);
    }

    public java.lang.String toString() {
        return this.f310564d.toString();
    }
}
