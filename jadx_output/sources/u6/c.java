package u6;

/* loaded from: classes13.dex */
public final class c extends java.io.OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.OutputStream f424843d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424844e;

    /* renamed from: f, reason: collision with root package name */
    public final x6.b f424845f;

    /* renamed from: g, reason: collision with root package name */
    public int f424846g;

    public c(java.io.OutputStream outputStream, x6.b bVar) {
        this.f424843d = outputStream;
        this.f424845f = bVar;
        this.f424844e = (byte[]) ((x6.l) bVar).c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.OutputStream outputStream = this.f424843d;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f424844e;
            if (bArr != null) {
                ((x6.l) this.f424845f).g(bArr);
                this.f424844e = null;
            }
        } catch (java.lang.Throwable th6) {
            outputStream.close();
            throw th6;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        int i17 = this.f424846g;
        java.io.OutputStream outputStream = this.f424843d;
        if (i17 > 0) {
            outputStream.write(this.f424844e, 0, i17);
            this.f424846g = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        byte[] bArr = this.f424844e;
        int i18 = this.f424846g;
        int i19 = i18 + 1;
        this.f424846g = i19;
        bArr[i18] = (byte) i17;
        if (i19 != bArr.length || i19 <= 0) {
            return;
        }
        this.f424843d.write(bArr, 0, i19);
        this.f424846g = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int i19 = 0;
        do {
            int i27 = i18 - i19;
            int i28 = i17 + i19;
            int i29 = this.f424846g;
            java.io.OutputStream outputStream = this.f424843d;
            if (i29 == 0 && i27 >= this.f424844e.length) {
                outputStream.write(bArr, i28, i27);
                return;
            }
            int min = java.lang.Math.min(i27, this.f424844e.length - i29);
            java.lang.System.arraycopy(bArr, i28, this.f424844e, this.f424846g, min);
            int i37 = this.f424846g + min;
            this.f424846g = i37;
            i19 += min;
            byte[] bArr2 = this.f424844e;
            if (i37 == bArr2.length && i37 > 0) {
                outputStream.write(bArr2, 0, i37);
                this.f424846g = 0;
            }
        } while (i19 < i18);
    }
}
