package se1;

/* loaded from: classes13.dex */
public class p implements se1.g {

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f406821b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f406822c;

    /* renamed from: d, reason: collision with root package name */
    public long f406823d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f406825f;

    /* renamed from: g, reason: collision with root package name */
    public android.net.Uri f406826g;

    /* renamed from: e, reason: collision with root package name */
    public long f406824e = -1;

    /* renamed from: a, reason: collision with root package name */
    public final se1.j0 f406820a = null;

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        long j17 = this.f406823d;
        if (j17 == 0) {
            return -1;
        }
        try {
            int read = this.f406821b.read(bArr, i17, (int) java.lang.Math.min(j17, i18));
            if (read > 0) {
                this.f406823d -= read;
                se1.j0 j0Var = this.f406820a;
                if (j0Var != null) {
                    ((se1.j) j0Var).a(read);
                }
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new se1.o(e17);
        }
    }

    @Override // se1.g
    public long available() {
        return this.f406824e;
    }

    @Override // se1.g
    public te1.b b() {
        java.lang.String type = qe1.a.a().f362016a.getContentResolver().getType(this.f406826g);
        return type == null ? te1.b.f417770e : te1.b.a(type);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            android.net.Uri uri = iVar.f406772a;
            long j17 = iVar.f406774c;
            this.f406826g = uri;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(iVar.f406772a.getPath(), "r");
            this.f406821b = randomAccessFile;
            randomAccessFile.seek(j17);
            long j18 = iVar.f406775d;
            if (j18 == -1) {
                j18 = this.f406821b.length() - j17;
            }
            this.f406823d = j18;
            this.f406824e = this.f406821b.length() - j17;
            if (this.f406823d < 0) {
                throw new java.io.EOFException();
            }
            this.f406825f = true;
            se1.j0 j0Var = this.f406820a;
            if (j0Var != null) {
                ((se1.j) j0Var).c();
            }
            return this.f406823d;
        } catch (java.io.IOException e17) {
            throw new se1.o(e17);
        }
    }

    @Override // se1.g
    public void close() {
        se1.j0 j0Var = this.f406820a;
        this.f406822c = null;
        java.io.RandomAccessFile randomAccessFile = this.f406821b;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e17) {
                    throw new se1.o(e17);
                }
            } finally {
                this.f406821b = null;
                if (this.f406825f) {
                    this.f406825f = false;
                    if (j0Var != null) {
                        ((se1.j) j0Var).b();
                    }
                }
            }
        }
    }

    @Override // se1.g
    public long d() {
        try {
            return this.f406821b.length();
        } catch (java.io.IOException unused) {
            return 0L;
        }
    }
}
