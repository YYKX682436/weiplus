package l36;

/* loaded from: classes16.dex */
public abstract class c1 implements java.io.Closeable {
    public abstract long a();

    public abstract l36.n0 b();

    public abstract x36.m c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m36.e.c(c());
    }
}
