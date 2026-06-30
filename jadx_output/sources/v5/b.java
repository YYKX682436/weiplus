package v5;

/* loaded from: classes7.dex */
public final class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f433270d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f433271e;

    public b(java.io.InputStream delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f433270d = delegate;
        this.f433271e = 1073741824;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f433271e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f433270d.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f433270d.read();
        if (read == -1) {
            this.f433271e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return this.f433270d.skip(j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] b17) {
        kotlin.jvm.internal.o.g(b17, "b");
        int read = this.f433270d.read(b17);
        if (read == -1) {
            this.f433271e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] b17, int i17, int i18) {
        kotlin.jvm.internal.o.g(b17, "b");
        int read = this.f433270d.read(b17, i17, i18);
        if (read == -1) {
            this.f433271e = 0;
        }
        return read;
    }
}
