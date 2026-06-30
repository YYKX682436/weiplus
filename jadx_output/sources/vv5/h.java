package vv5;

/* loaded from: classes13.dex */
public class h implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440566d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashMap f440567e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.io.File f440568f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.RandomAccessFile f440569g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f440570h;

    public h(java.io.File file, int i17) {
        java.lang.String path = file.getPath();
        this.f440566d = path;
        if (i17 != 1 && i17 != 5) {
            throw new java.lang.IllegalArgumentException("Bad mode: " + i17);
        }
        if ((i17 & 4) != 0) {
            this.f440568f = file;
            file.deleteOnExit();
        } else {
            this.f440568f = null;
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(path, "r");
        this.f440569g = randomAccessFile;
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new java.util.zip.ZipException("File too short to be a zip file: " + this.f440569g.length());
        }
        this.f440569g.seek(0L);
        if (java.lang.Integer.reverseBytes(this.f440569g.readInt()) != 67324752) {
            throw new java.util.zip.ZipException("Not a zip archive");
        }
        long j17 = length - 65536;
        long j18 = j17 >= 0 ? j17 : 0L;
        do {
            this.f440569g.seek(length);
            if (java.lang.Integer.reverseBytes(this.f440569g.readInt()) == 101010256) {
                byte[] bArr = new byte[18];
                this.f440569g.readFully(bArr);
                vv5.c cVar = new vv5.c(bArr, 0, 18, java.nio.ByteOrder.LITTLE_ENDIAN);
                int b17 = cVar.b() & 65535;
                int b18 = cVar.b() & 65535;
                int b19 = cVar.b() & 65535;
                int b27 = cVar.b() & 65535;
                cVar.f440549d += 4;
                long a17 = cVar.a() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                int b28 = 65535 & cVar.b();
                if (b19 != b27 || b17 != 0 || b18 != 0) {
                    throw new java.util.zip.ZipException("Spanned archives not supported");
                }
                if (b28 > 0) {
                    byte[] bArr2 = new byte[b28];
                    this.f440569g.readFully(bArr2);
                    this.f440570h = new java.lang.String(bArr2, 0, b28, vv5.d.f440550a);
                }
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new vv5.g(this.f440569g, a17), 4096);
                byte[] bArr3 = new byte[46];
                for (int i18 = 0; i18 < b19; i18++) {
                    vv5.f fVar = new vv5.f(bArr3, bufferedInputStream, vv5.d.f440550a, false);
                    if (fVar.f440561p >= a17) {
                        throw new java.util.zip.ZipException("Local file header offset is after central directory");
                    }
                    java.util.LinkedHashMap linkedHashMap = this.f440567e;
                    java.lang.String str = fVar.f440552d;
                    if (linkedHashMap.put(str, fVar) != null) {
                        throw new java.util.zip.ZipException("Duplicate entry name: " + str);
                    }
                }
                return;
            }
            length--;
        } while (length >= j18);
        throw new java.util.zip.ZipException("End Of Central Directory signature not found");
    }

    public static void f(java.lang.String str, long j17, java.lang.String str2, long j18, java.lang.String str3, int i17) {
        throw new java.util.zip.ZipException("file name:" + str + ", file size" + j17 + ", entry name:" + str2 + ", entry localHeaderRelOffset:" + j18 + ", " + str3 + " signature not found; was " + java.lang.Integer.toHexString(i17));
    }

    public final void a() {
        if (this.f440569g == null) {
            throw new java.lang.IllegalStateException("Zip file closed");
        }
    }

    public vv5.f b(java.lang.String str) {
        a();
        if (str == null) {
            throw new java.lang.NullPointerException("entryName == null");
        }
        java.util.LinkedHashMap linkedHashMap = this.f440567e;
        vv5.f fVar = (vv5.f) linkedHashMap.get(str);
        return fVar == null ? (vv5.f) linkedHashMap.get(str.concat("/")) : fVar;
    }

    public java.io.InputStream c(vv5.f fVar) {
        vv5.g gVar;
        vv5.f b17 = b(fVar.f440552d);
        if (b17 == null) {
            return null;
        }
        java.io.RandomAccessFile randomAccessFile = this.f440569g;
        synchronized (randomAccessFile) {
            gVar = new vv5.g(randomAccessFile, b17.f440561p);
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(gVar);
            int reverseBytes = java.lang.Integer.reverseBytes(dataInputStream.readInt());
            if (reverseBytes != 67324752) {
                f(this.f440566d, randomAccessFile.length(), b17.f440552d, b17.f440561p, "Local File Header", reverseBytes);
                throw null;
            }
            dataInputStream.skipBytes(2);
            int reverseBytes2 = java.lang.Short.reverseBytes(dataInputStream.readShort()) & 65535;
            if ((reverseBytes2 & 1) != 0) {
                throw new java.util.zip.ZipException("Invalid General Purpose Bit Flag: " + reverseBytes2);
            }
            dataInputStream.skipBytes(18);
            int reverseBytes3 = java.lang.Short.reverseBytes(dataInputStream.readShort()) & 65535;
            int reverseBytes4 = java.lang.Short.reverseBytes(dataInputStream.readShort()) & 65535;
            dataInputStream.close();
            gVar.skip(reverseBytes3 + reverseBytes4);
            if (b17.f440557i == 0) {
                gVar.f440564e = gVar.f440565f + b17.f440556h;
            } else {
                gVar.f440564e = gVar.f440565f + b17.f440555g;
            }
        }
        return gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.RandomAccessFile randomAccessFile = this.f440569g;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                this.f440569g = null;
                randomAccessFile.close();
            }
            java.io.File file = this.f440568f;
            if (file != null) {
                file.delete();
                this.f440568f = null;
            }
        }
    }
}
