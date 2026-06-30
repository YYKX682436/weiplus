package e46;

/* loaded from: classes16.dex */
public class i implements java.io.Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final short[] f249452i = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f249453m = {16, 32, 48, 64, 81, 113, 146, 210, com.tencent.mars.cdn.CdnManager.kAppTypeTingImage, 403, com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX, com.tencent.mm.plugin.appbrand.jsapi.nfc.k.CTRL_INDEX, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f249454n = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f249455o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f249456p;

    /* renamed from: d, reason: collision with root package name */
    public boolean f249457d;

    /* renamed from: f, reason: collision with root package name */
    public r46.a f249459f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.InputStream f249460g;

    /* renamed from: h, reason: collision with root package name */
    public final e46.e f249461h = new e46.e(null);

    /* renamed from: e, reason: collision with root package name */
    public e46.d f249458e = new e46.g(null);

    static {
        int[] iArr = new int[288];
        f249455o = iArr;
        java.util.Arrays.fill(iArr, 0, 144, 8);
        java.util.Arrays.fill(iArr, 144, 256, 9);
        java.util.Arrays.fill(iArr, 256, 280, 7);
        java.util.Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f249456p = iArr2;
        java.util.Arrays.fill(iArr2, 5);
    }

    public i(java.io.InputStream inputStream) {
        this.f249459f = new r46.a(inputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f249460g = inputStream;
    }

    public static e46.c a(int[] iArr) {
        int[] iArr2 = new int[65];
        int i17 = 0;
        for (int i18 : iArr) {
            if (i18 < 0 || i18 > 64) {
                throw new java.lang.IllegalArgumentException("Invalid code " + i18 + " in literal table");
            }
            i17 = java.lang.Math.max(i17, i18);
            iArr2[i18] = iArr2[i18] + 1;
        }
        int i19 = i17 + 1;
        int[] copyOf = java.util.Arrays.copyOf(iArr2, i19);
        int[] iArr3 = new int[i19];
        int i27 = 0;
        for (int i28 = 0; i28 <= i17; i28++) {
            i27 = (i27 + copyOf[i28]) << 1;
            iArr3[i28] = i27;
        }
        e46.c cVar = new e46.c(0);
        for (int i29 = 0; i29 < iArr.length; i29++) {
            int i37 = iArr[i29];
            if (i37 != 0) {
                int i38 = i37 - 1;
                int i39 = iArr3[i38];
                e46.c cVar2 = cVar;
                for (int i47 = i38; i47 >= 0; i47--) {
                    int i48 = (1 << i47) & i39;
                    int i49 = cVar2.f249434a;
                    if (i48 == 0) {
                        if (cVar2.f249436c == null && cVar2.f249435b == -1) {
                            cVar2.f249436c = new e46.c(i49 + 1);
                        }
                        cVar2 = cVar2.f249436c;
                    } else {
                        if (cVar2.f249437d == null && cVar2.f249435b == -1) {
                            cVar2.f249437d = new e46.c(i49 + 1);
                        }
                        cVar2 = cVar2.f249437d;
                    }
                    if (cVar2 == null) {
                        throw new java.lang.IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                cVar2.f249435b = i29;
                cVar2.f249436c = null;
                cVar2.f249437d = null;
                iArr3[i38] = iArr3[i38] + 1;
            }
        }
        return cVar;
    }

    public static int c(r46.a aVar, e46.c cVar) {
        while (cVar != null && cVar.f249435b == -1) {
            cVar = i(aVar, 1) == 0 ? cVar.f249436c : cVar.f249437d;
        }
        if (cVar != null) {
            return cVar.f249435b;
        }
        return -1;
    }

    public static long i(r46.a aVar, int i17) {
        long a17 = aVar.a(i17);
        if (a17 != -1) {
            return a17;
        }
        throw new java.io.EOFException("Truncated Deflate64 Stream");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00a1. Please report as an issue. */
    public int b(byte[] bArr, int i17, int i18) {
        long i19;
        while (true) {
            if (this.f249457d && !this.f249458e.b()) {
                return -1;
            }
            if (this.f249458e.d() == e46.j.INITIAL) {
                this.f249457d = f(1) == 1;
                int f17 = (int) f(2);
                if (f17 == 0) {
                    r46.a aVar = this.f249459f;
                    int i27 = aVar.f392499g % 8;
                    if (i27 > 0) {
                        aVar.b(i27);
                    }
                    long f18 = f(16);
                    if ((65535 & (f18 ^ 65535)) != f(16)) {
                        throw new java.lang.IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f249458e = new e46.h(this, f18, null);
                } else if (f17 == 1) {
                    this.f249458e = new e46.f(this, e46.j.FIXED_CODES, f249455o, f249456p);
                } else {
                    if (f17 != 2) {
                        throw new java.lang.IllegalStateException("Unsupported compression: " + f17);
                    }
                    int f19 = (int) (f(5) + 1);
                    int[] iArr = new int[f19];
                    int[][] iArr2 = {new int[(int) (f(5) + 257)], iArr};
                    r46.a aVar2 = this.f249459f;
                    int[] iArr3 = iArr2[0];
                    int i28 = (int) (i(aVar2, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i29 = 0;
                    while (true) {
                        int i37 = 3;
                        if (i29 < i28) {
                            iArr4[f249454n[i29]] = (int) i(aVar2, 3);
                            i29++;
                        } else {
                            e46.c a17 = a(iArr4);
                            int length = iArr3.length + f19;
                            int[] iArr5 = new int[length];
                            int i38 = 0;
                            int i39 = 0;
                            int i47 = -1;
                            while (i38 < length) {
                                if (i39 <= 0) {
                                    int c17 = c(aVar2, a17);
                                    if (c17 >= 16) {
                                        long j17 = 3;
                                        switch (c17) {
                                            case 16:
                                                i39 = (int) (i(aVar2, 2) + 3);
                                                i37 = 3;
                                                break;
                                            case 17:
                                                i19 = i(aVar2, i37);
                                                i39 = (int) (i19 + j17);
                                                i47 = 0;
                                                i37 = 3;
                                                break;
                                            case 18:
                                                i19 = i(aVar2, 7);
                                                j17 = 11;
                                                i39 = (int) (i19 + j17);
                                                i47 = 0;
                                                i37 = 3;
                                                break;
                                        }
                                    } else {
                                        iArr5[i38] = c17;
                                        i38++;
                                        i47 = c17;
                                    }
                                } else {
                                    iArr5[i38] = i47;
                                    i39--;
                                    i38++;
                                }
                            }
                            java.lang.System.arraycopy(iArr5, 0, iArr3, 0, iArr3.length);
                            java.lang.System.arraycopy(iArr5, iArr3.length, iArr, 0, f19);
                            this.f249458e = new e46.f(this, e46.j.DYNAMIC_CODES, iArr2[0], iArr2[1]);
                        }
                    }
                }
            } else {
                int c18 = this.f249458e.c(bArr, i17, i18);
                if (c18 != 0) {
                    return c18;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f249458e = new e46.g(null);
        this.f249459f = null;
    }

    public final long f(int i17) {
        return i(this.f249459f, i17);
    }
}
