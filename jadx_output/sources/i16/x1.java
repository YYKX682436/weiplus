package i16;

/* loaded from: classes16.dex */
public final class x1 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287803g;

    /* renamed from: h, reason: collision with root package name */
    public int f287804h;

    /* renamed from: i, reason: collision with root package name */
    public int f287805i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f287806m;

    /* renamed from: n, reason: collision with root package name */
    public int f287807n;

    /* renamed from: o, reason: collision with root package name */
    public i16.l1 f287808o;

    /* renamed from: p, reason: collision with root package name */
    public int f287809p;

    public x1() {
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287806m = l1Var;
        this.f287808o = l1Var;
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
            p16.j0 r0 = i16.y1.f287820s     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.w1 r0 = (i16.w1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.y1 r2 = (i16.y1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.y1 r3 = (i16.y1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.x1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.y1) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.y1 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.x1 x1Var = new i16.x1();
        x1Var.e(d());
        return x1Var;
    }

    public i16.y1 d() {
        i16.y1 y1Var = new i16.y1(this, null);
        int i17 = this.f287803g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        y1Var.f287823g = this.f287804h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        y1Var.f287824h = this.f287805i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        y1Var.f287825i = this.f287806m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        y1Var.f287826m = this.f287807n;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        y1Var.f287827n = this.f287808o;
        if ((i17 & 32) == 32) {
            i18 |= 32;
        }
        y1Var.f287828o = this.f287809p;
        y1Var.f287822f = i18;
        return y1Var;
    }

    public i16.x1 e(i16.y1 y1Var) {
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (y1Var == i16.y1.f287819r) {
            return this;
        }
        int i17 = y1Var.f287822f;
        if ((i17 & 1) == 1) {
            int i18 = y1Var.f287823g;
            this.f287803g |= 1;
            this.f287804h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = y1Var.f287824h;
            this.f287803g = 2 | this.f287803g;
            this.f287805i = i19;
        }
        if ((i17 & 4) == 4) {
            i16.l1 l1Var3 = y1Var.f287825i;
            if ((this.f287803g & 4) != 4 || (l1Var2 = this.f287806m) == i16.l1.f287580z) {
                this.f287806m = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f287806m = m17.d();
            }
            this.f287803g |= 4;
        }
        int i27 = y1Var.f287822f;
        if ((i27 & 8) == 8) {
            int i28 = y1Var.f287826m;
            this.f287803g = 8 | this.f287803g;
            this.f287807n = i28;
        }
        if ((i27 & 16) == 16) {
            i16.l1 l1Var4 = y1Var.f287827n;
            if ((this.f287803g & 16) != 16 || (l1Var = this.f287808o) == i16.l1.f287580z) {
                this.f287808o = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f287808o = m18.d();
            }
            this.f287803g |= 16;
        }
        if ((y1Var.f287822f & 32) == 32) {
            int i29 = y1Var.f287828o;
            this.f287803g = 32 | this.f287803g;
            this.f287809p = i29;
        }
        c(y1Var);
        this.f351337d = this.f351337d.e(y1Var.f287821e);
        return this;
    }
}
