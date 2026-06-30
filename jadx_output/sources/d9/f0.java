package d9;

/* loaded from: classes15.dex */
public final class f0 implements q8.o {

    /* renamed from: a, reason: collision with root package name */
    public final r9.b f227337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f227338b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.c0 f227339c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.b0 f227340d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.p f227341e;

    /* renamed from: f, reason: collision with root package name */
    public d9.d0 f227342f;

    /* renamed from: g, reason: collision with root package name */
    public d9.d0 f227343g;

    /* renamed from: h, reason: collision with root package name */
    public d9.d0 f227344h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f227345i;

    /* renamed from: j, reason: collision with root package name */
    public long f227346j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f227347k;

    /* renamed from: l, reason: collision with root package name */
    public d9.e0 f227348l;

    public f0(r9.b bVar) {
        this.f227337a = bVar;
        int i17 = ((r9.o) bVar).f393391b;
        this.f227338b = i17;
        this.f227339c = new d9.c0();
        this.f227340d = new d9.b0();
        this.f227341e = new t9.p(32);
        d9.d0 d0Var = new d9.d0(0L, i17);
        this.f227342f = d0Var;
        this.f227343g = d0Var;
        this.f227344h = d0Var;
    }

    @Override // q8.o
    public void a(t9.p pVar, int i17) {
        while (i17 > 0) {
            int j17 = j(i17);
            d9.d0 d0Var = this.f227344h;
            r9.a aVar = d0Var.f227328d;
            pVar.b(aVar.f393340a, ((int) (this.f227346j - d0Var.f227325a)) + aVar.f393341b, j17);
            i17 -= j17;
            long j18 = this.f227346j + j17;
            this.f227346j = j18;
            d9.d0 d0Var2 = this.f227344h;
            if (j18 == d0Var2.f227326b) {
                this.f227344h = d0Var2.f227329e;
            }
        }
    }

    @Override // q8.o
    public void b(long j17, int i17, int i18, int i19, q8.n nVar) {
        boolean z17;
        if (this.f227347k) {
            if ((i17 & 1) == 0) {
                return;
            }
            d9.c0 c0Var = this.f227339c;
            synchronized (c0Var) {
                if (c0Var.f227301i == 0) {
                    z17 = j17 > c0Var.f227305m;
                } else if (java.lang.Math.max(c0Var.f227305m, c0Var.d(c0Var.f227304l)) >= j17) {
                    z17 = false;
                } else {
                    int i27 = c0Var.f227301i;
                    int e17 = c0Var.e(i27 - 1);
                    while (i27 > c0Var.f227304l && c0Var.f227298f[e17] >= j17) {
                        i27--;
                        e17--;
                        if (e17 == -1) {
                            e17 = c0Var.f227293a - 1;
                        }
                    }
                    c0Var.b(c0Var.f227302j + i27);
                    z17 = true;
                }
            }
            if (!z17) {
                return;
            } else {
                this.f227347k = false;
            }
        }
        long j18 = j17 + 0;
        long j19 = (this.f227346j - i18) - i19;
        d9.c0 c0Var2 = this.f227339c;
        synchronized (c0Var2) {
            if (c0Var2.f227307o) {
                if ((i17 & 1) == 0) {
                    return;
                } else {
                    c0Var2.f227307o = false;
                }
            }
            t9.a.d(!c0Var2.f227308p);
            synchronized (c0Var2) {
                c0Var2.f227306n = java.lang.Math.max(c0Var2.f227306n, j18);
                int e18 = c0Var2.e(c0Var2.f227301i);
                c0Var2.f227298f[e18] = j18;
                long[] jArr = c0Var2.f227295c;
                jArr[e18] = j19;
                c0Var2.f227296d[e18] = i18;
                c0Var2.f227297e[e18] = i17;
                c0Var2.f227299g[e18] = nVar;
                c0Var2.f227300h[e18] = c0Var2.f227309q;
                c0Var2.f227294b[e18] = c0Var2.f227310r;
                int i28 = c0Var2.f227301i + 1;
                c0Var2.f227301i = i28;
                int i29 = c0Var2.f227293a;
                if (i28 == i29) {
                    int i37 = i29 + 1000;
                    int[] iArr = new int[i37];
                    long[] jArr2 = new long[i37];
                    long[] jArr3 = new long[i37];
                    int[] iArr2 = new int[i37];
                    int[] iArr3 = new int[i37];
                    q8.n[] nVarArr = new q8.n[i37];
                    com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[i37];
                    int i38 = c0Var2.f227303k;
                    int i39 = i29 - i38;
                    java.lang.System.arraycopy(jArr, i38, jArr2, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227298f, c0Var2.f227303k, jArr3, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227297e, c0Var2.f227303k, iArr2, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227296d, c0Var2.f227303k, iArr3, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227299g, c0Var2.f227303k, nVarArr, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227300h, c0Var2.f227303k, formatArr, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f227294b, c0Var2.f227303k, iArr, 0, i39);
                    int i47 = c0Var2.f227303k;
                    java.lang.System.arraycopy(c0Var2.f227295c, 0, jArr2, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227298f, 0, jArr3, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227297e, 0, iArr2, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227296d, 0, iArr3, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227299g, 0, nVarArr, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227300h, 0, formatArr, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f227294b, 0, iArr, i39, i47);
                    c0Var2.f227295c = jArr2;
                    c0Var2.f227298f = jArr3;
                    c0Var2.f227297e = iArr2;
                    c0Var2.f227296d = iArr3;
                    c0Var2.f227299g = nVarArr;
                    c0Var2.f227300h = formatArr;
                    c0Var2.f227294b = iArr;
                    c0Var2.f227303k = 0;
                    c0Var2.f227301i = c0Var2.f227293a;
                    c0Var2.f227293a = i37;
                }
            }
        }
    }

    @Override // q8.o
    public void c(com.google.android.exoplayer2.Format format) {
        boolean z17;
        if (format == null) {
            format = null;
        }
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            z17 = false;
            if (format == null) {
                c0Var.f227308p = true;
            } else {
                c0Var.f227308p = false;
                if (!t9.d0.a(format, c0Var.f227309q)) {
                    c0Var.f227309q = format;
                    z17 = true;
                }
            }
        }
        d9.e0 e0Var = this.f227348l;
        if (e0Var == null || !z17) {
            return;
        }
        e0Var.a(format);
    }

    @Override // q8.o
    public int d(q8.f fVar, int i17, boolean z17) {
        int j17 = j(i17);
        d9.d0 d0Var = this.f227344h;
        r9.a aVar = d0Var.f227328d;
        int c17 = ((q8.b) fVar).c(aVar.f393340a, ((int) (this.f227346j - d0Var.f227325a)) + aVar.f393341b, j17);
        if (c17 == -1) {
            if (z17) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        long j18 = this.f227346j + c17;
        this.f227346j = j18;
        d9.d0 d0Var2 = this.f227344h;
        if (j18 == d0Var2.f227326b) {
            this.f227344h = d0Var2.f227329e;
        }
        return c17;
    }

    public boolean e(long j17, boolean z17, boolean z18) {
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            int e17 = c0Var.e(c0Var.f227304l);
            if (c0Var.f() && j17 >= c0Var.f227298f[e17] && (j17 <= c0Var.f227306n || z18)) {
                int c17 = c0Var.c(e17, c0Var.f227301i - c0Var.f227304l, j17, z17);
                if (c17 == -1) {
                    return false;
                }
                c0Var.f227304l += c17;
                return true;
            }
            return false;
        }
    }

    public final void f(long j17) {
        d9.d0 d0Var;
        if (j17 == -1) {
            return;
        }
        while (true) {
            d0Var = this.f227342f;
            if (j17 < d0Var.f227326b) {
                break;
            }
            r9.b bVar = this.f227337a;
            r9.a aVar = d0Var.f227328d;
            r9.o oVar = (r9.o) bVar;
            synchronized (oVar) {
                r9.a[] aVarArr = oVar.f393392c;
                aVarArr[0] = aVar;
                oVar.a(aVarArr);
            }
            d9.d0 d0Var2 = this.f227342f;
            d0Var2.f227328d = null;
            d9.d0 d0Var3 = d0Var2.f227329e;
            d0Var2.f227329e = null;
            this.f227342f = d0Var3;
        }
        if (this.f227343g.f227325a < d0Var.f227325a) {
            this.f227343g = d0Var;
        }
    }

    public void g(long j17, boolean z17, boolean z18) {
        long j18;
        int i17;
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            int i18 = c0Var.f227301i;
            j18 = -1;
            if (i18 != 0) {
                long[] jArr = c0Var.f227298f;
                int i19 = c0Var.f227303k;
                if (j17 >= jArr[i19]) {
                    int c17 = c0Var.c(i19, (!z18 || (i17 = c0Var.f227304l) == i18) ? i18 : i17 + 1, j17, z17);
                    if (c17 != -1) {
                        j18 = c0Var.a(c17);
                    }
                }
            }
        }
        f(j18);
    }

    public void h() {
        long a17;
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            int i17 = c0Var.f227301i;
            if (i17 == 0) {
                a17 = -1;
            } else {
                a17 = c0Var.a(i17);
            }
        }
        f(a17);
    }

    public com.google.android.exoplayer2.Format i() {
        com.google.android.exoplayer2.Format format;
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            format = c0Var.f227308p ? null : c0Var.f227309q;
        }
        return format;
    }

    public final int j(int i17) {
        r9.a aVar;
        d9.d0 d0Var = this.f227344h;
        if (!d0Var.f227327c) {
            r9.o oVar = (r9.o) this.f227337a;
            synchronized (oVar) {
                oVar.f393394e++;
                int i18 = oVar.f393395f;
                if (i18 > 0) {
                    r9.a[] aVarArr = oVar.f393396g;
                    int i19 = i18 - 1;
                    oVar.f393395f = i19;
                    aVar = aVarArr[i19];
                    aVarArr[i19] = null;
                } else {
                    aVar = new r9.a(new byte[oVar.f393391b], 0);
                }
            }
            d9.d0 d0Var2 = new d9.d0(this.f227344h.f227326b, this.f227338b);
            d0Var.f227328d = aVar;
            d0Var.f227329e = d0Var2;
            d0Var.f227327c = true;
        }
        return java.lang.Math.min(i17, (int) (this.f227344h.f227326b - this.f227346j));
    }

    public int k(m8.s sVar, o8.g gVar, boolean z17, boolean z18, long j17) {
        int i17;
        int i18;
        char c17;
        d9.c0 c0Var = this.f227339c;
        com.google.android.exoplayer2.Format format = this.f227345i;
        d9.b0 b0Var = this.f227340d;
        synchronized (c0Var) {
            i17 = 1;
            if (c0Var.f()) {
                int e17 = c0Var.e(c0Var.f227304l);
                if (!z17 && c0Var.f227300h[e17] == format) {
                    if (gVar.f343610f == null && gVar.f343612h == 0) {
                        c17 = 65533;
                    } else {
                        gVar.f343611g = c0Var.f227298f[e17];
                        gVar.f343594d = c0Var.f227297e[e17];
                        b0Var.f227278a = c0Var.f227296d[e17];
                        b0Var.f227279b = c0Var.f227295c[e17];
                        b0Var.f227280c = c0Var.f227299g[e17];
                        c0Var.f227304l++;
                        c17 = 65532;
                    }
                }
                sVar.f324666a = c0Var.f227300h[e17];
                c17 = 65531;
            } else if (z18) {
                gVar.f343594d = 4;
                c17 = 65532;
            } else {
                com.google.android.exoplayer2.Format format2 = c0Var.f227309q;
                if (format2 == null || (!z17 && format2 == format)) {
                    c17 = 65533;
                } else {
                    sVar.f324666a = format2;
                    c17 = 65531;
                }
            }
        }
        if (c17 == 65531) {
            this.f227345i = sVar.f324666a;
            return -5;
        }
        if (c17 != 65532) {
            if (c17 == 65533) {
                return -3;
            }
            throw new java.lang.IllegalStateException();
        }
        if (gVar.b(4)) {
            return -4;
        }
        if (gVar.f343611g < j17) {
            gVar.f343594d |= Integer.MIN_VALUE;
        }
        if (gVar.b(1073741824)) {
            d9.b0 b0Var2 = this.f227340d;
            long j18 = b0Var2.f227279b;
            t9.p pVar = this.f227341e;
            pVar.t(1);
            l(j18, pVar.f416540a, 1);
            long j19 = j18 + 1;
            byte b17 = pVar.f416540a[0];
            boolean z19 = (b17 & 128) != 0;
            int i19 = b17 & Byte.MAX_VALUE;
            o8.d dVar = gVar.f343609e;
            if (dVar.f343597a == null) {
                dVar.f343597a = new byte[16];
            }
            l(j19, dVar.f343597a, i19);
            long j27 = j19 + i19;
            if (z19) {
                pVar.t(2);
                l(j27, pVar.f416540a, 2);
                j27 += 2;
                i17 = pVar.r();
            }
            o8.d dVar2 = gVar.f343609e;
            int[] iArr = dVar2.f343598b;
            if (iArr == null || iArr.length < i17) {
                iArr = new int[i17];
            }
            int[] iArr2 = dVar2.f343599c;
            if (iArr2 == null || iArr2.length < i17) {
                iArr2 = new int[i17];
            }
            if (z19) {
                int i27 = i17 * 6;
                pVar.t(i27);
                l(j27, pVar.f416540a, i27);
                j27 += i27;
                pVar.w(0);
                for (i18 = 0; i18 < i17; i18++) {
                    iArr[i18] = pVar.r();
                    iArr2[i18] = pVar.p();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var2.f227278a - ((int) (j27 - b0Var2.f227279b));
            }
            q8.n nVar = b0Var2.f227280c;
            byte[] bArr = nVar.f360643b;
            byte[] bArr2 = dVar2.f343597a;
            dVar2.f343598b = iArr;
            dVar2.f343599c = iArr2;
            dVar2.f343597a = bArr2;
            int i28 = nVar.f360642a;
            int i29 = nVar.f360644c;
            int i37 = nVar.f360645d;
            int i38 = t9.d0.f416498a;
            if (i38 >= 16) {
                android.media.MediaCodec.CryptoInfo cryptoInfo = dVar2.f343600d;
                cryptoInfo.numSubSamples = i17;
                cryptoInfo.numBytesOfClearData = iArr;
                cryptoInfo.numBytesOfEncryptedData = iArr2;
                cryptoInfo.key = bArr;
                cryptoInfo.iv = bArr2;
                cryptoInfo.mode = i28;
                if (i38 >= 24) {
                    o8.c cVar = dVar2.f343601e;
                    android.media.MediaCodec.CryptoInfo.Pattern pattern = cVar.f343596b;
                    pattern.set(i29, i37);
                    cVar.f343595a.setPattern(pattern);
                }
            }
            long j28 = b0Var2.f227279b;
            int i39 = (int) (j27 - j28);
            b0Var2.f227279b = j28 + i39;
            b0Var2.f227278a -= i39;
        }
        gVar.n(this.f227340d.f227278a);
        d9.b0 b0Var3 = this.f227340d;
        long j29 = b0Var3.f227279b;
        java.nio.ByteBuffer byteBuffer = gVar.f343610f;
        int i47 = b0Var3.f227278a;
        while (true) {
            d9.d0 d0Var = this.f227343g;
            if (j29 < d0Var.f227326b) {
                break;
            }
            this.f227343g = d0Var.f227329e;
        }
        while (i47 > 0) {
            int min = java.lang.Math.min(i47, (int) (this.f227343g.f227326b - j29));
            d9.d0 d0Var2 = this.f227343g;
            r9.a aVar = d0Var2.f227328d;
            byteBuffer.put(aVar.f393340a, ((int) (j29 - d0Var2.f227325a)) + aVar.f393341b, min);
            i47 -= min;
            j29 += min;
            d9.d0 d0Var3 = this.f227343g;
            if (j29 == d0Var3.f227326b) {
                this.f227343g = d0Var3.f227329e;
            }
        }
        return -4;
    }

    public final void l(long j17, byte[] bArr, int i17) {
        while (true) {
            d9.d0 d0Var = this.f227343g;
            if (j17 < d0Var.f227326b) {
                break;
            } else {
                this.f227343g = d0Var.f227329e;
            }
        }
        int i18 = i17;
        while (i18 > 0) {
            int min = java.lang.Math.min(i18, (int) (this.f227343g.f227326b - j17));
            d9.d0 d0Var2 = this.f227343g;
            r9.a aVar = d0Var2.f227328d;
            java.lang.System.arraycopy(aVar.f393340a, ((int) (j17 - d0Var2.f227325a)) + aVar.f393341b, bArr, i17 - i18, min);
            i18 -= min;
            j17 += min;
            d9.d0 d0Var3 = this.f227343g;
            if (j17 == d0Var3.f227326b) {
                this.f227343g = d0Var3.f227329e;
            }
        }
    }

    public void m(boolean z17) {
        d9.c0 c0Var = this.f227339c;
        int i17 = 0;
        c0Var.f227301i = 0;
        c0Var.f227302j = 0;
        c0Var.f227303k = 0;
        c0Var.f227304l = 0;
        c0Var.f227307o = true;
        c0Var.f227305m = Long.MIN_VALUE;
        c0Var.f227306n = Long.MIN_VALUE;
        if (z17) {
            c0Var.f227309q = null;
            c0Var.f227308p = true;
        }
        d9.d0 d0Var = this.f227342f;
        boolean z18 = d0Var.f227327c;
        r9.b bVar = this.f227337a;
        int i18 = this.f227338b;
        if (z18) {
            d9.d0 d0Var2 = this.f227344h;
            boolean z19 = d0Var2.f227327c;
            int i19 = (z19 ? 1 : 0) + (((int) (d0Var2.f227325a - d0Var.f227325a)) / i18);
            r9.a[] aVarArr = new r9.a[i19];
            while (i17 < i19) {
                aVarArr[i17] = d0Var.f227328d;
                d0Var.f227328d = null;
                d9.d0 d0Var3 = d0Var.f227329e;
                d0Var.f227329e = null;
                i17++;
                d0Var = d0Var3;
            }
            ((r9.o) bVar).a(aVarArr);
        }
        d9.d0 d0Var4 = new d9.d0(0L, i18);
        this.f227342f = d0Var4;
        this.f227343g = d0Var4;
        this.f227344h = d0Var4;
        this.f227346j = 0L;
        ((r9.o) bVar).b();
    }

    public void n() {
        d9.c0 c0Var = this.f227339c;
        synchronized (c0Var) {
            c0Var.f227304l = 0;
        }
        this.f227343g = this.f227342f;
    }
}
