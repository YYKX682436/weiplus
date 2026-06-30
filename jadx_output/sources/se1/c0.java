package se1;

/* loaded from: classes13.dex */
public class c0 implements se1.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f406747a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.Uri f406748b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.res.AssetFileDescriptor f406749c;

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f406750d;

    /* renamed from: e, reason: collision with root package name */
    public long f406751e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f406752f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f406753g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f406754h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f406755i = -1;

    public c0(android.content.Context context) {
        this.f406747a = context.getResources();
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f406751e;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new se1.b0(e17);
            }
        }
        int read = this.f406750d.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f406751e == -1) {
                return -1;
            }
            throw new se1.b0(new java.io.EOFException());
        }
        long j18 = this.f406751e;
        if (j18 != -1) {
            this.f406751e = j18 - read;
        }
        return read;
    }

    @Override // se1.g
    public long available() {
        return this.f406755i;
    }

    @Override // se1.g
    public te1.b b() {
        return android.text.TextUtils.isEmpty(this.f406753g) ? te1.b.f417769d : te1.b.a(this.f406753g);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            android.net.Uri uri = iVar.f406772a;
            long j17 = iVar.f406774c;
            this.f406748b = uri;
            if (!android.text.TextUtils.equals("android.resource", uri.getScheme())) {
                throw new se1.b0("URI must use scheme android.resource");
            }
            try {
                android.content.res.AssetFileDescriptor openRawResourceFd = this.f406747a.openRawResourceFd(java.lang.Integer.parseInt(this.f406748b.getLastPathSegment()));
                this.f406749c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                this.f406754h = length;
                this.f406755i = length - j17;
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.f406749c.getFileDescriptor());
                this.f406750d = fileInputStream;
                if (fileInputStream.markSupported()) {
                    this.f406753g = java.net.URLConnection.guessContentTypeFromStream(this.f406750d);
                }
                this.f406750d.skip(this.f406749c.getStartOffset());
                if (this.f406750d.skip(j17) < j17) {
                    throw new java.io.EOFException();
                }
                long j18 = iVar.f406775d;
                long j19 = -1;
                if (j18 != -1) {
                    this.f406751e = j18;
                } else {
                    long length2 = this.f406749c.getLength();
                    if (length2 != -1) {
                        j19 = length2 - j17;
                    }
                    this.f406751e = j19;
                }
                this.f406752f = true;
                return this.f406751e;
            } catch (java.lang.NumberFormatException unused) {
                throw new se1.b0("Resource identifier must be an integer.");
            }
        } catch (java.io.IOException e17) {
            throw new se1.b0(e17);
        }
    }

    @Override // se1.g
    public void close() {
        this.f406748b = null;
        try {
            try {
                java.io.InputStream inputStream = this.f406750d;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f406750d = null;
            } catch (java.io.IOException e17) {
                throw new se1.b0(e17);
            }
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.f406749c;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (java.io.IOException e18) {
                    throw new se1.b0(e18);
                }
            } finally {
                this.f406749c = null;
                if (this.f406752f) {
                    this.f406752f = false;
                }
            }
        } catch (java.lang.Throwable th6) {
            this.f406750d = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f406749c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f406749c = null;
                    if (this.f406752f) {
                        this.f406752f = false;
                    }
                    throw th6;
                } finally {
                    this.f406749c = null;
                    if (this.f406752f) {
                        this.f406752f = false;
                    }
                }
            } catch (java.io.IOException e19) {
                throw new se1.b0(e19);
            }
        }
    }

    @Override // se1.g
    public long d() {
        return this.f406754h;
    }
}
