package k46;

/* loaded from: classes13.dex */
public class b extends a46.b {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f304105g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f304106h;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f304107e;

    /* renamed from: f, reason: collision with root package name */
    public final k46.f f304108f;

    static {
        byte[] bArr = {-54, -2, -48, 13};
        f304105g = bArr;
        f304106h = bArr.length;
    }

    public b(java.io.InputStream inputStream) {
        k46.e eVar = k46.e.f304109d;
        this.f304107e = inputStream;
        k46.f h17 = eVar.h();
        this.f304108f = h17;
        java.util.jar.JarOutputStream jarOutputStream = new java.util.jar.JarOutputStream(h17);
        try {
            android.support.v4.media.f.a(java.security.AccessController.doPrivileged(new q46.a()));
            new r46.f(inputStream);
            throw null;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                try {
                    jarOutputStream.close();
                } catch (java.lang.Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f304108f.a().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            k46.f fVar = this.f304108f;
            fVar.close();
            synchronized (fVar.f304112e) {
                java.io.InputStream inputStream = fVar.f304111d;
                if (inputStream != null) {
                    inputStream.close();
                    fVar.f304111d = null;
                }
            }
        } finally {
            java.io.InputStream inputStream2 = this.f304107e;
            if (inputStream2 != null) {
                inputStream2.close();
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f304108f.a().mark(i17);
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        try {
            return this.f304108f.a().markSupported();
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f304108f.a().read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f304108f.a().reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f304108f.a(), j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f304108f.a().read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        return this.f304108f.a().read(bArr, i17, i18);
    }
}
