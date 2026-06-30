package i16;

/* loaded from: classes16.dex */
public final class q1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287694g;

    /* renamed from: h, reason: collision with root package name */
    public int f287695h;

    /* renamed from: i, reason: collision with root package name */
    public int f287696i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f287697m;

    /* renamed from: n, reason: collision with root package name */
    public i16.r1 f287698n = i16.r1.INV;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287699o = java.util.Collections.emptyList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f287700p = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.s1.f287726t     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p1 r0 = (i16.p1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.s1 r2 = (i16.s1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.s1 r3 = (i16.s1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.q1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.s1) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.s1 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.q1 q1Var = new i16.q1();
        q1Var.e(d());
        return q1Var;
    }

    public i16.s1 d() {
        i16.s1 s1Var = new i16.s1(this, null);
        int i17 = this.f287694g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        s1Var.f287729g = this.f287695h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        s1Var.f287730h = this.f287696i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        s1Var.f287731i = this.f287697m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        s1Var.f287732m = this.f287698n;
        if ((i17 & 16) == 16) {
            this.f287699o = java.util.Collections.unmodifiableList(this.f287699o);
            this.f287694g &= -17;
        }
        s1Var.f287733n = this.f287699o;
        if ((this.f287694g & 32) == 32) {
            this.f287700p = java.util.Collections.unmodifiableList(this.f287700p);
            this.f287694g &= -33;
        }
        s1Var.f287734o = this.f287700p;
        s1Var.f287728f = i18;
        return s1Var;
    }

    public i16.q1 e(i16.s1 s1Var) {
        if (s1Var == i16.s1.f287725s) {
            return this;
        }
        int i17 = s1Var.f287728f;
        if ((i17 & 1) == 1) {
            int i18 = s1Var.f287729g;
            this.f287694g |= 1;
            this.f287695h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = s1Var.f287730h;
            this.f287694g = 2 | this.f287694g;
            this.f287696i = i19;
        }
        if ((i17 & 4) == 4) {
            boolean z17 = s1Var.f287731i;
            this.f287694g = 4 | this.f287694g;
            this.f287697m = z17;
        }
        if ((i17 & 8) == 8) {
            i16.r1 r1Var = s1Var.f287732m;
            r1Var.getClass();
            this.f287694g = 8 | this.f287694g;
            this.f287698n = r1Var;
        }
        if (!s1Var.f287733n.isEmpty()) {
            if (this.f287699o.isEmpty()) {
                this.f287699o = s1Var.f287733n;
                this.f287694g &= -17;
            } else {
                if ((this.f287694g & 16) != 16) {
                    this.f287699o = new java.util.ArrayList(this.f287699o);
                    this.f287694g |= 16;
                }
                this.f287699o.addAll(s1Var.f287733n);
            }
        }
        if (!s1Var.f287734o.isEmpty()) {
            if (this.f287700p.isEmpty()) {
                this.f287700p = s1Var.f287734o;
                this.f287694g &= -33;
            } else {
                if ((this.f287694g & 32) != 32) {
                    this.f287700p = new java.util.ArrayList(this.f287700p);
                    this.f287694g |= 32;
                }
                this.f287700p.addAll(s1Var.f287734o);
            }
        }
        c(s1Var);
        this.f351337d = this.f351337d.e(s1Var.f287727e);
        return this;
    }
}
