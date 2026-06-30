package i16;

/* loaded from: classes16.dex */
public final class q0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287689g;

    /* renamed from: h, reason: collision with root package name */
    public i16.e1 f287690h = i16.e1.f287411h;

    /* renamed from: i, reason: collision with root package name */
    public i16.b1 f287691i = i16.b1.f287363h;

    /* renamed from: m, reason: collision with root package name */
    public i16.o0 f287692m = i16.o0.f287659q;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f287693n = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.r0.f287711q     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p0 r0 = (i16.p0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.r0 r2 = (i16.r0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.r0 r3 = (i16.r0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.q0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.r0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.r0 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.q0 q0Var = new i16.q0();
        q0Var.e(d());
        return q0Var;
    }

    public i16.r0 d() {
        i16.r0 r0Var = new i16.r0(this, null);
        int i17 = this.f287689g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        r0Var.f287714g = this.f287690h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        r0Var.f287715h = this.f287691i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        r0Var.f287716i = this.f287692m;
        if ((i17 & 8) == 8) {
            this.f287693n = java.util.Collections.unmodifiableList(this.f287693n);
            this.f287689g &= -9;
        }
        r0Var.f287717m = this.f287693n;
        r0Var.f287713f = i18;
        return r0Var;
    }

    public i16.q0 e(i16.r0 r0Var) {
        i16.o0 o0Var;
        i16.b1 b1Var;
        i16.e1 e1Var;
        if (r0Var == i16.r0.f287710p) {
            return this;
        }
        if ((r0Var.f287713f & 1) == 1) {
            i16.e1 e1Var2 = r0Var.f287714g;
            if ((this.f287689g & 1) != 1 || (e1Var = this.f287690h) == i16.e1.f287411h) {
                this.f287690h = e1Var2;
            } else {
                i16.d1 d1Var = new i16.d1();
                d1Var.d(e1Var);
                d1Var.d(e1Var2);
                this.f287690h = d1Var.c();
            }
            this.f287689g |= 1;
        }
        if ((r0Var.f287713f & 2) == 2) {
            i16.b1 b1Var2 = r0Var.f287715h;
            if ((this.f287689g & 2) != 2 || (b1Var = this.f287691i) == i16.b1.f287363h) {
                this.f287691i = b1Var2;
            } else {
                i16.w0 w0Var = new i16.w0();
                w0Var.d(b1Var);
                w0Var.d(b1Var2);
                this.f287691i = w0Var.c();
            }
            this.f287689g |= 2;
        }
        if ((r0Var.f287713f & 4) == 4) {
            i16.o0 o0Var2 = r0Var.f287716i;
            if ((this.f287689g & 4) != 4 || (o0Var = this.f287692m) == i16.o0.f287659q) {
                this.f287692m = o0Var2;
            } else {
                i16.n0 n0Var = new i16.n0();
                n0Var.e(o0Var);
                n0Var.e(o0Var2);
                this.f287692m = n0Var.d();
            }
            this.f287689g |= 4;
        }
        if (!r0Var.f287717m.isEmpty()) {
            if (this.f287693n.isEmpty()) {
                this.f287693n = r0Var.f287717m;
                this.f287689g &= -9;
            } else {
                if ((this.f287689g & 8) != 8) {
                    this.f287693n = new java.util.ArrayList(this.f287693n);
                    this.f287689g |= 8;
                }
                this.f287693n.addAll(r0Var.f287717m);
            }
        }
        c(r0Var);
        this.f351337d = this.f351337d.e(r0Var.f287712e);
        return this;
    }
}
