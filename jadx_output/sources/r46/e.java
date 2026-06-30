package r46;

/* loaded from: classes13.dex */
public class e extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f392503d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.Checksum f392504e;

    public e(java.util.zip.Checksum checksum, java.io.InputStream inputStream) {
        java.util.Objects.requireNonNull(checksum, "checksum");
        java.util.Objects.requireNonNull(inputStream, "in");
        this.f392504e = checksum;
        this.f392503d = inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f392503d.read();
        if (read >= 0) {
            this.f392504e.update(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return read() >= 0 ? 1L : 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int read = this.f392503d.read(bArr, i17, i18);
        if (read >= 0) {
            this.f392504e.update(bArr, i17, read);
        }
        return read;
    }
}
