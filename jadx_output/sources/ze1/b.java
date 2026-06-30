package ze1;

/* loaded from: classes7.dex */
public final class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f471764d;

    /* renamed from: e, reason: collision with root package name */
    public final android.net.Uri f471765e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f471766f;

    /* renamed from: g, reason: collision with root package name */
    public long f471767g;

    /* renamed from: h, reason: collision with root package name */
    public long f471768h;

    /* renamed from: i, reason: collision with root package name */
    public java.io.InputStream f471769i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f471770m;

    public b(r9.k dataSource, android.net.Uri uri) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(uri, "uri");
        this.f471764d = dataSource;
        this.f471765e = uri;
        this.f471766f = new byte[1];
    }

    public final java.io.InputStream a() {
        java.io.InputStream inputStream = this.f471769i;
        long j17 = this.f471767g;
        long j18 = this.f471768h;
        if (inputStream != null) {
            return inputStream;
        }
        if (32768 <= j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, reach max read length");
            return null;
        }
        if (j17 < j18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, end of file");
            return null;
        }
        this.f471768h = j17;
        r9.m mVar = new r9.m(this.f471764d, new r9.n(this.f471765e, j17, 1024L, null));
        this.f471769i = mVar;
        this.f471768h += 1024;
        return mVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f471770m) {
            return;
        }
        java.io.InputStream inputStream = this.f471769i;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f471769i = null;
        this.f471767g = 0L;
        this.f471770m = true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f471766f;
        if (-1 == read(bArr)) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        t9.a.d(!this.f471770m);
        java.io.InputStream a17 = a();
        if (a17 == null) {
            return -1;
        }
        try {
            int read = a17.read(bArr);
            if (-1 == read) {
                java.io.InputStream inputStream = this.f471769i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f471769i = null;
                return read(bArr);
            }
            this.f471767g += read;
            return read;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read([B), fail since " + e17);
            throw e17;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        t9.a.d(!this.f471770m);
        java.io.InputStream a17 = a();
        if (a17 == null) {
            return -1;
        }
        try {
            int read = a17.read(bArr, i17, i18);
            if (-1 == read) {
                java.io.InputStream inputStream = this.f471769i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f471769i = null;
                return read(bArr, i17, i18);
            }
            this.f471767g += read;
            return read;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.RealInferContentTypeInputStream", e17, "read([BII), fail", new java.lang.Object[0]);
            throw e17;
        }
    }
}
