package r9;

/* loaded from: classes7.dex */
public final class u implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k0 f393433a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f393434b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f393435c;

    /* renamed from: d, reason: collision with root package name */
    public long f393436d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f393437e;

    public u(r9.k0 k0Var) {
        this.f393433a = k0Var;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f393436d;
        if (j17 == 0) {
            return -1;
        }
        try {
            int read = this.f393434b.read(bArr, i17, (int) java.lang.Math.min(j17, i18));
            if (read > 0) {
                this.f393436d -= read;
                r9.k0 k0Var = this.f393433a;
                if (k0Var != null) {
                    k0Var.a(this, read);
                }
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new r9.t(e17);
        }
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f393383a;
            long j17 = nVar.f393386d;
            this.f393435c = uri;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(nVar.f393383a.getPath(), "r");
            this.f393434b = randomAccessFile;
            randomAccessFile.seek(j17);
            long j18 = nVar.f393387e;
            if (j18 == -1) {
                j18 = this.f393434b.length() - j17;
            }
            this.f393436d = j18;
            if (j18 < 0) {
                throw new java.io.EOFException();
            }
            this.f393437e = true;
            r9.k0 k0Var = this.f393433a;
            if (k0Var != null) {
                k0Var.d(this, nVar);
            }
            return this.f393436d;
        } catch (java.io.IOException e17) {
            throw new r9.t(e17);
        }
    }

    @Override // r9.k
    public void close() {
        r9.k0 k0Var = this.f393433a;
        this.f393435c = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.f393434b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (java.io.IOException e17) {
                throw new r9.t(e17);
            }
        } finally {
            this.f393434b = null;
            if (this.f393437e) {
                this.f393437e = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f393435c;
    }
}
