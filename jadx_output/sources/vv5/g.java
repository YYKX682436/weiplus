package vv5;

/* loaded from: classes13.dex */
public class g extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f440563d;

    /* renamed from: e, reason: collision with root package name */
    public long f440564e;

    /* renamed from: f, reason: collision with root package name */
    public long f440565f;

    public g(java.io.RandomAccessFile randomAccessFile, long j17) {
        long length = randomAccessFile.length();
        this.f440563d = randomAccessFile;
        this.f440565f = j17;
        this.f440564e = length;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f440565f < this.f440564e ? 1 : 0;
    }

    @Override // java.io.InputStream
    public int read() {
        int i17 = vv5.e.f440551a;
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        long j18 = this.f440564e;
        long j19 = this.f440565f;
        if (j17 > j18 - j19) {
            j17 = j18 - j19;
        }
        this.f440565f = j19 + j17;
        return j17;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        synchronized (this.f440563d) {
            long j17 = this.f440564e;
            long j18 = this.f440565f;
            long j19 = j17 - j18;
            if (i18 > j19) {
                i18 = (int) j19;
            }
            this.f440563d.seek(j18);
            int read = this.f440563d.read(bArr, i17, i18);
            if (read <= 0) {
                return -1;
            }
            this.f440565f += read;
            return read;
        }
    }
}
