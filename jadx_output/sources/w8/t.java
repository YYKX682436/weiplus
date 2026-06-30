package w8;

/* loaded from: classes15.dex */
public final class t implements w8.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w8.h f443763a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.o f443764b = new t9.o(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f443765c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f443766d;

    /* renamed from: e, reason: collision with root package name */
    public t9.a0 f443767e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443768f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443769g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f443770h;

    /* renamed from: i, reason: collision with root package name */
    public int f443771i;

    /* renamed from: j, reason: collision with root package name */
    public int f443772j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f443773k;

    /* renamed from: l, reason: collision with root package name */
    public long f443774l;

    public t(w8.h hVar) {
        this.f443763a = hVar;
    }

    @Override // w8.h0
    public final void a(t9.p pVar, boolean z17) {
        boolean z18;
        w8.h hVar = this.f443763a;
        if (z17) {
            if (this.f443765c == 3) {
                hVar.c();
            }
            this.f443765c = 1;
            this.f443766d = 0;
        }
        while (true) {
            int i17 = pVar.f416542c;
            int i18 = pVar.f416541b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i27 = this.f443765c;
            if (i27 != 0) {
                t9.o oVar = this.f443764b;
                if (i27 != 1) {
                    if (i27 == 2) {
                        if (d(pVar, oVar.f416536a, java.lang.Math.min(10, this.f443771i)) && d(pVar, null, this.f443771i)) {
                            oVar.e(0);
                            this.f443774l = -9223372036854775807L;
                            if (this.f443768f) {
                                oVar.f(4);
                                oVar.f(1);
                                oVar.f(1);
                                long d17 = (oVar.d(3) << 30) | (oVar.d(15) << 15) | oVar.d(15);
                                oVar.f(1);
                                if (!this.f443770h && this.f443769g) {
                                    oVar.f(4);
                                    oVar.f(1);
                                    oVar.f(1);
                                    oVar.f(1);
                                    this.f443767e.b(oVar.d(15) | (oVar.d(3) << 30) | (oVar.d(15) << 15));
                                    this.f443770h = true;
                                }
                                this.f443774l = this.f443767e.b(d17);
                            }
                            hVar.d(this.f443774l, this.f443773k);
                            this.f443765c = 3;
                            this.f443766d = 0;
                        }
                    } else if (i27 == 3) {
                        int i28 = this.f443772j;
                        int i29 = i28 == -1 ? 0 : i19 - i28;
                        if (i29 > 0) {
                            i19 -= i29;
                            pVar.v(i18 + i19);
                        }
                        hVar.a(pVar);
                        int i37 = this.f443772j;
                        if (i37 != -1) {
                            int i38 = i37 - i19;
                            this.f443772j = i38;
                            if (i38 == 0) {
                                hVar.c();
                                this.f443765c = 1;
                                this.f443766d = 0;
                            }
                        }
                    }
                } else if (d(pVar, oVar.f416536a, 9)) {
                    oVar.e(0);
                    if (oVar.d(24) != 1) {
                        this.f443772j = -1;
                        z18 = false;
                    } else {
                        oVar.f(8);
                        int d18 = oVar.d(16);
                        oVar.f(5);
                        this.f443773k = oVar.c();
                        oVar.f(2);
                        this.f443768f = oVar.c();
                        this.f443769g = oVar.c();
                        oVar.f(6);
                        int d19 = oVar.d(8);
                        this.f443771i = d19;
                        if (d18 == 0) {
                            this.f443772j = -1;
                        } else {
                            this.f443772j = ((d18 + 6) - 9) - d19;
                        }
                        z18 = true;
                    }
                    this.f443765c = z18 ? 2 : 0;
                    this.f443766d = 0;
                }
            } else {
                pVar.x(i19);
            }
        }
    }

    @Override // w8.h0
    public final void b() {
        this.f443765c = 0;
        this.f443766d = 0;
        this.f443770h = false;
        this.f443763a.b();
    }

    @Override // w8.h0
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
        this.f443767e = a0Var;
        this.f443763a.e(gVar, g0Var);
    }

    public final boolean d(t9.p pVar, byte[] bArr, int i17) {
        int min = java.lang.Math.min(pVar.f416542c - pVar.f416541b, i17 - this.f443766d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pVar.x(min);
        } else {
            pVar.b(bArr, this.f443766d, min);
        }
        int i18 = this.f443766d + min;
        this.f443766d = i18;
        return i18 == i17;
    }
}
