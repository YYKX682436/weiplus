package x36;

/* loaded from: classes16.dex */
public final class x implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.OutputStream f451715d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.j0 f451716e;

    public x(java.io.OutputStream out, x36.j0 timeout) {
        kotlin.jvm.internal.o.g(out, "out");
        kotlin.jvm.internal.o.g(timeout, "timeout");
        this.f451715d = out;
        this.f451716e = timeout;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        x36.b.b(source.f451694e, 0L, j17);
        while (j17 > 0) {
            this.f451716e.f();
            x36.c0 c0Var = source.f451693d;
            kotlin.jvm.internal.o.d(c0Var);
            int min = (int) java.lang.Math.min(j17, c0Var.f451659c - c0Var.f451658b);
            this.f451715d.write(c0Var.f451657a, c0Var.f451658b, min);
            int i17 = c0Var.f451658b + min;
            c0Var.f451658b = i17;
            long j18 = min;
            j17 -= j18;
            source.f451694e -= j18;
            if (i17 == c0Var.f451659c) {
                source.f451693d = c0Var.a();
                x36.d0.a(c0Var);
            }
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451715d.close();
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        this.f451715d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f451716e;
    }

    public java.lang.String toString() {
        return "sink(" + this.f451715d + ')';
    }
}
