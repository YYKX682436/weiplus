package i16;

/* loaded from: classes16.dex */
public final class u1 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287780e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f287781f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public int f287782g = -1;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.v1.f287784n     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.t1 r0 = (i16.t1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.v1 r2 = (i16.v1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.v1 r3 = (i16.v1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.u1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.v1) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.v1 c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.v1 c() {
        i16.v1 v1Var = new i16.v1(this, null);
        int i17 = this.f287780e;
        if ((i17 & 1) == 1) {
            this.f287781f = java.util.Collections.unmodifiableList(this.f287781f);
            this.f287780e &= -2;
        }
        v1Var.f287787f = this.f287781f;
        int i18 = (i17 & 2) != 2 ? 0 : 1;
        v1Var.f287788g = this.f287782g;
        v1Var.f287786e = i18;
        return v1Var;
    }

    public java.lang.Object clone() {
        i16.u1 u1Var = new i16.u1();
        u1Var.d(c());
        return u1Var;
    }

    public i16.u1 d(i16.v1 v1Var) {
        if (v1Var == i16.v1.f287783m) {
            return this;
        }
        if (!v1Var.f287787f.isEmpty()) {
            if (this.f287781f.isEmpty()) {
                this.f287781f = v1Var.f287787f;
                this.f287780e &= -2;
            } else {
                if ((this.f287780e & 1) != 1) {
                    this.f287781f = new java.util.ArrayList(this.f287781f);
                    this.f287780e |= 1;
                }
                this.f287781f.addAll(v1Var.f287787f);
            }
        }
        if ((v1Var.f287786e & 1) == 1) {
            int i17 = v1Var.f287788g;
            this.f287780e |= 2;
            this.f287782g = i17;
        }
        this.f351337d = this.f351337d.e(v1Var.f287785d);
        return this;
    }
}
