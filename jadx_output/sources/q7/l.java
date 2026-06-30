package q7;

/* loaded from: classes13.dex */
public class l extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f360305d;

    public l(java.io.InputStream inputStream) {
        super(inputStream);
        this.f360305d = Integer.MIN_VALUE;
    }

    public final long a(long j17) {
        int i17 = this.f360305d;
        if (i17 == 0) {
            return -1L;
        }
        return (i17 == Integer.MIN_VALUE || j17 <= ((long) i17)) ? j17 : i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i17 = this.f360305d;
        return i17 == Integer.MIN_VALUE ? super.available() : java.lang.Math.min(i17, super.available());
    }

    public final void b(long j17) {
        int i17 = this.f360305d;
        if (i17 == Integer.MIN_VALUE || j17 == -1) {
            return;
        }
        this.f360305d = (int) (i17 - j17);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        super.mark(i17);
        this.f360305d = i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f360305d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j17) {
        long a17 = a(j17);
        if (a17 == -1) {
            return 0L;
        }
        long skip = super.skip(a17);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int a17 = (int) a(i18);
        if (a17 == -1) {
            return -1;
        }
        int read = super.read(bArr, i17, a17);
        b(read);
        return read;
    }
}
