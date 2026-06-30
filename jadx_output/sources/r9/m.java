package r9;

/* loaded from: classes7.dex */
public final class m extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f393377d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.n f393378e;

    /* renamed from: i, reason: collision with root package name */
    public long f393382i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f393380g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f393381h = false;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f393379f = new byte[1];

    public m(r9.k kVar, r9.n nVar) {
        this.f393377d = kVar;
        this.f393378e = nVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f393381h) {
            return;
        }
        this.f393377d.close();
        this.f393381h = true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f393379f;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        t9.a.d(!this.f393381h);
        boolean z17 = this.f393380g;
        r9.k kVar = this.f393377d;
        if (!z17) {
            kVar.b(this.f393378e);
            this.f393380g = true;
        }
        int a17 = kVar.a(bArr, i17, i18);
        if (a17 == -1) {
            return -1;
        }
        this.f393382i += a17;
        return a17;
    }
}
