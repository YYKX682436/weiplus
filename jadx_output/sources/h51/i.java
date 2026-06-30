package h51;

/* loaded from: classes12.dex */
public class i extends java.io.OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f279033d;

    public i(java.io.File file, long j17) {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
        this.f279033d = randomAccessFile;
        if (j17 >= 0) {
            randomAccessFile.setLength(j17);
            if (randomAccessFile.length() != j17) {
                throw new java.io.IOException("Unable to set the file size");
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
        this.f279033d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f279033d.getChannel().force(true);
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        this.f279033d.write(i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.f279033d.write(bArr, i17, i18);
    }
}
