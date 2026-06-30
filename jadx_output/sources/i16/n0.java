package i16;

/* loaded from: classes16.dex */
public final class n0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287623g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f287624h = java.util.Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f287625i = java.util.Collections.emptyList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f287626m = java.util.Collections.emptyList();

    /* renamed from: n, reason: collision with root package name */
    public i16.v1 f287627n = i16.v1.f287783m;

    /* renamed from: o, reason: collision with root package name */
    public i16.g2 f287628o = i16.g2.f287464h;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.o0.f287660r     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.m0 r0 = (i16.m0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.o0 r2 = (i16.o0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.o0 r3 = (i16.o0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.n0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.o0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.o0 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.n0 n0Var = new i16.n0();
        n0Var.e(d());
        return n0Var;
    }

    public i16.o0 d() {
        i16.o0 o0Var = new i16.o0(this, null);
        int i17 = this.f287623g;
        if ((i17 & 1) == 1) {
            this.f287624h = java.util.Collections.unmodifiableList(this.f287624h);
            this.f287623g &= -2;
        }
        o0Var.f287663g = this.f287624h;
        if ((this.f287623g & 2) == 2) {
            this.f287625i = java.util.Collections.unmodifiableList(this.f287625i);
            this.f287623g &= -3;
        }
        o0Var.f287664h = this.f287625i;
        if ((this.f287623g & 4) == 4) {
            this.f287626m = java.util.Collections.unmodifiableList(this.f287626m);
            this.f287623g &= -5;
        }
        o0Var.f287665i = this.f287626m;
        int i18 = (i17 & 8) != 8 ? 0 : 1;
        o0Var.f287666m = this.f287627n;
        if ((i17 & 16) == 16) {
            i18 |= 2;
        }
        o0Var.f287667n = this.f287628o;
        o0Var.f287662f = i18;
        return o0Var;
    }

    public i16.n0 e(i16.o0 o0Var) {
        i16.g2 g2Var;
        i16.v1 v1Var;
        if (o0Var == i16.o0.f287659q) {
            return this;
        }
        if (!o0Var.f287663g.isEmpty()) {
            if (this.f287624h.isEmpty()) {
                this.f287624h = o0Var.f287663g;
                this.f287623g &= -2;
            } else {
                if ((this.f287623g & 1) != 1) {
                    this.f287624h = new java.util.ArrayList(this.f287624h);
                    this.f287623g |= 1;
                }
                this.f287624h.addAll(o0Var.f287663g);
            }
        }
        if (!o0Var.f287664h.isEmpty()) {
            if (this.f287625i.isEmpty()) {
                this.f287625i = o0Var.f287664h;
                this.f287623g &= -3;
            } else {
                if ((this.f287623g & 2) != 2) {
                    this.f287625i = new java.util.ArrayList(this.f287625i);
                    this.f287623g |= 2;
                }
                this.f287625i.addAll(o0Var.f287664h);
            }
        }
        if (!o0Var.f287665i.isEmpty()) {
            if (this.f287626m.isEmpty()) {
                this.f287626m = o0Var.f287665i;
                this.f287623g &= -5;
            } else {
                if ((this.f287623g & 4) != 4) {
                    this.f287626m = new java.util.ArrayList(this.f287626m);
                    this.f287623g |= 4;
                }
                this.f287626m.addAll(o0Var.f287665i);
            }
        }
        if ((o0Var.f287662f & 1) == 1) {
            i16.v1 v1Var2 = o0Var.f287666m;
            if ((this.f287623g & 8) != 8 || (v1Var = this.f287627n) == i16.v1.f287783m) {
                this.f287627n = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.f287627n = d17.c();
            }
            this.f287623g |= 8;
        }
        if ((o0Var.f287662f & 2) == 2) {
            i16.g2 g2Var2 = o0Var.f287667n;
            if ((this.f287623g & 16) != 16 || (g2Var = this.f287628o) == i16.g2.f287464h) {
                this.f287628o = g2Var2;
            } else {
                i16.f2 f2Var = new i16.f2();
                f2Var.d(g2Var);
                f2Var.d(g2Var2);
                this.f287628o = f2Var.c();
            }
            this.f287623g |= 16;
        }
        c(o0Var);
        this.f351337d = this.f351337d.e(o0Var.f287661e);
        return this;
    }
}
