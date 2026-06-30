package n8;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f335484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335486c;

    /* renamed from: d, reason: collision with root package name */
    public final int f335487d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335488e;

    /* renamed from: f, reason: collision with root package name */
    public final short[] f335489f;

    /* renamed from: g, reason: collision with root package name */
    public int f335490g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f335491h;

    /* renamed from: i, reason: collision with root package name */
    public int f335492i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f335493j;

    /* renamed from: k, reason: collision with root package name */
    public int f335494k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f335495l;

    /* renamed from: q, reason: collision with root package name */
    public int f335500q;

    /* renamed from: r, reason: collision with root package name */
    public int f335501r;

    /* renamed from: s, reason: collision with root package name */
    public int f335502s;

    /* renamed from: t, reason: collision with root package name */
    public int f335503t;

    /* renamed from: v, reason: collision with root package name */
    public int f335505v;

    /* renamed from: w, reason: collision with root package name */
    public int f335506w;

    /* renamed from: x, reason: collision with root package name */
    public int f335507x;

    /* renamed from: m, reason: collision with root package name */
    public int f335496m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f335497n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f335504u = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f335498o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f335499p = 1.0f;

    public d0(int i17, int i18) {
        this.f335484a = i17;
        this.f335485b = i18;
        this.f335486c = i17 / 400;
        int i19 = i17 / 65;
        this.f335487d = i19;
        int i27 = i19 * 2;
        this.f335488e = i27;
        this.f335489f = new short[i27];
        this.f335490g = i27;
        this.f335491h = new short[i27 * i18];
        this.f335492i = i27;
        this.f335493j = new short[i27 * i18];
        this.f335494k = i27;
        this.f335495l = new short[i27 * i18];
    }

    public static void d(int i17, int i18, short[] sArr, int i19, short[] sArr2, int i27, short[] sArr3, int i28) {
        for (int i29 = 0; i29 < i18; i29++) {
            int i37 = (i19 * i18) + i29;
            int i38 = (i28 * i18) + i29;
            int i39 = (i27 * i18) + i29;
            for (int i47 = 0; i47 < i17; i47++) {
                sArr[i37] = (short) (((sArr2[i39] * (i17 - i47)) + (sArr3[i38] * i47)) / i17);
                i37 += i18;
                i39 += i18;
                i38 += i18;
            }
        }
    }

    public final void a(short[] sArr, int i17, int i18) {
        int i19 = this.f335488e / i18;
        int i27 = this.f335485b;
        int i28 = i18 * i27;
        int i29 = i17 * i27;
        for (int i37 = 0; i37 < i19; i37++) {
            int i38 = 0;
            for (int i39 = 0; i39 < i28; i39++) {
                i38 += sArr[(i37 * i28) + i29 + i39];
            }
            this.f335489f[i37] = (short) (i38 / i28);
        }
    }

    public final void b(int i17) {
        int i18 = this.f335501r + i17;
        int i19 = this.f335492i;
        if (i18 > i19) {
            int i27 = i19 + (i19 / 2) + i17;
            this.f335492i = i27;
            this.f335493j = java.util.Arrays.copyOf(this.f335493j, i27 * this.f335485b);
        }
    }

    public final int c(short[] sArr, int i17, int i18, int i19) {
        int i27 = i17 * this.f335485b;
        int i28 = 255;
        int i29 = 1;
        int i37 = 0;
        int i38 = 0;
        while (i18 <= i19) {
            int i39 = 0;
            for (int i47 = 0; i47 < i18; i47++) {
                i39 += java.lang.Math.abs(sArr[i27 + i47] - sArr[(i27 + i18) + i47]);
            }
            if (i39 * i37 < i29 * i18) {
                i37 = i18;
                i29 = i39;
            }
            if (i39 * i28 > i38 * i18) {
                i28 = i18;
                i38 = i39;
            }
            i18++;
        }
        this.f335506w = i29 / i37;
        this.f335507x = i38 / i28;
        return i37;
    }

    public final void e() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        float f17;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48 = this.f335501r;
        float f18 = this.f335498o / this.f335499p;
        double d17 = f18;
        int i49 = this.f335484a;
        int i57 = this.f335485b;
        if (d17 > 1.00001d || d17 < 0.99999d) {
            int i58 = this.f335500q;
            int i59 = this.f335488e;
            if (i58 >= i59) {
                int i66 = 0;
                while (true) {
                    int i67 = this.f335503t;
                    if (i67 > 0) {
                        int min = java.lang.Math.min(i59, i67);
                        short[] sArr = this.f335491h;
                        b(min);
                        java.lang.System.arraycopy(sArr, i66 * i57, this.f335493j, this.f335501r * i57, i57 * min);
                        this.f335501r += min;
                        this.f335503t -= min;
                        i66 += min;
                        i18 = i48;
                        i17 = i49;
                    } else {
                        short[] sArr2 = this.f335491h;
                        int i68 = i49 > 4000 ? i49 / 4000 : 1;
                        int i69 = this.f335487d;
                        int i76 = this.f335486c;
                        if (i57 == 1 && i68 == 1) {
                            i19 = c(sArr2, i66, i76, i69);
                            i18 = i48;
                            i17 = i49;
                        } else {
                            a(sArr2, i66, i68);
                            i17 = i49;
                            short[] sArr3 = this.f335489f;
                            i18 = i48;
                            int c17 = c(sArr3, 0, i76 / i68, i69 / i68);
                            if (i68 != 1) {
                                int i77 = c17 * i68;
                                int i78 = i68 * 4;
                                int i79 = i77 - i78;
                                int i86 = i77 + i78;
                                if (i79 >= i76) {
                                    i76 = i79;
                                }
                                if (i86 <= i69) {
                                    i69 = i86;
                                }
                                if (i57 == 1) {
                                    i19 = c(sArr2, i66, i76, i69);
                                } else {
                                    a(sArr2, i66, 1);
                                    i19 = c(sArr3, 0, i76, i69);
                                }
                            } else {
                                i19 = c17;
                            }
                        }
                        int i87 = this.f335506w;
                        int i88 = i87 != 0 && this.f335504u != 0 && this.f335507x <= i87 * 3 && i87 * 2 > this.f335505v * 3 ? this.f335504u : i19;
                        this.f335505v = i87;
                        this.f335504u = i19;
                        if (d17 > 1.0d) {
                            short[] sArr4 = this.f335491h;
                            if (f18 >= 2.0f) {
                                i28 = (int) (i88 / (f18 - 1.0f));
                            } else {
                                this.f335503t = (int) ((i88 * (2.0f - f18)) / (f18 - 1.0f));
                                i28 = i88;
                            }
                            b(i28);
                            int i89 = i66;
                            d(i28, this.f335485b, this.f335493j, this.f335501r, sArr4, i89, sArr4, i66 + i88);
                            this.f335501r += i28;
                            i66 = i89 + i88 + i28;
                        } else {
                            int i96 = i66;
                            short[] sArr5 = this.f335491h;
                            if (f18 < 0.5f) {
                                i27 = (int) ((i88 * f18) / (1.0f - f18));
                            } else {
                                this.f335503t = (int) ((i88 * ((2.0f * f18) - 1.0f)) / (1.0f - f18));
                                i27 = i88;
                            }
                            int i97 = i88 + i27;
                            b(i97);
                            java.lang.System.arraycopy(sArr5, i96 * i57, this.f335493j, this.f335501r * i57, i57 * i88);
                            d(i27, this.f335485b, this.f335493j, this.f335501r + i88, sArr5, i96 + i88, sArr5, i96);
                            this.f335501r += i97;
                            i66 = i96 + i27;
                        }
                    }
                    if (i66 + i59 > i58) {
                        break;
                    }
                    i49 = i17;
                    i48 = i18;
                }
                int i98 = this.f335500q - i66;
                short[] sArr6 = this.f335491h;
                java.lang.System.arraycopy(sArr6, i66 * i57, sArr6, 0, i57 * i98);
                this.f335500q = i98;
                f17 = this.f335499p;
                if (f17 != 1.0f || this.f335501r == (i29 = i18)) {
                }
                int i99 = i17;
                int i100 = (int) (i99 / f17);
                while (true) {
                    if (i100 <= 16384 && i99 <= 16384) {
                        break;
                    }
                    i100 /= 2;
                    i99 /= 2;
                }
                int i101 = this.f335501r - i29;
                int i102 = this.f335502s + i101;
                int i103 = this.f335494k;
                if (i102 > i103) {
                    int i104 = i103 + (i103 / 2) + i101;
                    this.f335494k = i104;
                    this.f335495l = java.util.Arrays.copyOf(this.f335495l, i104 * i57);
                }
                java.lang.System.arraycopy(this.f335493j, i29 * i57, this.f335495l, this.f335502s * i57, i57 * i101);
                this.f335501r = i29;
                this.f335502s += i101;
                int i105 = 0;
                while (true) {
                    i37 = this.f335502s;
                    i38 = i37 - 1;
                    if (i105 >= i38) {
                        break;
                    }
                    while (true) {
                        i39 = this.f335496m + 1;
                        int i106 = i39 * i100;
                        i47 = this.f335497n;
                        if (i106 <= i47 * i99) {
                            break;
                        }
                        b(1);
                        for (int i107 = 0; i107 < i57; i107++) {
                            short[] sArr7 = this.f335493j;
                            int i108 = (this.f335501r * i57) + i107;
                            short[] sArr8 = this.f335495l;
                            int i109 = (i105 * i57) + i107;
                            short s17 = sArr8[i109];
                            short s18 = sArr8[i109 + i57];
                            int i110 = this.f335497n * i99;
                            int i111 = this.f335496m;
                            int i112 = i111 * i100;
                            int i113 = (i111 + 1) * i100;
                            int i114 = i113 - i110;
                            int i115 = i113 - i112;
                            sArr7[i108] = (short) (((s17 * i114) + ((i115 - i114) * s18)) / i115);
                        }
                        this.f335497n++;
                        this.f335501r++;
                    }
                    this.f335496m = i39;
                    if (i39 == i99) {
                        this.f335496m = 0;
                        t9.a.d(i47 == i100);
                        this.f335497n = 0;
                    }
                    i105++;
                }
                if (i38 == 0) {
                    return;
                }
                short[] sArr9 = this.f335495l;
                java.lang.System.arraycopy(sArr9, i38 * i57, sArr9, 0, (i37 - i38) * i57);
                this.f335502s -= i38;
                return;
            }
        } else {
            short[] sArr10 = this.f335491h;
            int i116 = this.f335500q;
            b(i116);
            java.lang.System.arraycopy(sArr10, 0 * i57, this.f335493j, this.f335501r * i57, i57 * i116);
            this.f335501r += i116;
            this.f335500q = 0;
        }
        i18 = i48;
        i17 = i49;
        f17 = this.f335499p;
        if (f17 != 1.0f) {
        }
    }
}
