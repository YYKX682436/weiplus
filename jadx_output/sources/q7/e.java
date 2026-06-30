package q7;

/* loaded from: classes13.dex */
public final class e extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public final long f360292d;

    /* renamed from: e, reason: collision with root package name */
    public int f360293e;

    public e(java.io.InputStream inputStream, long j17) {
        super(inputStream);
        this.f360292d = j17;
    }

    public final int a(int i17) {
        if (i17 >= 0) {
            this.f360293e += i17;
        } else {
            long j17 = this.f360293e;
            long j18 = this.f360292d;
            if (j18 - j17 > 0) {
                throw new java.io.IOException("Failed to read all expected data, expected: " + j18 + ", but read: " + this.f360293e);
            }
        }
        return i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) java.lang.Math.max(this.f360292d - this.f360293e, ((java.io.FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i17, int i18) {
        int read;
        read = super.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
