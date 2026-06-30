package i16;

/* loaded from: classes16.dex */
public final class n1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287629g;

    /* renamed from: i, reason: collision with root package name */
    public int f287631i;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f287633n;

    /* renamed from: o, reason: collision with root package name */
    public int f287634o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f287635p;

    /* renamed from: q, reason: collision with root package name */
    public int f287636q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f287637r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287638s;

    /* renamed from: h, reason: collision with root package name */
    public int f287630h = 6;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f287632m = java.util.Collections.emptyList();

    public n1() {
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287633n = l1Var;
        this.f287635p = l1Var;
        this.f287637r = java.util.Collections.emptyList();
        this.f287638s = java.util.Collections.emptyList();
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
            p16.j0 r0 = i16.o1.f287671v     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.m1 r0 = (i16.m1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.o1 r2 = (i16.o1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.o1 r3 = (i16.o1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.n1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o1) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.o1 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.n1 n1Var = new i16.n1();
        n1Var.e(d());
        return n1Var;
    }

    public i16.o1 d() {
        i16.o1 o1Var = new i16.o1(this, null);
        int i17 = this.f287629g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        o1Var.f287674g = this.f287630h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        o1Var.f287675h = this.f287631i;
        if ((i17 & 4) == 4) {
            this.f287632m = java.util.Collections.unmodifiableList(this.f287632m);
            this.f287629g &= -5;
        }
        o1Var.f287676i = this.f287632m;
        if ((i17 & 8) == 8) {
            i18 |= 4;
        }
        o1Var.f287677m = this.f287633n;
        if ((i17 & 16) == 16) {
            i18 |= 8;
        }
        o1Var.f287678n = this.f287634o;
        if ((i17 & 32) == 32) {
            i18 |= 16;
        }
        o1Var.f287679o = this.f287635p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        o1Var.f287680p = this.f287636q;
        if ((this.f287629g & 128) == 128) {
            this.f287637r = java.util.Collections.unmodifiableList(this.f287637r);
            this.f287629g &= -129;
        }
        o1Var.f287681q = this.f287637r;
        if ((this.f287629g & 256) == 256) {
            this.f287638s = java.util.Collections.unmodifiableList(this.f287638s);
            this.f287629g &= -257;
        }
        o1Var.f287682r = this.f287638s;
        o1Var.f287673f = i18;
        return o1Var;
    }

    public i16.n1 e(i16.o1 o1Var) {
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (o1Var == i16.o1.f287670u) {
            return this;
        }
        int i17 = o1Var.f287673f;
        if ((i17 & 1) == 1) {
            int i18 = o1Var.f287674g;
            this.f287629g |= 1;
            this.f287630h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = o1Var.f287675h;
            this.f287629g = 2 | this.f287629g;
            this.f287631i = i19;
        }
        if (!o1Var.f287676i.isEmpty()) {
            if (this.f287632m.isEmpty()) {
                this.f287632m = o1Var.f287676i;
                this.f287629g &= -5;
            } else {
                if ((this.f287629g & 4) != 4) {
                    this.f287632m = new java.util.ArrayList(this.f287632m);
                    this.f287629g |= 4;
                }
                this.f287632m.addAll(o1Var.f287676i);
            }
        }
        if ((o1Var.f287673f & 4) == 4) {
            i16.l1 l1Var3 = o1Var.f287677m;
            if ((this.f287629g & 8) != 8 || (l1Var2 = this.f287633n) == i16.l1.f287580z) {
                this.f287633n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f287633n = m17.d();
            }
            this.f287629g |= 8;
        }
        int i27 = o1Var.f287673f;
        if ((i27 & 8) == 8) {
            int i28 = o1Var.f287678n;
            this.f287629g |= 16;
            this.f287634o = i28;
        }
        if ((i27 & 16) == 16) {
            i16.l1 l1Var4 = o1Var.f287679o;
            if ((this.f287629g & 32) != 32 || (l1Var = this.f287635p) == i16.l1.f287580z) {
                this.f287635p = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f287635p = m18.d();
            }
            this.f287629g |= 32;
        }
        if ((o1Var.f287673f & 32) == 32) {
            int i29 = o1Var.f287680p;
            this.f287629g |= 64;
            this.f287636q = i29;
        }
        if (!o1Var.f287681q.isEmpty()) {
            if (this.f287637r.isEmpty()) {
                this.f287637r = o1Var.f287681q;
                this.f287629g &= -129;
            } else {
                if ((this.f287629g & 128) != 128) {
                    this.f287637r = new java.util.ArrayList(this.f287637r);
                    this.f287629g |= 128;
                }
                this.f287637r.addAll(o1Var.f287681q);
            }
        }
        if (!o1Var.f287682r.isEmpty()) {
            if (this.f287638s.isEmpty()) {
                this.f287638s = o1Var.f287682r;
                this.f287629g &= -257;
            } else {
                if ((this.f287629g & 256) != 256) {
                    this.f287638s = new java.util.ArrayList(this.f287638s);
                    this.f287629g |= 256;
                }
                this.f287638s.addAll(o1Var.f287682r);
            }
        }
        c(o1Var);
        this.f351337d = this.f351337d.e(o1Var.f287672e);
        return this;
    }
}
