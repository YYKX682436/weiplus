package h46;

/* loaded from: classes13.dex */
public abstract class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final int f278969e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f278970f;

    /* renamed from: g, reason: collision with root package name */
    public int f278971g;

    /* renamed from: h, reason: collision with root package name */
    public int f278972h;

    /* renamed from: i, reason: collision with root package name */
    public final r46.g f278973i;

    /* renamed from: m, reason: collision with root package name */
    public long f278974m;

    /* renamed from: n, reason: collision with root package name */
    public int f278975n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f278976o = new byte[1];

    /* renamed from: p, reason: collision with root package name */
    public final r46.c f278977p = new r46.c() { // from class: h46.a$$a
        @Override // r46.c
        public final int a() {
            return h46.a.this.i();
        }
    };

    public a(java.io.InputStream inputStream, int i17) {
        this.f278973i = new r46.g(inputStream);
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("windowSize must be bigger than 0");
        }
        this.f278969e = i17;
        this.f278970f = new byte[i17 * 3];
        this.f278972h = 0;
        this.f278971g = 0;
        this.f278974m = 0L;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f278971g - this.f278972h;
    }

    public final int b(byte[] bArr, int i17, int i18) {
        if (i18 > this.f278971g - this.f278972h) {
            int min = (int) java.lang.Math.min(i18 - r0, this.f278974m);
            byte[] bArr2 = this.f278970f;
            int min2 = java.lang.Math.min(min, bArr2.length - this.f278971g);
            if (min2 != 0) {
                int i19 = this.f278975n;
                if (i19 == 1) {
                    int i27 = this.f278971g;
                    java.util.Arrays.fill(bArr2, i27, i27 + min2, bArr2[i27 - 1]);
                    this.f278971g += min2;
                } else if (min2 < i19) {
                    int i28 = this.f278971g;
                    java.lang.System.arraycopy(bArr2, i28 - i19, bArr2, i28, min2);
                    this.f278971g += min2;
                } else {
                    int i29 = min2 / i19;
                    for (int i37 = 0; i37 < i29; i37++) {
                        int i38 = this.f278971g;
                        int i39 = this.f278975n;
                        java.lang.System.arraycopy(bArr2, i38 - i39, bArr2, i38, i39);
                        this.f278971g += this.f278975n;
                    }
                    int i47 = this.f278975n;
                    int i48 = min2 - (i29 * i47);
                    if (i48 > 0) {
                        int i49 = this.f278971g;
                        java.lang.System.arraycopy(bArr2, i49 - i47, bArr2, i49, i48);
                        this.f278971g += i48;
                    }
                }
            }
            this.f278974m -= min2;
        }
        return c(bArr, i17, i18);
    }

    public final int c(byte[] bArr, int i17, int i18) {
        int min = java.lang.Math.min(i18, this.f278971g - this.f278972h);
        if (min > 0) {
            int i19 = this.f278972h;
            byte[] bArr2 = this.f278970f;
            java.lang.System.arraycopy(bArr2, i19, bArr, i17, min);
            int i27 = this.f278972h + min;
            this.f278972h = i27;
            int i28 = this.f278969e;
            int i29 = i28 * 2;
            if (i27 > i29) {
                java.lang.System.arraycopy(bArr2, i28, bArr2, 0, i29);
                this.f278971g -= i28;
                this.f278972h -= i28;
            }
        }
        return min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f278973i.close();
    }

    public final int f(byte[] bArr, int i17, int i18) {
        if (i18 > this.f278971g - this.f278972h) {
            int min = (int) java.lang.Math.min(i18 - r0, this.f278974m);
            byte[] bArr2 = this.f278970f;
            int min2 = java.lang.Math.min(min, bArr2.length - this.f278971g);
            int a17 = min2 > 0 ? r46.h.a(this.f278973i, bArr2, this.f278971g, min2) : 0;
            a(a17);
            if (min2 != a17) {
                throw new java.io.IOException("Premature end of stream reading literal");
            }
            this.f278971g += min2;
            this.f278974m -= min2;
        }
        return c(bArr, i17, i18);
    }

    public final int i() {
        int read = this.f278973i.read();
        if (read == -1) {
            return -1;
        }
        a(1);
        return read & 255;
    }

    public final void j(int i17, long j17) {
        if (i17 <= 0 || i17 > this.f278971g) {
            throw new java.lang.IllegalArgumentException("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        }
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("length must not be negative");
        }
        this.f278975n = i17;
        this.f278974m = j17;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f278976o;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
