package x36;

/* loaded from: classes16.dex */
public abstract class p implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.f0 f451700d;

    public p(x36.f0 delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f451700d = delegate;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f451700d.U(source, j17);
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451700d.close();
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        this.f451700d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f451700d.h();
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.f451700d + ')';
    }
}
