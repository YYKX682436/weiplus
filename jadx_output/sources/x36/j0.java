package x36;

/* loaded from: classes16.dex */
public class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x36.j0 f451689d = new x36.i0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f451690a;

    /* renamed from: b, reason: collision with root package name */
    public long f451691b;

    /* renamed from: c, reason: collision with root package name */
    public long f451692c;

    public x36.j0 a() {
        this.f451690a = false;
        return this;
    }

    public x36.j0 b() {
        this.f451692c = 0L;
        return this;
    }

    public long c() {
        if (this.f451690a) {
            return this.f451691b;
        }
        throw new java.lang.IllegalStateException("No deadline".toString());
    }

    public x36.j0 d(long j17) {
        this.f451690a = true;
        this.f451691b = j17;
        return this;
    }

    public boolean e() {
        return this.f451690a;
    }

    public void f() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.o.f(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.f451690a && this.f451691b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public x36.j0 g(long j17, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.o.g(unit, "unit");
        if (j17 >= 0) {
            this.f451692c = unit.toNanos(j17);
            return this;
        }
        throw new java.lang.IllegalArgumentException(("timeout < 0: " + j17).toString());
    }

    public long h() {
        return this.f451692c;
    }
}
