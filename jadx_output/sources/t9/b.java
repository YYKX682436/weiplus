package t9;

/* loaded from: classes12.dex */
public final class b extends java.io.OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.FileOutputStream f416492d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f416493e = false;

    public b(java.io.File file) {
        this.f416492d = new java.io.FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.FileOutputStream fileOutputStream = this.f416492d;
        if (this.f416493e) {
            return;
        }
        this.f416493e = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (java.io.IOException unused) {
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f416492d.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        this.f416492d.write(i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f416492d.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.f416492d.write(bArr, i17, i18);
    }
}
