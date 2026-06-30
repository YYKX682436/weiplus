package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes7.dex */
public final class j5 extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f191733d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f191734e;

    public j5(java.io.InputStream first, java.io.InputStream second) {
        kotlin.jvm.internal.o.g(first, "first");
        kotlin.jvm.internal.o.g(second, "second");
        this.f191733d = first;
        this.f191734e = second;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f191733d.available() + this.f191734e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f191733d.close();
        this.f191734e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f191733d.mark(i17);
        this.f191734e.mark(i17 - this.f191733d.available());
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f191733d.read();
        return read != -1 ? read : this.f191734e.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f191733d.reset();
        this.f191734e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        long skip = this.f191733d.skip(j17);
        return skip < j17 ? skip + this.f191734e.skip(j17 - skip) : skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return 0;
        }
        int read = this.f191733d.read(bArr, i17, i18);
        int i19 = read != -1 ? read : 0;
        if (i19 >= i18) {
            return i19;
        }
        int read2 = this.f191734e.read(bArr, i17 + i19, i18 - i19);
        if (read2 == -1) {
            return -1;
        }
        return i19 + read2;
    }
}
