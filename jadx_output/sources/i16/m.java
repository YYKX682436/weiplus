package i16;

/* loaded from: classes16.dex */
public final class m extends p16.q {
    public int B;

    /* renamed from: g, reason: collision with root package name */
    public int f287599g;

    /* renamed from: i, reason: collision with root package name */
    public int f287601i;

    /* renamed from: m, reason: collision with root package name */
    public int f287602m;

    /* renamed from: z, reason: collision with root package name */
    public int f287615z;

    /* renamed from: h, reason: collision with root package name */
    public int f287600h = 6;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f287603n = java.util.Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287604o = java.util.Collections.emptyList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f287605p = java.util.Collections.emptyList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f287606q = java.util.Collections.emptyList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f287607r = java.util.Collections.emptyList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287608s = java.util.Collections.emptyList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f287609t = java.util.Collections.emptyList();

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f287610u = java.util.Collections.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f287611v = java.util.Collections.emptyList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f287612w = java.util.Collections.emptyList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f287613x = java.util.Collections.emptyList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f287614y = java.util.Collections.emptyList();
    public i16.l1 A = i16.l1.f287580z;
    public java.util.List C = java.util.Collections.emptyList();
    public java.util.List D = java.util.Collections.emptyList();
    public java.util.List E = java.util.Collections.emptyList();
    public i16.v1 F = i16.v1.f287783m;
    public java.util.List G = java.util.Collections.emptyList();
    public i16.g2 H = i16.g2.f287464h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.o.R     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.l r0 = (i16.l) r0     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r0.getClass()     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.o r0 = new i16.o     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            r1.e(r0)
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> L10
            i16.o r3 = (i16.o) r3     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.e(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.m.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.o d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.m mVar = new i16.m();
        mVar.e(d());
        return mVar;
    }

    public i16.o d() {
        i16.o oVar = new i16.o(this, (i16.a) null);
        int i17 = this.f287599g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        oVar.f287642g = this.f287600h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        oVar.f287643h = this.f287601i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        oVar.f287644i = this.f287602m;
        if ((i17 & 8) == 8) {
            this.f287603n = java.util.Collections.unmodifiableList(this.f287603n);
            this.f287599g &= -9;
        }
        oVar.f287645m = this.f287603n;
        if ((this.f287599g & 16) == 16) {
            this.f287604o = java.util.Collections.unmodifiableList(this.f287604o);
            this.f287599g &= -17;
        }
        oVar.f287646n = this.f287604o;
        if ((this.f287599g & 32) == 32) {
            this.f287605p = java.util.Collections.unmodifiableList(this.f287605p);
            this.f287599g &= -33;
        }
        oVar.f287647o = this.f287605p;
        if ((this.f287599g & 64) == 64) {
            this.f287606q = java.util.Collections.unmodifiableList(this.f287606q);
            this.f287599g &= -65;
        }
        oVar.f287649q = this.f287606q;
        if ((this.f287599g & 128) == 128) {
            this.f287607r = java.util.Collections.unmodifiableList(this.f287607r);
            this.f287599g &= -129;
        }
        oVar.f287651s = this.f287607r;
        if ((this.f287599g & 256) == 256) {
            this.f287608s = java.util.Collections.unmodifiableList(this.f287608s);
            this.f287599g &= -257;
        }
        oVar.f287652t = this.f287608s;
        if ((this.f287599g & 512) == 512) {
            this.f287609t = java.util.Collections.unmodifiableList(this.f287609t);
            this.f287599g &= -513;
        }
        oVar.f287654v = this.f287609t;
        if ((this.f287599g & 1024) == 1024) {
            this.f287610u = java.util.Collections.unmodifiableList(this.f287610u);
            this.f287599g &= -1025;
        }
        oVar.f287655w = this.f287610u;
        if ((this.f287599g & 2048) == 2048) {
            this.f287611v = java.util.Collections.unmodifiableList(this.f287611v);
            this.f287599g &= -2049;
        }
        oVar.f287656x = this.f287611v;
        if ((this.f287599g & 4096) == 4096) {
            this.f287612w = java.util.Collections.unmodifiableList(this.f287612w);
            this.f287599g &= -4097;
        }
        oVar.f287657y = this.f287612w;
        if ((this.f287599g & 8192) == 8192) {
            this.f287613x = java.util.Collections.unmodifiableList(this.f287613x);
            this.f287599g &= -8193;
        }
        oVar.f287658z = this.f287613x;
        if ((this.f287599g & 16384) == 16384) {
            this.f287614y = java.util.Collections.unmodifiableList(this.f287614y);
            this.f287599g &= -16385;
        }
        oVar.A = this.f287614y;
        if ((i17 & 32768) == 32768) {
            i18 |= 8;
        }
        oVar.C = this.f287615z;
        if ((i17 & 65536) == 65536) {
            i18 |= 16;
        }
        oVar.D = this.A;
        if ((i17 & 131072) == 131072) {
            i18 |= 32;
        }
        oVar.E = this.B;
        if ((this.f287599g & 262144) == 262144) {
            this.C = java.util.Collections.unmodifiableList(this.C);
            this.f287599g &= -262145;
        }
        oVar.F = this.C;
        if ((this.f287599g & 524288) == 524288) {
            this.D = java.util.Collections.unmodifiableList(this.D);
            this.f287599g &= -524289;
        }
        oVar.H = this.D;
        if ((this.f287599g & 1048576) == 1048576) {
            this.E = java.util.Collections.unmodifiableList(this.E);
            this.f287599g &= -1048577;
        }
        oVar.I = this.E;
        if ((i17 & 2097152) == 2097152) {
            i18 |= 64;
        }
        oVar.K = this.F;
        if ((this.f287599g & 4194304) == 4194304) {
            this.G = java.util.Collections.unmodifiableList(this.G);
            this.f287599g &= -4194305;
        }
        oVar.L = this.G;
        if ((i17 & 8388608) == 8388608) {
            i18 |= 128;
        }
        oVar.M = this.H;
        oVar.f287641f = i18;
        return oVar;
    }

    public i16.m e(i16.o oVar) {
        i16.g2 g2Var;
        i16.v1 v1Var;
        i16.l1 l1Var;
        if (oVar == i16.o.Q) {
            return this;
        }
        int i17 = oVar.f287641f;
        if ((i17 & 1) == 1) {
            int i18 = oVar.f287642g;
            this.f287599g |= 1;
            this.f287600h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = oVar.f287643h;
            this.f287599g = 2 | this.f287599g;
            this.f287601i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = oVar.f287644i;
            this.f287599g = 4 | this.f287599g;
            this.f287602m = i27;
        }
        if (!oVar.f287645m.isEmpty()) {
            if (this.f287603n.isEmpty()) {
                this.f287603n = oVar.f287645m;
                this.f287599g &= -9;
            } else {
                if ((this.f287599g & 8) != 8) {
                    this.f287603n = new java.util.ArrayList(this.f287603n);
                    this.f287599g |= 8;
                }
                this.f287603n.addAll(oVar.f287645m);
            }
        }
        if (!oVar.f287646n.isEmpty()) {
            if (this.f287604o.isEmpty()) {
                this.f287604o = oVar.f287646n;
                this.f287599g &= -17;
            } else {
                if ((this.f287599g & 16) != 16) {
                    this.f287604o = new java.util.ArrayList(this.f287604o);
                    this.f287599g |= 16;
                }
                this.f287604o.addAll(oVar.f287646n);
            }
        }
        if (!oVar.f287647o.isEmpty()) {
            if (this.f287605p.isEmpty()) {
                this.f287605p = oVar.f287647o;
                this.f287599g &= -33;
            } else {
                if ((this.f287599g & 32) != 32) {
                    this.f287605p = new java.util.ArrayList(this.f287605p);
                    this.f287599g |= 32;
                }
                this.f287605p.addAll(oVar.f287647o);
            }
        }
        if (!oVar.f287649q.isEmpty()) {
            if (this.f287606q.isEmpty()) {
                this.f287606q = oVar.f287649q;
                this.f287599g &= -65;
            } else {
                if ((this.f287599g & 64) != 64) {
                    this.f287606q = new java.util.ArrayList(this.f287606q);
                    this.f287599g |= 64;
                }
                this.f287606q.addAll(oVar.f287649q);
            }
        }
        if (!oVar.f287651s.isEmpty()) {
            if (this.f287607r.isEmpty()) {
                this.f287607r = oVar.f287651s;
                this.f287599g &= -129;
            } else {
                if ((this.f287599g & 128) != 128) {
                    this.f287607r = new java.util.ArrayList(this.f287607r);
                    this.f287599g |= 128;
                }
                this.f287607r.addAll(oVar.f287651s);
            }
        }
        if (!oVar.f287652t.isEmpty()) {
            if (this.f287608s.isEmpty()) {
                this.f287608s = oVar.f287652t;
                this.f287599g &= -257;
            } else {
                if ((this.f287599g & 256) != 256) {
                    this.f287608s = new java.util.ArrayList(this.f287608s);
                    this.f287599g |= 256;
                }
                this.f287608s.addAll(oVar.f287652t);
            }
        }
        if (!oVar.f287654v.isEmpty()) {
            if (this.f287609t.isEmpty()) {
                this.f287609t = oVar.f287654v;
                this.f287599g &= -513;
            } else {
                if ((this.f287599g & 512) != 512) {
                    this.f287609t = new java.util.ArrayList(this.f287609t);
                    this.f287599g |= 512;
                }
                this.f287609t.addAll(oVar.f287654v);
            }
        }
        if (!oVar.f287655w.isEmpty()) {
            if (this.f287610u.isEmpty()) {
                this.f287610u = oVar.f287655w;
                this.f287599g &= -1025;
            } else {
                if ((this.f287599g & 1024) != 1024) {
                    this.f287610u = new java.util.ArrayList(this.f287610u);
                    this.f287599g |= 1024;
                }
                this.f287610u.addAll(oVar.f287655w);
            }
        }
        if (!oVar.f287656x.isEmpty()) {
            if (this.f287611v.isEmpty()) {
                this.f287611v = oVar.f287656x;
                this.f287599g &= -2049;
            } else {
                if ((this.f287599g & 2048) != 2048) {
                    this.f287611v = new java.util.ArrayList(this.f287611v);
                    this.f287599g |= 2048;
                }
                this.f287611v.addAll(oVar.f287656x);
            }
        }
        if (!oVar.f287657y.isEmpty()) {
            if (this.f287612w.isEmpty()) {
                this.f287612w = oVar.f287657y;
                this.f287599g &= -4097;
            } else {
                if ((this.f287599g & 4096) != 4096) {
                    this.f287612w = new java.util.ArrayList(this.f287612w);
                    this.f287599g |= 4096;
                }
                this.f287612w.addAll(oVar.f287657y);
            }
        }
        if (!oVar.f287658z.isEmpty()) {
            if (this.f287613x.isEmpty()) {
                this.f287613x = oVar.f287658z;
                this.f287599g &= -8193;
            } else {
                if ((this.f287599g & 8192) != 8192) {
                    this.f287613x = new java.util.ArrayList(this.f287613x);
                    this.f287599g |= 8192;
                }
                this.f287613x.addAll(oVar.f287658z);
            }
        }
        if (!oVar.A.isEmpty()) {
            if (this.f287614y.isEmpty()) {
                this.f287614y = oVar.A;
                this.f287599g &= -16385;
            } else {
                if ((this.f287599g & 16384) != 16384) {
                    this.f287614y = new java.util.ArrayList(this.f287614y);
                    this.f287599g |= 16384;
                }
                this.f287614y.addAll(oVar.A);
            }
        }
        int i28 = oVar.f287641f;
        if ((i28 & 8) == 8) {
            int i29 = oVar.C;
            this.f287599g |= 32768;
            this.f287615z = i29;
        }
        if ((i28 & 16) == 16) {
            i16.l1 l1Var2 = oVar.D;
            if ((this.f287599g & 65536) != 65536 || (l1Var = this.A) == i16.l1.f287580z) {
                this.A = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.A = m17.d();
            }
            this.f287599g |= 65536;
        }
        if ((oVar.f287641f & 32) == 32) {
            int i37 = oVar.E;
            this.f287599g |= 131072;
            this.B = i37;
        }
        if (!oVar.F.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = oVar.F;
                this.f287599g &= -262145;
            } else {
                if ((this.f287599g & 262144) != 262144) {
                    this.C = new java.util.ArrayList(this.C);
                    this.f287599g |= 262144;
                }
                this.C.addAll(oVar.F);
            }
        }
        if (!oVar.H.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = oVar.H;
                this.f287599g &= -524289;
            } else {
                if ((this.f287599g & 524288) != 524288) {
                    this.D = new java.util.ArrayList(this.D);
                    this.f287599g |= 524288;
                }
                this.D.addAll(oVar.H);
            }
        }
        if (!oVar.I.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = oVar.I;
                this.f287599g &= -1048577;
            } else {
                if ((this.f287599g & 1048576) != 1048576) {
                    this.E = new java.util.ArrayList(this.E);
                    this.f287599g |= 1048576;
                }
                this.E.addAll(oVar.I);
            }
        }
        if ((oVar.f287641f & 64) == 64) {
            i16.v1 v1Var2 = oVar.K;
            if ((this.f287599g & 2097152) != 2097152 || (v1Var = this.F) == i16.v1.f287783m) {
                this.F = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.F = d17.c();
            }
            this.f287599g |= 2097152;
        }
        if (!oVar.L.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = oVar.L;
                this.f287599g &= -4194305;
            } else {
                if ((this.f287599g & 4194304) != 4194304) {
                    this.G = new java.util.ArrayList(this.G);
                    this.f287599g |= 4194304;
                }
                this.G.addAll(oVar.L);
            }
        }
        if ((oVar.f287641f & 128) == 128) {
            i16.g2 g2Var2 = oVar.M;
            if ((this.f287599g & 8388608) != 8388608 || (g2Var = this.H) == i16.g2.f287464h) {
                this.H = g2Var2;
            } else {
                i16.f2 f2Var = new i16.f2();
                f2Var.d(g2Var);
                f2Var.d(g2Var2);
                this.H = f2Var.c();
            }
            this.f287599g |= 8388608;
        }
        c(oVar);
        this.f351337d = this.f351337d.e(oVar.f287640e);
        return this;
    }
}
