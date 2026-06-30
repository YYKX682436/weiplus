package x36;

/* loaded from: classes16.dex */
public final class u implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f451712d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.j0 f451713e;

    public u(java.io.InputStream input, x36.j0 timeout) {
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(timeout, "timeout");
        this.f451712d = input;
        this.f451713e = timeout;
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        kotlin.jvm.internal.o.g(sink, "sink");
        if (j17 == 0) {
            return 0L;
        }
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        try {
            this.f451713e.f();
            x36.c0 w17 = sink.w(1);
            int read = this.f451712d.read(w17.f451657a, w17.f451659c, (int) java.lang.Math.min(j17, 8192 - w17.f451659c));
            if (read != -1) {
                w17.f451659c += read;
                long j18 = read;
                sink.f451694e += j18;
                return j18;
            }
            if (w17.f451658b != w17.f451659c) {
                return -1L;
            }
            sink.f451693d = w17.a();
            x36.d0.a(w17);
            return -1L;
        } catch (java.lang.AssertionError e17) {
            if (x36.v.c(e17)) {
                throw new java.io.IOException(e17);
            }
            throw e17;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451712d.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451713e;
    }

    public java.lang.String toString() {
        return "source(" + this.f451712d + ')';
    }
}
