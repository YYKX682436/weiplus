package q7;

/* loaded from: classes13.dex */
public class f extends java.io.InputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Queue f360294f;

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f360295d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.IOException f360296e;

    static {
        char[] cArr = q7.p.f360310a;
        f360294f = new java.util.ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f360295d.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f360295d.close();
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        this.f360295d.mark(i17);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f360295d.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f360295d.read(bArr);
        } catch (java.io.IOException e17) {
            this.f360296e = e17;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f360295d.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        try {
            return this.f360295d.skip(j17);
        } catch (java.io.IOException e17) {
            this.f360296e = e17;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        try {
            return this.f360295d.read(bArr, i17, i18);
        } catch (java.io.IOException e17) {
            this.f360296e = e17;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f360295d.read();
        } catch (java.io.IOException e17) {
            this.f360296e = e17;
            return -1;
        }
    }
}
