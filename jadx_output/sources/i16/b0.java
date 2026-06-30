package i16;

/* loaded from: classes16.dex */
public final class b0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287361g;

    /* renamed from: h, reason: collision with root package name */
    public int f287362h;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.c0.f287375n     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.a0 r0 = (i16.a0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.c0 r2 = (i16.c0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.c0 r3 = (i16.c0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.b0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.c0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.c0 c0Var = new i16.c0(this, null);
        int i17 = (this.f287361g & 1) != 1 ? 0 : 1;
        c0Var.f287378g = this.f287362h;
        c0Var.f287377f = i17;
        if (c0Var.isInitialized()) {
            return c0Var;
        }
        throw new p16.x0(c0Var);
    }

    public java.lang.Object clone() {
        i16.b0 b0Var = new i16.b0();
        i16.c0 c0Var = new i16.c0(this, null);
        int i17 = (this.f287361g & 1) != 1 ? 0 : 1;
        c0Var.f287378g = this.f287362h;
        c0Var.f287377f = i17;
        b0Var.d(c0Var);
        return b0Var;
    }

    public i16.b0 d(i16.c0 c0Var) {
        if (c0Var == i16.c0.f287374m) {
            return this;
        }
        if ((c0Var.f287377f & 1) == 1) {
            int i17 = c0Var.f287378g;
            this.f287361g = 1 | this.f287361g;
            this.f287362h = i17;
        }
        c(c0Var);
        this.f351337d = this.f351337d.e(c0Var.f287376e);
        return this;
    }
}
