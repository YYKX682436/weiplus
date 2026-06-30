package x36;

/* loaded from: classes14.dex */
public abstract class q implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.h0 f451701d;

    public q(x36.h0 delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f451701d = delegate;
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        kotlin.jvm.internal.o.g(sink, "sink");
        return this.f451701d.B(sink, j17);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451701d.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451701d.h();
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.f451701d + ')';
    }
}
