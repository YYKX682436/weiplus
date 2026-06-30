package vv5;

/* loaded from: classes13.dex */
public class i extends java.io.FilterOutputStream {

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f440571q = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f440572d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f440573e;

    /* renamed from: f, reason: collision with root package name */
    public final int f440574f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.ByteArrayOutputStream f440575g;

    /* renamed from: h, reason: collision with root package name */
    public vv5.f f440576h;

    /* renamed from: i, reason: collision with root package name */
    public long f440577i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f440578m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f440579n;

    /* renamed from: o, reason: collision with root package name */
    public final int f440580o;

    /* renamed from: p, reason: collision with root package name */
    public int f440581p;

    public i(java.io.OutputStream outputStream) {
        super(outputStream);
        this.f440572d = new java.util.HashSet();
        this.f440573e = f440571q;
        this.f440574f = 8;
        this.f440575g = new java.io.ByteArrayOutputStream();
        this.f440577i = 0L;
        this.f440581p = 0;
        this.f440580o = 4;
    }

    public static int f(java.io.OutputStream outputStream, int i17) {
        outputStream.write(i17 & 255);
        outputStream.write((i17 >> 8) & 255);
        return i17;
    }

    public static long i(java.io.OutputStream outputStream, long j17) {
        outputStream.write((int) (255 & j17));
        outputStream.write(((int) (j17 >> 8)) & 255);
        outputStream.write(((int) (j17 >> 16)) & 255);
        outputStream.write(((int) (j17 >> 24)) & 255);
        return j17;
    }

    public final void a(java.lang.String str, byte[] bArr) {
        if (bArr.length <= 65535) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " too long in UTF-8:" + bArr.length + " bytes");
    }

    public void b() {
        long j17;
        if (this.f440575g == null) {
            throw new java.io.IOException("Stream is closed");
        }
        vv5.f fVar = this.f440576h;
        if (fVar == null) {
            return;
        }
        if (fVar.f440557i != 0) {
            i(((java.io.FilterOutputStream) this).out, 134695760L);
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440554f);
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440555g);
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440556h);
            j17 = 46;
        } else {
            j17 = 30;
        }
        int i17 = this.f440576h.f440557i == 0 ? 0 : 8;
        i(this.f440575g, 33639248L);
        f(this.f440575g, 20);
        f(this.f440575g, 20);
        f(this.f440575g, i17 | 2048);
        f(this.f440575g, this.f440576h.f440557i);
        f(this.f440575g, this.f440576h.f440558m);
        f(this.f440575g, this.f440576h.f440559n);
        i(this.f440575g, this.f440576h.f440554f);
        vv5.f fVar2 = this.f440576h;
        long j18 = j17 + (fVar2.f440557i == 8 ? fVar2.f440555g : fVar2.f440556h);
        i(this.f440575g, fVar2.f440555g);
        i(this.f440575g, this.f440576h.f440556h);
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f440575g;
        int length = this.f440578m.length;
        f(byteArrayOutputStream, length);
        long j19 = j18 + length;
        byte[] bArr = this.f440576h.f440560o;
        if (bArr != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = this.f440575g;
            int length2 = bArr.length;
            f(byteArrayOutputStream2, length2);
            j19 += length2;
        } else {
            f(this.f440575g, 0);
        }
        f(this.f440575g, this.f440579n.length);
        f(this.f440575g, 0);
        f(this.f440575g, 0);
        i(this.f440575g, 0L);
        i(this.f440575g, this.f440576h.f440561p);
        this.f440575g.write(this.f440578m);
        this.f440578m = null;
        byte[] bArr2 = this.f440576h.f440560o;
        if (bArr2 != null) {
            this.f440575g.write(bArr2);
        }
        this.f440577i += j19 + this.f440581p;
        this.f440581p = 0;
        byte[] bArr3 = this.f440579n;
        if (bArr3.length > 0) {
            this.f440575g.write(bArr3);
            this.f440579n = f440571q;
        }
        this.f440576h = null;
    }

    public void c(vv5.f fVar) {
        int i17;
        int i18;
        if (this.f440576h != null) {
            b();
        }
        int i19 = fVar.f440557i;
        if (i19 == -1) {
            i19 = this.f440574f;
        }
        if (i19 == 0) {
            long j17 = fVar.f440555g;
            if (j17 == -1) {
                fVar.f440555g = fVar.f440556h;
            } else if (fVar.f440556h == -1) {
                fVar.b(j17);
            }
            if (fVar.f440554f == -1) {
                throw new java.util.zip.ZipException("STORED entry missing CRC");
            }
            long j18 = fVar.f440556h;
            if (j18 == -1) {
                throw new java.util.zip.ZipException("STORED entry missing size");
            }
            if (j18 != fVar.f440555g) {
                throw new java.util.zip.ZipException("STORED entry size/compressed size mismatch");
            }
        }
        if (this.f440575g == null) {
            throw new java.io.IOException("Stream is closed");
        }
        fVar.f440553e = null;
        fVar.f440560o = null;
        fVar.f440558m = 40691;
        fVar.f440559n = 18698;
        java.nio.charset.Charset charset = vv5.d.f440550a;
        java.lang.String str = fVar.f440552d;
        byte[] bytes = str.getBytes(charset);
        this.f440578m = bytes;
        a("Name", bytes);
        this.f440579n = f440571q;
        java.lang.String str2 = fVar.f440553e;
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(charset);
            this.f440579n = bytes2;
            a("Comment", bytes2);
        }
        fVar.a(i19);
        this.f440576h = fVar;
        fVar.f440561p = this.f440577i;
        this.f440572d.add(str);
        int i27 = i19 == 0 ? 0 : 8;
        i(((java.io.FilterOutputStream) this).out, 67324752L);
        f(((java.io.FilterOutputStream) this).out, 20);
        f(((java.io.FilterOutputStream) this).out, i27 | 2048);
        f(((java.io.FilterOutputStream) this).out, i19);
        f(((java.io.FilterOutputStream) this).out, this.f440576h.f440558m);
        f(((java.io.FilterOutputStream) this).out, this.f440576h.f440559n);
        if (i19 == 0) {
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440554f);
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440556h);
            i(((java.io.FilterOutputStream) this).out, this.f440576h.f440556h);
        } else {
            i(((java.io.FilterOutputStream) this).out, 0L);
            i(((java.io.FilterOutputStream) this).out, 0L);
            i(((java.io.FilterOutputStream) this).out, 0L);
        }
        int length = this.f440578m.length;
        f(((java.io.FilterOutputStream) this).out, length);
        long j19 = this.f440577i + 30 + length;
        vv5.f fVar2 = this.f440576h;
        byte[] bArr = fVar2.f440560o;
        long length2 = j19 + (bArr != null ? bArr.length : 0);
        if (fVar2.f440557i != 0 || (i18 = this.f440580o) == 0) {
            i17 = 0;
        } else {
            long j27 = i18;
            i17 = (int) ((j27 - (length2 % j27)) % j27);
        }
        this.f440581p = i17;
        if (bArr != null) {
            f(((java.io.FilterOutputStream) this).out, bArr.length + i17);
        } else {
            f(((java.io.FilterOutputStream) this).out, i17);
        }
        ((java.io.FilterOutputStream) this).out.write(this.f440578m);
        byte[] bArr2 = this.f440576h.f440560o;
        if (bArr2 != null) {
            ((java.io.FilterOutputStream) this).out.write(bArr2);
        }
        java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
        long j28 = this.f440581p;
        if (j28 <= 0) {
            return;
        }
        while (true) {
            long j29 = j28 - 1;
            if (j28 <= 0) {
                return;
            }
            outputStream.write(0);
            j28 = j29;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.OutputStream outputStream = ((java.io.FilterOutputStream) this).out;
        if (outputStream != null) {
            if (outputStream == null) {
                throw new java.io.IOException("Stream is closed");
            }
            if (this.f440575g != null) {
                java.util.HashSet hashSet = this.f440572d;
                if (hashSet.isEmpty()) {
                    throw new java.util.zip.ZipException("No entries");
                }
                if (this.f440576h != null) {
                    b();
                }
                int size = this.f440575g.size();
                i(this.f440575g, 101010256L);
                f(this.f440575g, 0);
                f(this.f440575g, 0);
                f(this.f440575g, hashSet.size());
                f(this.f440575g, hashSet.size());
                i(this.f440575g, size);
                i(this.f440575g, this.f440577i + this.f440581p);
                f(this.f440575g, this.f440573e.length);
                byte[] bArr = this.f440573e;
                if (bArr.length > 0) {
                    this.f440575g.write(bArr);
                }
                this.f440575g.writeTo(((java.io.FilterOutputStream) this).out);
                this.f440575g = null;
            }
            ((java.io.FilterOutputStream) this).out.close();
            ((java.io.FilterOutputStream) this).out = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int length = bArr.length;
        if ((i17 | i18) < 0 || i17 > length || length - i17 < i18) {
            throw new java.lang.ArrayIndexOutOfBoundsException(i17);
        }
        vv5.f fVar = this.f440576h;
        if (fVar == null) {
            throw new java.util.zip.ZipException("No active entry");
        }
        if (fVar.f440557i == 0) {
            ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
        } else {
            ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
        }
    }
}
