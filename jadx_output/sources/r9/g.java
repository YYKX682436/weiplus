package r9;

/* loaded from: classes7.dex */
public final class g implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f393358a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f393359b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f393360c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.AssetFileDescriptor f393361d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f393362e;

    /* renamed from: f, reason: collision with root package name */
    public long f393363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f393364g;

    public g(android.content.Context context, r9.k0 k0Var) {
        this.f393358a = context.getContentResolver();
        this.f393359b = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f393363f;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new r9.f(e17);
            }
        }
        int read = this.f393362e.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f393363f == -1) {
                return -1;
            }
            throw new r9.f(new java.io.EOFException());
        }
        long j18 = this.f393363f;
        if (j18 != -1) {
            this.f393363f = j18 - read;
        }
        r9.k0 k0Var = this.f393359b;
        if (k0Var != null) {
            k0Var.a(this, read);
        }
        return read;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f393383a;
            long j17 = nVar.f393386d;
            this.f393360c = uri;
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = this.f393358a.openAssetFileDescriptor(uri, "r");
            this.f393361d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new java.io.FileNotFoundException("Could not open file descriptor for: " + this.f393360c);
            }
            this.f393362e = new java.io.FileInputStream(this.f393361d.getFileDescriptor());
            long startOffset = this.f393361d.getStartOffset();
            long skip = this.f393362e.skip(startOffset + j17) - startOffset;
            if (skip != j17) {
                throw new java.io.EOFException();
            }
            long j18 = nVar.f393387e;
            if (j18 != -1) {
                this.f393363f = j18;
            } else {
                long length = this.f393361d.getLength();
                if (length == -1) {
                    long available = this.f393362e.available();
                    this.f393363f = available;
                    if (available == 0) {
                        this.f393363f = -1L;
                    }
                } else {
                    this.f393363f = length - skip;
                }
            }
            this.f393364g = true;
            r9.k0 k0Var = this.f393359b;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f393363f;
        } catch (java.io.IOException e17) {
            throw new r9.f(e17);
        }
    }

    @Override // r9.k
    public void close() {
        r9.k0 k0Var = this.f393359b;
        this.f393360c = null;
        try {
            try {
                java.io.InputStream inputStream = this.f393362e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f393362e = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f393361d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e17) {
                        throw new r9.f(e17);
                    }
                } finally {
                    this.f393361d = null;
                    if (this.f393364g) {
                        this.f393364g = false;
                        if (k0Var != null) {
                            k0Var.b(this);
                        }
                    }
                }
            } catch (java.io.IOException e18) {
                throw new r9.f(e18);
            }
        } catch (java.lang.Throwable th6) {
            this.f393362e = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f393361d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f393361d = null;
                    if (this.f393364g) {
                        this.f393364g = false;
                        if (k0Var != null) {
                            k0Var.b(this);
                        }
                    }
                    throw th6;
                } catch (java.io.IOException e19) {
                    throw new r9.f(e19);
                }
            } finally {
                this.f393361d = null;
                if (this.f393364g) {
                    this.f393364g = false;
                    if (k0Var != null) {
                        k0Var.b(this);
                    }
                }
            }
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f393360c;
    }
}
