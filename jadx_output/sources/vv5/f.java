package vv5;

/* loaded from: classes13.dex */
public class f implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440552d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f440553e;

    /* renamed from: f, reason: collision with root package name */
    public long f440554f;

    /* renamed from: g, reason: collision with root package name */
    public long f440555g;

    /* renamed from: h, reason: collision with root package name */
    public long f440556h;

    /* renamed from: i, reason: collision with root package name */
    public int f440557i;

    /* renamed from: m, reason: collision with root package name */
    public int f440558m;

    /* renamed from: n, reason: collision with root package name */
    public int f440559n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f440560o;

    /* renamed from: p, reason: collision with root package name */
    public long f440561p;

    /* renamed from: q, reason: collision with root package name */
    public final long f440562q;

    public f(vv5.f fVar) {
        this.f440554f = -1L;
        this.f440555g = -1L;
        this.f440556h = -1L;
        this.f440557i = -1;
        this.f440558m = -1;
        this.f440559n = -1;
        this.f440561p = -1L;
        this.f440562q = -1L;
        this.f440552d = fVar.f440552d;
        this.f440553e = fVar.f440553e;
        this.f440558m = fVar.f440558m;
        this.f440556h = fVar.f440556h;
        this.f440555g = fVar.f440555g;
        this.f440554f = fVar.f440554f;
        this.f440557i = fVar.f440557i;
        this.f440559n = fVar.f440559n;
        this.f440560o = fVar.f440560o;
        this.f440561p = fVar.f440561p;
        this.f440562q = fVar.f440562q;
    }

    public void a(int i17) {
        if (i17 == 0 || i17 == 8) {
            this.f440557i = i17;
        } else {
            throw new java.lang.IllegalArgumentException("Bad method: " + i17);
        }
    }

    public void b(long j17) {
        if (j17 >= 0) {
            this.f440556h = j17;
        } else {
            throw new java.lang.IllegalArgumentException("Bad size: " + j17);
        }
    }

    public java.lang.Object clone() {
        try {
            vv5.f fVar = (vv5.f) super.clone();
            byte[] bArr = this.f440560o;
            fVar.f440560o = bArr != null ? (byte[]) bArr.clone() : null;
            return fVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof vv5.f)) {
            return false;
        }
        return this.f440552d.equals(((vv5.f) obj).f440552d);
    }

    public int hashCode() {
        return this.f440552d.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("name:" + this.f440552d);
        stringBuffer.append("\ncomment:" + this.f440553e);
        stringBuffer.append("\ntime:" + this.f440558m);
        stringBuffer.append("\nsize:" + this.f440556h);
        stringBuffer.append("\ncompressedSize:" + this.f440555g);
        stringBuffer.append("\ncrc:" + this.f440554f);
        stringBuffer.append("\ncompressionMethod:" + this.f440557i);
        stringBuffer.append("\nmodDate:" + this.f440559n);
        stringBuffer.append("\nextra length:" + this.f440560o.length);
        stringBuffer.append("\nlocalHeaderRelOffset:" + this.f440561p);
        stringBuffer.append("\ndataOffset:" + this.f440562q);
        return stringBuffer.toString();
    }

    public f(byte[] bArr, java.io.InputStream inputStream, java.nio.charset.Charset charset, boolean z17) {
        boolean z18;
        this.f440554f = -1L;
        this.f440555g = -1L;
        this.f440556h = -1L;
        this.f440557i = -1;
        this.f440558m = -1;
        this.f440559n = -1;
        this.f440561p = -1L;
        this.f440562q = -1L;
        vv5.e.a(inputStream, bArr, 0, bArr.length);
        vv5.c cVar = new vv5.c(bArr, 0, bArr.length, java.nio.ByteOrder.LITTLE_ENDIAN);
        int a17 = cVar.a();
        if (a17 == 33639248) {
            cVar.f440549d = 8;
            int b17 = cVar.b() & 65535;
            if ((b17 & 1) == 0) {
                charset = (b17 & 2048) != 0 ? java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c) : charset;
                this.f440557i = cVar.b() & 65535;
                this.f440558m = cVar.b() & 65535;
                this.f440559n = cVar.b() & 65535;
                this.f440554f = cVar.a() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                this.f440555g = cVar.a() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                this.f440556h = cVar.a() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                int b18 = cVar.b() & 65535;
                int b19 = cVar.b() & 65535;
                int b27 = 65535 & cVar.b();
                cVar.f440549d = 42;
                this.f440561p = cVar.a() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                byte[] bArr2 = new byte[b18];
                vv5.e.a(inputStream, bArr2, 0, b18);
                int i17 = 0;
                while (true) {
                    if (i17 >= b18) {
                        z18 = false;
                        break;
                    } else {
                        if (bArr2[i17] == 0) {
                            z18 = true;
                            break;
                        }
                        i17++;
                    }
                }
                if (!z18) {
                    this.f440552d = new java.lang.String(bArr2, 0, b18, charset);
                    if (b19 > 0) {
                        byte[] bArr3 = new byte[b19];
                        this.f440560o = bArr3;
                        vv5.e.a(inputStream, bArr3, 0, b19);
                    }
                    if (b27 > 0) {
                        byte[] bArr4 = new byte[b27];
                        vv5.e.a(inputStream, bArr4, 0, b27);
                        this.f440553e = new java.lang.String(bArr4, 0, b27, charset);
                        return;
                    }
                    return;
                }
                throw new java.util.zip.ZipException("Filename contains NUL byte: " + java.util.Arrays.toString(bArr2));
            }
            throw new java.util.zip.ZipException("Invalid General Purpose Bit Flag: " + b17);
        }
        vv5.h.f(com.eclipsesource.mmv8.Platform.UNKNOWN, inputStream.available(), com.eclipsesource.mmv8.Platform.UNKNOWN, 0L, "Central Directory Entry", a17);
        throw null;
    }
}
