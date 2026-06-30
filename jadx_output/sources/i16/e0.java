package i16;

/* loaded from: classes16.dex */
public final class e0 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287403e;

    /* renamed from: f, reason: collision with root package name */
    public int f287404f;

    /* renamed from: g, reason: collision with root package name */
    public int f287405g;

    /* renamed from: m, reason: collision with root package name */
    public int f287408m;

    /* renamed from: h, reason: collision with root package name */
    public i16.f0 f287406h = i16.f0.TRUE;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f287407i = i16.l1.f287580z;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f287409n = java.util.Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287410o = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.g0.f287452s     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.d0 r0 = (i16.d0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.g0 r2 = (i16.g0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.g0 r3 = (i16.g0) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.d(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.e0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.g0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.g0 c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.g0 c() {
        i16.g0 g0Var = new i16.g0(this, null);
        int i17 = this.f287403e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        g0Var.f287455f = this.f287404f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        g0Var.f287456g = this.f287405g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        g0Var.f287457h = this.f287406h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        g0Var.f287458i = this.f287407i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        g0Var.f287459m = this.f287408m;
        if ((i17 & 32) == 32) {
            this.f287409n = java.util.Collections.unmodifiableList(this.f287409n);
            this.f287403e &= -33;
        }
        g0Var.f287460n = this.f287409n;
        if ((this.f287403e & 64) == 64) {
            this.f287410o = java.util.Collections.unmodifiableList(this.f287410o);
            this.f287403e &= -65;
        }
        g0Var.f287461o = this.f287410o;
        g0Var.f287454e = i18;
        return g0Var;
    }

    public java.lang.Object clone() {
        i16.e0 e0Var = new i16.e0();
        e0Var.d(c());
        return e0Var;
    }

    public i16.e0 d(i16.g0 g0Var) {
        i16.l1 l1Var;
        if (g0Var == i16.g0.f287451r) {
            return this;
        }
        int i17 = g0Var.f287454e;
        if ((i17 & 1) == 1) {
            int i18 = g0Var.f287455f;
            this.f287403e |= 1;
            this.f287404f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = g0Var.f287456g;
            this.f287403e = 2 | this.f287403e;
            this.f287405g = i19;
        }
        if ((i17 & 4) == 4) {
            i16.f0 f0Var = g0Var.f287457h;
            f0Var.getClass();
            this.f287403e = 4 | this.f287403e;
            this.f287406h = f0Var;
        }
        if ((g0Var.f287454e & 8) == 8) {
            i16.l1 l1Var2 = g0Var.f287458i;
            if ((this.f287403e & 8) != 8 || (l1Var = this.f287407i) == i16.l1.f287580z) {
                this.f287407i = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.f287407i = m17.d();
            }
            this.f287403e |= 8;
        }
        if ((g0Var.f287454e & 16) == 16) {
            int i27 = g0Var.f287459m;
            this.f287403e = 16 | this.f287403e;
            this.f287408m = i27;
        }
        if (!g0Var.f287460n.isEmpty()) {
            if (this.f287409n.isEmpty()) {
                this.f287409n = g0Var.f287460n;
                this.f287403e &= -33;
            } else {
                if ((this.f287403e & 32) != 32) {
                    this.f287409n = new java.util.ArrayList(this.f287409n);
                    this.f287403e |= 32;
                }
                this.f287409n.addAll(g0Var.f287460n);
            }
        }
        if (!g0Var.f287461o.isEmpty()) {
            if (this.f287410o.isEmpty()) {
                this.f287410o = g0Var.f287461o;
                this.f287403e &= -65;
            } else {
                if ((this.f287403e & 64) != 64) {
                    this.f287410o = new java.util.ArrayList(this.f287410o);
                    this.f287403e |= 64;
                }
                this.f287410o.addAll(g0Var.f287461o);
            }
        }
        this.f351337d = this.f351337d.e(g0Var.f287453d);
        return this;
    }
}
