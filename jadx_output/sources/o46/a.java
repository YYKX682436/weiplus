package o46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final com.github.luben.zstd.ZstdInputStream f343048e;

    public a(java.io.InputStream inputStream) {
        this.f343048e = new com.github.luben.zstd.ZstdInputStream(new r46.g(inputStream));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f343048e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f343048e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f343048e.mark(i17);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f343048e.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f343048e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f343048e, j17);
    }

    public java.lang.String toString() {
        return this.f343048e.toString();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f343048e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int read = this.f343048e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
