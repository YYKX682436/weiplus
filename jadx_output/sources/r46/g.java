package r46;

/* loaded from: classes13.dex */
public class g extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f392505d;

    public g(java.io.InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((java.io.FilterInputStream) this).in.read();
        if (read >= 0) {
            this.f392505d++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int read = ((java.io.FilterInputStream) this).in.read(bArr, i17, i18);
        if (read >= 0) {
            long j17 = read;
            if (j17 != -1) {
                this.f392505d += j17;
            }
        }
        return read;
    }
}
