package d7;

/* loaded from: classes13.dex */
public class i0 extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f226809d;

    /* renamed from: e, reason: collision with root package name */
    public int f226810e;

    /* renamed from: f, reason: collision with root package name */
    public int f226811f;

    /* renamed from: g, reason: collision with root package name */
    public int f226812g;

    /* renamed from: h, reason: collision with root package name */
    public int f226813h;

    /* renamed from: i, reason: collision with root package name */
    public final x6.b f226814i;

    public i0(java.io.InputStream inputStream, x6.b bVar) {
        super(inputStream);
        this.f226812g = -1;
        this.f226814i = bVar;
        this.f226809d = (byte[]) ((x6.l) bVar).c(65536, byte[].class);
    }

    public static java.io.IOException b() {
        throw new java.io.IOException("BufferedInputStream is closed");
    }

    public final int a(java.io.InputStream inputStream, byte[] bArr) {
        int i17 = this.f226812g;
        if (i17 != -1) {
            int i18 = this.f226813h - i17;
            int i19 = this.f226811f;
            if (i18 < i19) {
                if (i17 == 0 && i19 > bArr.length && this.f226810e == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i19) {
                        i19 = length;
                    }
                    byte[] bArr2 = (byte[]) ((x6.l) this.f226814i).c(i19, byte[].class);
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f226809d = bArr2;
                    ((x6.l) this.f226814i).g(bArr);
                    bArr = bArr2;
                } else if (i17 > 0) {
                    java.lang.System.arraycopy(bArr, i17, bArr, 0, bArr.length - i17);
                }
                int i27 = this.f226813h - this.f226812g;
                this.f226813h = i27;
                this.f226812g = 0;
                this.f226810e = 0;
                int read = inputStream.read(bArr, i27, bArr.length - i27);
                int i28 = this.f226813h;
                if (read > 0) {
                    i28 += read;
                }
                this.f226810e = i28;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f226812g = -1;
            this.f226813h = 0;
            this.f226810e = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        java.io.InputStream inputStream;
        inputStream = ((java.io.FilterInputStream) this).in;
        if (this.f226809d == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.f226810e - this.f226813h) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f226809d != null) {
            ((x6.l) this.f226814i).g(this.f226809d);
            this.f226809d = null;
        }
        java.io.InputStream inputStream = ((java.io.FilterInputStream) this).in;
        ((java.io.FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        this.f226811f = java.lang.Math.max(this.f226811f, i17);
        this.f226812g = this.f226813h;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f226809d;
        java.io.InputStream inputStream = ((java.io.FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f226813h >= this.f226810e && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f226809d && (bArr = this.f226809d) == null) {
                b();
                throw null;
            }
            int i17 = this.f226810e;
            int i18 = this.f226813h;
            if (i17 - i18 <= 0) {
                return -1;
            }
            this.f226813h = i18 + 1;
            return bArr[i18] & 255;
        }
        b();
        throw null;
    }

    public synchronized void release() {
        if (this.f226809d != null) {
            ((x6.l) this.f226814i).g(this.f226809d);
            this.f226809d = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f226809d == null) {
            throw new java.io.IOException("Stream is closed");
        }
        int i17 = this.f226812g;
        if (-1 == i17) {
            throw new d7.h0("Mark has been invalidated, pos: " + this.f226813h + " markLimit: " + this.f226811f);
        }
        this.f226813h = i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j17) {
        if (j17 < 1) {
            return 0L;
        }
        byte[] bArr = this.f226809d;
        if (bArr == null) {
            b();
            throw null;
        }
        java.io.InputStream inputStream = ((java.io.FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i17 = this.f226810e;
        int i18 = this.f226813h;
        if (i17 - i18 >= j17) {
            this.f226813h = (int) (i18 + j17);
            return j17;
        }
        long j18 = i17 - i18;
        this.f226813h = i17;
        if (this.f226812g == -1 || j17 > this.f226811f) {
            return j18 + inputStream.skip(j17 - j18);
        }
        if (a(inputStream, bArr) == -1) {
            return j18;
        }
        int i19 = this.f226810e;
        int i27 = this.f226813h;
        if (i19 - i27 >= j17 - j18) {
            this.f226813h = (int) ((i27 + j17) - j18);
            return j17;
        }
        long j19 = (j18 + i19) - i27;
        this.f226813h = i19;
        return j19;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i17, int i18) {
        int i19;
        int i27;
        byte[] bArr2 = this.f226809d;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i18 == 0) {
            return 0;
        }
        java.io.InputStream inputStream = ((java.io.FilterInputStream) this).in;
        if (inputStream != null) {
            int i28 = this.f226813h;
            int i29 = this.f226810e;
            if (i28 < i29) {
                int i37 = i29 - i28 >= i18 ? i18 : i29 - i28;
                java.lang.System.arraycopy(bArr2, i28, bArr, i17, i37);
                this.f226813h += i37;
                if (i37 == i18 || inputStream.available() == 0) {
                    return i37;
                }
                i17 += i37;
                i19 = i18 - i37;
            } else {
                i19 = i18;
            }
            while (true) {
                if (this.f226812g == -1 && i19 >= bArr2.length) {
                    i27 = inputStream.read(bArr, i17, i19);
                    if (i27 == -1) {
                        return i19 != i18 ? i18 - i19 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i19 != i18 ? i18 - i19 : -1;
                    }
                    if (bArr2 != this.f226809d && (bArr2 = this.f226809d) == null) {
                        b();
                        throw null;
                    }
                    int i38 = this.f226810e;
                    int i39 = this.f226813h;
                    i27 = i38 - i39 >= i19 ? i19 : i38 - i39;
                    java.lang.System.arraycopy(bArr2, i39, bArr, i17, i27);
                    this.f226813h += i27;
                }
                i19 -= i27;
                if (i19 == 0) {
                    return i18;
                }
                if (inputStream.available() == 0) {
                    return i18 - i19;
                }
                i17 += i27;
            }
        } else {
            b();
            throw null;
        }
    }
}
