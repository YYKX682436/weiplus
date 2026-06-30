package vv5;

/* loaded from: classes13.dex */
public class a extends java.util.zip.DeflaterOutputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f440529v = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f440530w = {0};

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f440531d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f440532e;

    /* renamed from: f, reason: collision with root package name */
    public final int f440533f;

    /* renamed from: g, reason: collision with root package name */
    public final int f440534g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.ByteArrayOutputStream f440535h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.zip.ZipEntry f440536i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.zip.CRC32 f440537m;

    /* renamed from: n, reason: collision with root package name */
    public long f440538n;

    /* renamed from: o, reason: collision with root package name */
    public int f440539o;

    /* renamed from: p, reason: collision with root package name */
    public int f440540p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f440541q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f440542r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f440543s;

    /* renamed from: t, reason: collision with root package name */
    public final int f440544t;

    /* renamed from: u, reason: collision with root package name */
    public int f440545u;

    public a(java.io.OutputStream outputStream) {
        super(outputStream, new java.util.zip.Deflater(-1, true));
        this.f440531d = f440529v;
        this.f440532e = new java.util.HashSet();
        this.f440533f = 8;
        this.f440534g = -1;
        this.f440535h = new java.io.ByteArrayOutputStream();
        this.f440537m = new java.util.zip.CRC32();
        this.f440538n = 0L;
        this.f440539o = 0;
        this.f440542r = false;
        this.f440543s = false;
        this.f440545u = 0;
        this.f440544t = 4;
    }

    public void a() {
        int i17;
        int i18;
        if (this.f440543s) {
            throw new java.io.IOException("Stream is closed");
        }
        java.util.zip.ZipEntry zipEntry = this.f440536i;
        if (zipEntry == null) {
            return;
        }
        if (zipEntry.getMethod() == 8) {
            super.finish();
        }
        int method = this.f440536i.getMethod();
        java.util.zip.CRC32 crc32 = this.f440537m;
        if (method == 0) {
            if (crc32.getValue() != this.f440536i.getCrc()) {
                throw new java.util.zip.ZipException("CRC mismatch");
            }
            if (this.f440536i.getSize() != this.f440538n) {
                throw new java.util.zip.ZipException("Size mismatch");
            }
        }
        if (this.f440536i.getMethod() != 0) {
            c(((java.util.zip.DeflaterOutputStream) this).out, 134695760L);
            this.f440536i.setCrc(crc32.getValue());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getCrc());
            this.f440536i.setCompressedSize(((java.util.zip.DeflaterOutputStream) this).def.getTotalOut());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getCompressedSize());
            this.f440536i.setSize(((java.util.zip.DeflaterOutputStream) this).def.getTotalIn());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getSize());
            i17 = 46;
        } else {
            i17 = 30;
        }
        int i19 = this.f440536i.getMethod() == 0 ? 0 : 8;
        c(this.f440535h, 33639248L);
        f(this.f440535h, 20);
        f(this.f440535h, 20);
        f(this.f440535h, i19 | 2048);
        f(this.f440535h, this.f440536i.getMethod());
        f(this.f440535h, 0);
        f(this.f440535h, 33);
        c(this.f440535h, crc32.getValue());
        if (this.f440536i.getMethod() == 8) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = this.f440535h;
            long totalOut = ((java.util.zip.DeflaterOutputStream) this).def.getTotalOut();
            c(byteArrayOutputStream, totalOut);
            i18 = (int) (i17 + totalOut);
            c(this.f440535h, ((java.util.zip.DeflaterOutputStream) this).def.getTotalIn());
        } else {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = this.f440535h;
            long j17 = this.f440538n;
            c(byteArrayOutputStream2, j17);
            i18 = (int) (i17 + j17);
            c(this.f440535h, this.f440538n);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream3 = this.f440535h;
        int i27 = this.f440540p;
        f(byteArrayOutputStream3, i27);
        int i28 = i18 + i27;
        if (this.f440536i.getExtra() != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream4 = this.f440535h;
            int length = this.f440536i.getExtra().length;
            f(byteArrayOutputStream4, length);
            i28 += length;
        } else {
            f(this.f440535h, 0);
        }
        java.lang.String comment = this.f440536i.getComment();
        byte[] bArr = f440529v;
        if (comment != null) {
            bArr = comment.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
        }
        f(this.f440535h, bArr.length);
        f(this.f440535h, 0);
        f(this.f440535h, 0);
        c(this.f440535h, 0L);
        c(this.f440535h, this.f440539o);
        this.f440535h.write(this.f440541q);
        this.f440541q = null;
        if (this.f440536i.getExtra() != null) {
            this.f440535h.write(this.f440536i.getExtra());
        }
        this.f440539o += i28 + this.f440545u;
        this.f440545u = 0;
        if (bArr.length > 0) {
            this.f440535h.write(bArr);
        }
        this.f440536i = null;
        crc32.reset();
        this.f440538n = 0L;
        ((java.util.zip.DeflaterOutputStream) this).def.reset();
    }

    public void b(java.util.zip.ZipEntry zipEntry) {
        int i17;
        if (this.f440536i != null) {
            a();
        }
        int method = zipEntry.getMethod();
        if (method == -1) {
            method = this.f440533f;
        }
        if (method == 0) {
            if (zipEntry.getCompressedSize() == -1) {
                zipEntry.setCompressedSize(zipEntry.getSize());
            } else if (zipEntry.getSize() == -1) {
                zipEntry.setSize(zipEntry.getCompressedSize());
            }
            if (zipEntry.getCrc() == -1) {
                throw new java.util.zip.ZipException("STORED entry missing CRC");
            }
            if (zipEntry.getSize() == -1) {
                throw new java.util.zip.ZipException("STORED entry missing size");
            }
            if (zipEntry.getSize() != zipEntry.getCompressedSize()) {
                throw new java.util.zip.ZipException("STORED entry size/compressed size mismatch");
            }
        }
        if (this.f440543s) {
            throw new java.io.IOException("Stream is closed");
        }
        java.util.HashSet hashSet = this.f440532e;
        if (hashSet.contains(zipEntry.getName())) {
            throw new java.util.zip.ZipException("Entry already exists: " + zipEntry.getName());
        }
        if (hashSet.size() == 65535) {
            throw new java.util.zip.ZipException("Too many entries for the zip file format's 16-bit entry count");
        }
        byte[] bytes = zipEntry.getName().getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
        this.f440541q = bytes;
        int length = bytes.length;
        this.f440540p = length;
        if (length > 65535) {
            throw new java.lang.IllegalArgumentException("Name too long: " + this.f440540p + " UTF-8 bytes");
        }
        ((java.util.zip.DeflaterOutputStream) this).def.setLevel(this.f440534g);
        zipEntry.setMethod(method);
        this.f440536i = zipEntry;
        hashSet.add(zipEntry.getName());
        int i18 = method == 0 ? 0 : 8;
        c(((java.util.zip.DeflaterOutputStream) this).out, 67324752L);
        f(((java.util.zip.DeflaterOutputStream) this).out, 20);
        f(((java.util.zip.DeflaterOutputStream) this).out, i18 | 2048);
        f(((java.util.zip.DeflaterOutputStream) this).out, method);
        if (this.f440536i.getTime() == -1) {
            this.f440536i.setTime(java.lang.System.currentTimeMillis());
        }
        f(((java.util.zip.DeflaterOutputStream) this).out, 0);
        f(((java.util.zip.DeflaterOutputStream) this).out, 33);
        if (method == 0) {
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getCrc());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getSize());
            c(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getSize());
        } else {
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
            c(((java.util.zip.DeflaterOutputStream) this).out, 0L);
        }
        f(((java.util.zip.DeflaterOutputStream) this).out, this.f440540p);
        this.f440545u = (this.f440536i.getMethod() != 0 || (i17 = this.f440544t) == 0) ? 0 : (i17 - ((((this.f440539o + 30) + this.f440540p) + (this.f440536i.getExtra() != null ? this.f440536i.getExtra().length : 0)) % i17)) % i17;
        if (this.f440536i.getExtra() != null) {
            f(((java.util.zip.DeflaterOutputStream) this).out, this.f440536i.getExtra().length + this.f440545u);
        } else {
            f(((java.util.zip.DeflaterOutputStream) this).out, this.f440545u);
        }
        ((java.util.zip.DeflaterOutputStream) this).out.write(this.f440541q);
        if (this.f440536i.getExtra() != null) {
            ((java.util.zip.DeflaterOutputStream) this).out.write(this.f440536i.getExtra());
        }
        java.io.OutputStream outputStream = ((java.util.zip.DeflaterOutputStream) this).out;
        int i19 = this.f440545u;
        if (i19 <= 0) {
            return;
        }
        while (true) {
            int i27 = i19 - 1;
            if (i19 <= 0) {
                return;
            }
            outputStream.write(0);
            i19 = i27;
        }
    }

    public final long c(java.io.OutputStream outputStream, long j17) {
        outputStream.write((int) (255 & j17));
        outputStream.write(((int) (j17 >> 8)) & 255);
        outputStream.write(((int) (j17 >> 16)) & 255);
        outputStream.write(((int) (j17 >> 24)) & 255);
        return j17;
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f440543s) {
            return;
        }
        finish();
        ((java.util.zip.DeflaterOutputStream) this).def.end();
        ((java.util.zip.DeflaterOutputStream) this).out.close();
        ((java.util.zip.DeflaterOutputStream) this).out = null;
        this.f440543s = true;
    }

    public final int f(java.io.OutputStream outputStream, int i17) {
        if (i17 <= 65535) {
            outputStream.write(i17 & 255);
            outputStream.write((i17 >> 8) & 255);
            return i17;
        }
        throw new java.lang.IllegalArgumentException("value " + i17 + " is too large for type 'short'.");
    }

    @Override // java.util.zip.DeflaterOutputStream
    public void finish() {
        if (this.f440543s) {
            throw new java.io.IOException("Stream is closed");
        }
        if (this.f440542r) {
            return;
        }
        java.util.HashSet hashSet = this.f440532e;
        if (hashSet.isEmpty()) {
            throw new java.util.zip.ZipException("No entries");
        }
        if (this.f440536i != null) {
            a();
        }
        int size = this.f440535h.size();
        c(this.f440535h, 101010256L);
        f(this.f440535h, 0);
        f(this.f440535h, 0);
        f(this.f440535h, hashSet.size());
        f(this.f440535h, hashSet.size());
        c(this.f440535h, size);
        c(this.f440535h, this.f440539o + this.f440545u);
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f440535h;
        byte[] bArr = this.f440531d;
        f(byteArrayOutputStream, bArr.length);
        if (bArr.length > 0) {
            this.f440535h.write(bArr);
        }
        this.f440535h.writeTo(((java.util.zip.DeflaterOutputStream) this).out);
        this.f440535h = null;
        this.f440542r = true;
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        byte[] bArr = f440530w;
        bArr[0] = (byte) (i17 & 255);
        write(bArr, 0, 1);
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int length = bArr.length;
        if ((i17 | i18) >= 0 && i17 <= length && length - i17 >= i18) {
            java.util.zip.ZipEntry zipEntry = this.f440536i;
            if (zipEntry != null) {
                if (zipEntry.getMethod() == 0) {
                    ((java.util.zip.DeflaterOutputStream) this).out.write(bArr, i17, i18);
                } else {
                    super.write(bArr, i17, i18);
                }
                this.f440537m.update(bArr, i17, i18);
                this.f440538n += i18;
                return;
            }
            throw new java.util.zip.ZipException("No active entry");
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("length=" + length + "; regionStart=" + i17 + "; regionLength=" + i18);
    }
}
