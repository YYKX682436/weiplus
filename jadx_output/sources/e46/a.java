package e46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f249431e;

    /* renamed from: f, reason: collision with root package name */
    public e46.i f249432f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f249433g;

    public a(java.io.InputStream inputStream) {
        e46.i iVar = new e46.i(inputStream);
        this.f249433g = new byte[1];
        this.f249432f = iVar;
        this.f249431e = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        e46.i iVar = this.f249432f;
        if (iVar != null) {
            return iVar.f249458e.a();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            e46.i iVar = this.f249432f;
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (java.io.IOException unused) {
                }
            }
            this.f249432f = null;
        } finally {
            java.io.InputStream inputStream = this.f249431e;
            if (inputStream != null) {
                inputStream.close();
                this.f249431e = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr;
        int read;
        do {
            bArr = this.f249433g;
            read = read(bArr);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return bArr[0] & 255;
        }
        throw new java.lang.IllegalStateException("Invalid return value from read: " + read);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        e46.i iVar = this.f249432f;
        if (iVar == null) {
            return -1;
        }
        try {
            int b17 = iVar.b(bArr, i17, i18);
            long j17 = this.f249432f.f249459f.f392496d.f392505d;
            a(b17);
            if (b17 == -1) {
                e46.i iVar2 = this.f249432f;
                if (iVar2 != null) {
                    try {
                        iVar2.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                this.f249432f = null;
            }
            return b17;
        } catch (java.lang.RuntimeException e17) {
            throw new java.io.IOException("Invalid Deflate64 input", e17);
        }
    }
}
