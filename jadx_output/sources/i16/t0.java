package i16;

/* loaded from: classes16.dex */
public final class t0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287740g;

    /* renamed from: h, reason: collision with root package name */
    public int f287741h = md1.d1.CTRL_INDEX;

    /* renamed from: i, reason: collision with root package name */
    public int f287742i = 2054;

    /* renamed from: m, reason: collision with root package name */
    public int f287743m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f287744n;

    /* renamed from: o, reason: collision with root package name */
    public int f287745o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f287746p;

    /* renamed from: q, reason: collision with root package name */
    public i16.l1 f287747q;

    /* renamed from: r, reason: collision with root package name */
    public int f287748r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287749s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f287750t;

    /* renamed from: u, reason: collision with root package name */
    public i16.y1 f287751u;

    /* renamed from: v, reason: collision with root package name */
    public int f287752v;

    /* renamed from: w, reason: collision with root package name */
    public int f287753w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f287754x;

    public t0() {
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287744n = l1Var;
        this.f287746p = java.util.Collections.emptyList();
        this.f287747q = l1Var;
        this.f287749s = java.util.Collections.emptyList();
        this.f287750t = java.util.Collections.emptyList();
        this.f287751u = i16.y1.f287819r;
        this.f287754x = java.util.Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.u0.B     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.s0 r0 = (i16.s0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.u0 r2 = (i16.u0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.u0 r3 = (i16.u0) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.e(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.t0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.u0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.u0 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.t0 t0Var = new i16.t0();
        t0Var.e(d());
        return t0Var;
    }

    public i16.u0 d() {
        i16.u0 u0Var = new i16.u0(this, null);
        int i17 = this.f287740g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        u0Var.f287763g = this.f287741h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        u0Var.f287764h = this.f287742i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        u0Var.f287765i = this.f287743m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        u0Var.f287766m = this.f287744n;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        u0Var.f287767n = this.f287745o;
        if ((i17 & 32) == 32) {
            this.f287746p = java.util.Collections.unmodifiableList(this.f287746p);
            this.f287740g &= -33;
        }
        u0Var.f287768o = this.f287746p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        u0Var.f287769p = this.f287747q;
        if ((i17 & 128) == 128) {
            i18 |= 64;
        }
        u0Var.f287770q = this.f287748r;
        if ((this.f287740g & 256) == 256) {
            this.f287749s = java.util.Collections.unmodifiableList(this.f287749s);
            this.f287740g &= -257;
        }
        u0Var.f287771r = this.f287749s;
        if ((this.f287740g & 512) == 512) {
            this.f287750t = java.util.Collections.unmodifiableList(this.f287750t);
            this.f287740g &= -513;
        }
        u0Var.f287772s = this.f287750t;
        if ((i17 & 1024) == 1024) {
            i18 |= 128;
        }
        u0Var.f287774u = this.f287751u;
        if ((i17 & 2048) == 2048) {
            i18 |= 256;
        }
        u0Var.f287775v = this.f287752v;
        if ((i17 & 4096) == 4096) {
            i18 |= 512;
        }
        u0Var.f287776w = this.f287753w;
        if ((this.f287740g & 8192) == 8192) {
            this.f287754x = java.util.Collections.unmodifiableList(this.f287754x);
            this.f287740g &= -8193;
        }
        u0Var.f287777x = this.f287754x;
        u0Var.f287762f = i18;
        return u0Var;
    }

    public i16.t0 e(i16.u0 u0Var) {
        i16.y1 y1Var;
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (u0Var == i16.u0.A) {
            return this;
        }
        int i17 = u0Var.f287762f;
        if ((i17 & 1) == 1) {
            int i18 = u0Var.f287763g;
            this.f287740g |= 1;
            this.f287741h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = u0Var.f287764h;
            this.f287740g = 2 | this.f287740g;
            this.f287742i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = u0Var.f287765i;
            this.f287740g = 4 | this.f287740g;
            this.f287743m = i27;
        }
        if ((i17 & 8) == 8) {
            i16.l1 l1Var3 = u0Var.f287766m;
            if ((this.f287740g & 8) != 8 || (l1Var2 = this.f287744n) == i16.l1.f287580z) {
                this.f287744n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f287744n = m17.d();
            }
            this.f287740g |= 8;
        }
        if ((u0Var.f287762f & 16) == 16) {
            int i28 = u0Var.f287767n;
            this.f287740g = 16 | this.f287740g;
            this.f287745o = i28;
        }
        if (!u0Var.f287768o.isEmpty()) {
            if (this.f287746p.isEmpty()) {
                this.f287746p = u0Var.f287768o;
                this.f287740g &= -33;
            } else {
                if ((this.f287740g & 32) != 32) {
                    this.f287746p = new java.util.ArrayList(this.f287746p);
                    this.f287740g |= 32;
                }
                this.f287746p.addAll(u0Var.f287768o);
            }
        }
        if ((u0Var.f287762f & 32) == 32) {
            i16.l1 l1Var4 = u0Var.f287769p;
            if ((this.f287740g & 64) != 64 || (l1Var = this.f287747q) == i16.l1.f287580z) {
                this.f287747q = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f287747q = m18.d();
            }
            this.f287740g |= 64;
        }
        if ((u0Var.f287762f & 64) == 64) {
            int i29 = u0Var.f287770q;
            this.f287740g |= 128;
            this.f287748r = i29;
        }
        if (!u0Var.f287771r.isEmpty()) {
            if (this.f287749s.isEmpty()) {
                this.f287749s = u0Var.f287771r;
                this.f287740g &= -257;
            } else {
                if ((this.f287740g & 256) != 256) {
                    this.f287749s = new java.util.ArrayList(this.f287749s);
                    this.f287740g |= 256;
                }
                this.f287749s.addAll(u0Var.f287771r);
            }
        }
        if (!u0Var.f287772s.isEmpty()) {
            if (this.f287750t.isEmpty()) {
                this.f287750t = u0Var.f287772s;
                this.f287740g &= -513;
            } else {
                if ((this.f287740g & 512) != 512) {
                    this.f287750t = new java.util.ArrayList(this.f287750t);
                    this.f287740g |= 512;
                }
                this.f287750t.addAll(u0Var.f287772s);
            }
        }
        if ((u0Var.f287762f & 128) == 128) {
            i16.y1 y1Var2 = u0Var.f287774u;
            if ((this.f287740g & 1024) != 1024 || (y1Var = this.f287751u) == i16.y1.f287819r) {
                this.f287751u = y1Var2;
            } else {
                i16.x1 x1Var = new i16.x1();
                x1Var.e(y1Var);
                x1Var.e(y1Var2);
                this.f287751u = x1Var.d();
            }
            this.f287740g |= 1024;
        }
        int i37 = u0Var.f287762f;
        if ((i37 & 256) == 256) {
            int i38 = u0Var.f287775v;
            this.f287740g |= 2048;
            this.f287752v = i38;
        }
        if ((i37 & 512) == 512) {
            int i39 = u0Var.f287776w;
            this.f287740g |= 4096;
            this.f287753w = i39;
        }
        if (!u0Var.f287777x.isEmpty()) {
            if (this.f287754x.isEmpty()) {
                this.f287754x = u0Var.f287777x;
                this.f287740g &= -8193;
            } else {
                if ((this.f287740g & 8192) != 8192) {
                    this.f287754x = new java.util.ArrayList(this.f287754x);
                    this.f287740g |= 8192;
                }
                this.f287754x.addAll(u0Var.f287777x);
            }
        }
        c(u0Var);
        this.f351337d = this.f351337d.e(u0Var.f287761e);
        return this;
    }
}
