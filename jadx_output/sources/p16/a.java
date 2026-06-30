package p16;

/* loaded from: classes13.dex */
public final class a extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f351267d;

    public a(java.io.InputStream inputStream, int i17) {
        super(inputStream);
        this.f351267d = i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return java.lang.Math.min(super.available(), this.f351267d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f351267d <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f351267d--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long skip = super.skip(java.lang.Math.min(j17, this.f351267d));
        if (skip >= 0) {
            this.f351267d = (int) (this.f351267d - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19 = this.f351267d;
        if (i19 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i17, java.lang.Math.min(i18, i19));
        if (read >= 0) {
            this.f351267d -= read;
        }
        return read;
    }
}
