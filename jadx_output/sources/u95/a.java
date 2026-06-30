package u95;

/* loaded from: classes12.dex */
public class a extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f425887d;

    /* renamed from: e, reason: collision with root package name */
    public long f425888e;

    /* renamed from: f, reason: collision with root package name */
    public long f425889f;

    /* renamed from: g, reason: collision with root package name */
    public long f425890g;

    /* renamed from: h, reason: collision with root package name */
    public final long f425891h;

    public a(java.io.File file) {
        long length = file.length();
        this.f425888e = -1L;
        this.f425887d = new java.io.RandomAccessFile(file, "r");
        this.f425891h = file.length();
        a(0L, length);
    }

    public void a(long j17, long j18) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("rangeOffset must be >= 0");
        }
        if (j18 < 0) {
            throw new java.lang.IllegalArgumentException("rangeLength must be >= 0");
        }
        long j19 = j17 + j18;
        if (j19 > this.f425891h) {
            throw new java.lang.IllegalArgumentException("Read range exceeds file length");
        }
        if (j19 < 0) {
            throw new java.lang.IllegalArgumentException("Insane input size not supported");
        }
        this.f425889f = j17;
        this.f425890g = j18;
        this.f425888e = j17;
        reset();
        this.f425888e = -1L;
    }

    @Override // java.io.InputStream
    public int available() {
        long filePointer = this.f425890g - (this.f425887d.getFilePointer() - this.f425889f);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f425887d.close();
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        try {
            this.f425888e = this.f425887d.getFilePointer();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        return this.f425887d.read();
    }

    @Override // java.io.InputStream
    public void reset() {
        long j17 = this.f425888e;
        if (j17 < 0) {
            throw new java.io.IOException("mark not set");
        }
        this.f425887d.seek(j17);
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        int available;
        if (j17 <= 0 || (available = available()) <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(available, j17);
        java.io.RandomAccessFile randomAccessFile = this.f425887d;
        long j18 = min;
        randomAccessFile.seek(randomAccessFile.getFilePointer() + j18);
        return j18;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        return this.f425887d.read(bArr, i17, java.lang.Math.min(i18, available));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
