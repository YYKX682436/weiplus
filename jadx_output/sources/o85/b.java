package o85;

/* loaded from: classes7.dex */
public final class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f343672d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f343673e;

    public b(java.io.InputStream delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f343672d = delegate;
        this.f343673e = 1073741824;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f343673e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f343672d.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f343672d.read();
        if (read == -1) {
            this.f343673e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return this.f343672d.skip(j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] b17) {
        kotlin.jvm.internal.o.g(b17, "b");
        int read = this.f343672d.read(b17);
        if (read == -1) {
            this.f343673e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] b17, int i17, int i18) {
        kotlin.jvm.internal.o.g(b17, "b");
        int read = this.f343672d.read(b17, i17, i18);
        if (read == -1) {
            this.f343673e = 0;
        }
        return read;
    }
}
