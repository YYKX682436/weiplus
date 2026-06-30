package r9;

/* loaded from: classes7.dex */
public final class d implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f393351a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f393352b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f393353c;

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f393354d;

    /* renamed from: e, reason: collision with root package name */
    public long f393355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f393356f;

    public d(android.content.Context context, r9.k0 k0Var) {
        this.f393351a = context.getAssets();
        this.f393352b = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f393355e;
        if (j17 == 0) {
            return -1;
        }
        if (j17 != -1) {
            try {
                i18 = (int) java.lang.Math.min(j17, i18);
            } catch (java.io.IOException e17) {
                throw new r9.c(e17);
            }
        }
        int read = this.f393354d.read(bArr, i17, i18);
        if (read == -1) {
            if (this.f393355e == -1) {
                return -1;
            }
            throw new r9.c(new java.io.EOFException());
        }
        long j18 = this.f393355e;
        if (j18 != -1) {
            this.f393355e = j18 - read;
        }
        r9.k0 k0Var = this.f393352b;
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
            this.f393353c = uri;
            java.lang.String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.io.InputStream open = this.f393351a.open(path, 1);
            this.f393354d = open;
            if (open.skip(j17) < j17) {
                throw new java.io.EOFException();
            }
            long j18 = nVar.f393387e;
            if (j18 != -1) {
                this.f393355e = j18;
            } else {
                long available = this.f393354d.available();
                this.f393355e = available;
                if (available == 2147483647L) {
                    this.f393355e = -1L;
                }
            }
            this.f393356f = true;
            r9.k0 k0Var = this.f393352b;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f393355e;
        } catch (java.io.IOException e17) {
            throw new r9.c(e17);
        }
    }

    @Override // r9.k
    public void close() {
        r9.k0 k0Var = this.f393352b;
        this.f393353c = null;
        try {
            try {
                java.io.InputStream inputStream = this.f393354d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e17) {
                throw new r9.c(e17);
            }
        } finally {
            this.f393354d = null;
            if (this.f393356f) {
                this.f393356f = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f393353c;
    }
}
