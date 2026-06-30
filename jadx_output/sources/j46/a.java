package j46;

/* loaded from: classes13.dex */
public abstract class a extends a46.b {

    /* renamed from: f, reason: collision with root package name */
    public final r46.a f297718f;

    /* renamed from: i, reason: collision with root package name */
    public byte f297721i;

    /* renamed from: n, reason: collision with root package name */
    public int f297723n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f297724o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f297725p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f297726q;

    /* renamed from: r, reason: collision with root package name */
    public int f297727r;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f297717e = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f297719g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f297720h = 9;

    /* renamed from: m, reason: collision with root package name */
    public int f297722m = -1;

    public a(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.f297718f = new r46.a(inputStream, byteOrder);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f297718f.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f297717e;
        int read = read(bArr);
        return read < 0 ? read : bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int i19;
        int i27;
        boolean z17;
        if (i18 == 0) {
            return 0;
        }
        int length = this.f297726q.length - this.f297727r;
        if (length > 0) {
            i19 = java.lang.Math.min(length, i18);
            java.lang.System.arraycopy(this.f297726q, this.f297727r, bArr, i17, i19);
            this.f297727r += i19;
        } else {
            i19 = 0;
        }
        while (true) {
            int i28 = i18 - i19;
            if (i28 > 0) {
                n46.a aVar = (n46.a) this;
                int f17 = aVar.f();
                int i29 = -1;
                if (f17 >= 0) {
                    boolean z18 = aVar.f335089s;
                    if (z18 && f17 == aVar.f297719g) {
                        aVar.f297723n = (z18 ? 1 : 0) + 256;
                        aVar.c();
                        aVar.f297720h = 9;
                        aVar.f297722m = -1;
                        i29 = 0;
                    } else {
                        int i37 = aVar.f297723n;
                        if (f17 == i37) {
                            int i38 = aVar.f297722m;
                            if (i38 != -1) {
                                aVar.b(i38, aVar.f297721i);
                                z17 = true;
                            } else {
                                throw new java.io.IOException("The first code can't be a reference to its preceding code");
                            }
                        } else {
                            if (f17 > i37) {
                                throw new java.io.IOException(java.lang.String.format("Invalid %d bit code 0x%x", java.lang.Integer.valueOf(aVar.f297720h), java.lang.Integer.valueOf(f17)));
                            }
                            z17 = false;
                        }
                        for (int i39 = f17; i39 >= 0; i39 = aVar.f297724o[i39]) {
                            byte[] bArr2 = aVar.f297726q;
                            int i47 = aVar.f297727r - 1;
                            aVar.f297727r = i47;
                            bArr2[i47] = aVar.f297725p[i39];
                        }
                        int i48 = aVar.f297722m;
                        if (i48 != -1 && !z17) {
                            aVar.b(i48, aVar.f297726q[aVar.f297727r]);
                        }
                        aVar.f297722m = f17;
                        byte[] bArr3 = aVar.f297726q;
                        i29 = aVar.f297727r;
                        aVar.f297721i = bArr3[i29];
                    }
                }
                if (i29 < 0) {
                    if (i19 <= 0) {
                        return i29;
                    }
                    a(i19);
                    return i19;
                }
                int i49 = i17 + i19;
                int length2 = this.f297726q.length - this.f297727r;
                if (length2 > 0) {
                    i27 = java.lang.Math.min(length2, i28);
                    java.lang.System.arraycopy(this.f297726q, this.f297727r, bArr, i49, i27);
                    this.f297727r += i27;
                } else {
                    i27 = 0;
                }
                i19 += i27;
            } else {
                a(i19);
                return i19;
            }
        }
    }
}
