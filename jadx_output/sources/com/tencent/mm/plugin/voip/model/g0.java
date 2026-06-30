package com.tencent.mm.plugin.voip.model;

/* loaded from: classes16.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f176500a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.InputStream f176501b;

    /* renamed from: c, reason: collision with root package name */
    public int f176502c;

    /* renamed from: d, reason: collision with root package name */
    public int f176503d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.OutputStream f176504e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f176505f;

    /* renamed from: g, reason: collision with root package name */
    public int f176506g;

    public g0(java.io.InputStream inputStream) {
        this.f176505f = new int[8];
        this.f176501b = inputStream;
        this.f176504e = null;
        this.f176502c = inputStream.read();
        this.f176503d = inputStream.read();
    }

    public int a(boolean z17) {
        if (this.f176500a == 8) {
            this.f176502c = this.f176503d;
            this.f176503d = this.f176501b.read();
            this.f176500a = 0;
            if (this.f176502c == -1) {
                return -1;
            }
        }
        int i17 = this.f176502c;
        int i18 = this.f176500a;
        int i19 = (i17 >> (7 - i18)) & 1;
        this.f176500a = i18 + 1;
        if (z17 && this.f176504e != null) {
            i(i19);
        }
        return i19;
    }

    public boolean b(boolean z17) {
        return a(z17) == 1;
    }

    public long c(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = (j17 << 1) | a(true);
        }
        return j17;
    }

    public long d(int i17, java.lang.String str) {
        long c17 = c(i17);
        java.lang.String.valueOf(c17);
        return c17;
    }

    public int e(java.lang.String str) {
        int i17 = 0;
        int i18 = 0;
        while (a(true) == 0) {
            i18++;
        }
        if (i18 > 0) {
            i17 = (int) (((1 << i18) - 1) + c(i18));
        }
        java.lang.String.valueOf(i17);
        return i17;
    }

    public void f(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            a(true);
        }
    }

    public void g(int i17) {
        int[] iArr = new int[i17];
        int i18 = 8;
        int i19 = 8;
        for (int i27 = 0; i27 < i17; i27++) {
            if (i18 != 0) {
                int i28 = 0;
                while (a(true) == 0) {
                    i28++;
                }
                int c17 = i28 > 0 ? (int) (((1 << i28) - 1) + c(i28)) : 0;
                int i29 = ((c17 >> 1) + (c17 & 1)) * ((r6 << 1) - 1);
                java.lang.String.valueOf(i29);
                i18 = ((i29 + i19) + 256) % 256;
            }
            if (i18 != 0) {
                i19 = i18;
            }
            iArr[i27] = i19;
        }
    }

    public void h(java.lang.String str) {
        int i17 = 0;
        while (a(true) == 0) {
            i17++;
        }
        if (i17 > 0) {
            f(i17);
        }
    }

    public void i(int i17) {
        if (this.f176506g == 8) {
            this.f176506g = 0;
            j();
        }
        int i18 = this.f176506g;
        this.f176506g = i18 + 1;
        this.f176505f[i18] = i17;
    }

    public final void j() {
        int[] iArr = this.f176505f;
        this.f176504e.write((iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1) | iArr[7]);
    }

    public void k(long j17, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            i(((int) (j17 >> ((i17 - i18) - 1))) & 1);
        }
    }

    public void l(int i17, java.lang.String str) {
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= 15) {
                break;
            }
            int i28 = (1 << i19) + i27;
            if (i17 < i28) {
                i18 = i19;
                break;
            } else {
                i19++;
                i27 = i28;
            }
        }
        k(0L, i18);
        i(1);
        k(i17 - i27, i18);
    }

    public g0(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        this.f176505f = new int[8];
        this.f176501b = inputStream;
        this.f176504e = outputStream;
        this.f176502c = inputStream.read();
        this.f176503d = inputStream.read();
    }
}
