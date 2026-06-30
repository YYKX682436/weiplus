package w8;

/* loaded from: classes15.dex */
public final class b implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.o f443563a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f443564b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f443565c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f443566d;

    /* renamed from: e, reason: collision with root package name */
    public q8.o f443567e;

    /* renamed from: f, reason: collision with root package name */
    public int f443568f;

    /* renamed from: g, reason: collision with root package name */
    public int f443569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f443570h;

    /* renamed from: i, reason: collision with root package name */
    public long f443571i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f443572j;

    /* renamed from: k, reason: collision with root package name */
    public int f443573k;

    /* renamed from: l, reason: collision with root package name */
    public long f443574l;

    public b(java.lang.String str) {
        t9.o oVar = new t9.o(new byte[8], 8);
        this.f443563a = oVar;
        this.f443564b = new t9.p(oVar.f416536a);
        this.f443568f = 0;
        this.f443565c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // w8.h
    public void a(t9.p pVar) {
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        int i27;
        ?? r27;
        while (true) {
            int i28 = pVar.f416542c;
            int i29 = pVar.f416541b;
            if (i28 - i29 <= 0) {
                return;
            }
            int i37 = this.f443568f;
            t9.p pVar2 = this.f443564b;
            if (i37 == 0) {
                while (true) {
                    if (pVar.f416542c - pVar.f416541b <= 0) {
                        r27 = false;
                        break;
                    }
                    if (this.f443570h) {
                        int m17 = pVar.m();
                        if (m17 == 119) {
                            this.f443570h = false;
                            r27 = true;
                            break;
                        }
                        this.f443570h = m17 == 11;
                    } else {
                        this.f443570h = pVar.m() == 11;
                    }
                }
                if (r27 != false) {
                    this.f443568f = 1;
                    byte[] bArr = pVar2.f416540a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f443569g = 2;
                }
            } else if (i37 == 1) {
                byte[] bArr2 = pVar2.f416540a;
                int min = java.lang.Math.min(i28 - i29, 8 - this.f443569g);
                pVar.b(bArr2, this.f443569g, min);
                int i38 = this.f443569g + min;
                this.f443569g = i38;
                if ((i38 == 8) != false) {
                    t9.o oVar = this.f443563a;
                    oVar.e(0);
                    int i39 = (oVar.f416537b * 8) + oVar.f416538c;
                    oVar.f(40);
                    ?? r47 = oVar.d(5) == 16;
                    oVar.e(i39);
                    int[] iArr = n8.a.f335459b;
                    int i47 = 6;
                    if (r47 == true) {
                        oVar.f(21);
                        i19 = (oVar.d(11) + 1) * 2;
                        int d17 = oVar.d(2);
                        if (d17 == 3) {
                            i17 = n8.a.f335460c[oVar.d(2)];
                        } else {
                            i47 = n8.a.f335458a[oVar.d(2)];
                            i17 = iArr[d17];
                        }
                        i18 = i47 * 256;
                        i27 = oVar.d(3);
                        str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3;
                    } else {
                        oVar.f(32);
                        int d18 = oVar.d(2);
                        int a17 = n8.a.a(d18, oVar.d(6));
                        oVar.f(8);
                        int d19 = oVar.d(3);
                        if ((d19 & 1) != 0 && d19 != 1) {
                            oVar.f(2);
                        }
                        if ((d19 & 4) != 0) {
                            oVar.f(2);
                        }
                        if (d19 == 2) {
                            oVar.f(2);
                        }
                        i17 = iArr[d18];
                        str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3;
                        i18 = 1536;
                        i19 = a17;
                        i27 = d19;
                    }
                    int i48 = (oVar.c() ? 1 : 0) + n8.a.f335461d[i27];
                    com.google.android.exoplayer2.Format format = this.f443572j;
                    if (format == null || i48 != format.f44092x || i17 != format.f44093y || str != format.f44080i) {
                        com.google.android.exoplayer2.Format c17 = com.google.android.exoplayer2.Format.c(this.f443566d, str, null, -1, -1, i48, i17, null, null, 0, this.f443565c);
                        this.f443572j = c17;
                        this.f443567e.c(c17);
                    }
                    this.f443573k = i19;
                    this.f443571i = (i18 * 1000000) / this.f443572j.f44093y;
                    pVar2.w(0);
                    this.f443567e.a(pVar2, 8);
                    this.f443568f = 2;
                }
            } else if (i37 == 2) {
                int min2 = java.lang.Math.min(i28 - i29, this.f443573k - this.f443569g);
                this.f443567e.a(pVar, min2);
                int i49 = this.f443569g + min2;
                this.f443569g = i49;
                int i57 = this.f443573k;
                if (i49 == i57) {
                    this.f443567e.b(this.f443574l, 1, i57, 0, null);
                    this.f443574l += this.f443571i;
                    this.f443568f = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f443568f = 0;
        this.f443569g = 0;
        this.f443570h = false;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f443574l = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f443566d = g0Var.f443645e;
        g0Var.b();
        this.f443567e = gVar.l(g0Var.f443644d, 1);
    }
}
