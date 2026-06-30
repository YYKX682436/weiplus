package i16;

/* loaded from: classes16.dex */
public final class h1 extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287487e;

    /* renamed from: f, reason: collision with root package name */
    public i16.i1 f287488f = i16.i1.INV;

    /* renamed from: g, reason: collision with root package name */
    public i16.l1 f287489g = i16.l1.f287580z;

    /* renamed from: h, reason: collision with root package name */
    public int f287490h;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.j1.f287545o     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.g1 r0 = (i16.g1) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.j1 r2 = (i16.j1) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.j1 r3 = (i16.j1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.h1.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.j1) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.j1 c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.j1 c() {
        i16.j1 j1Var = new i16.j1(this, null);
        int i17 = this.f287487e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        j1Var.f287548f = this.f287488f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        j1Var.f287549g = this.f287489g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        j1Var.f287550h = this.f287490h;
        j1Var.f287547e = i18;
        return j1Var;
    }

    public java.lang.Object clone() {
        i16.h1 h1Var = new i16.h1();
        h1Var.d(c());
        return h1Var;
    }

    public i16.h1 d(i16.j1 j1Var) {
        i16.l1 l1Var;
        if (j1Var == i16.j1.f287544n) {
            return this;
        }
        if ((j1Var.f287547e & 1) == 1) {
            i16.i1 i1Var = j1Var.f287548f;
            i1Var.getClass();
            this.f287487e |= 1;
            this.f287488f = i1Var;
        }
        if ((j1Var.f287547e & 2) == 2) {
            i16.l1 l1Var2 = j1Var.f287549g;
            if ((this.f287487e & 2) != 2 || (l1Var = this.f287489g) == i16.l1.f287580z) {
                this.f287489g = l1Var2;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var);
                m17.b(l1Var2);
                this.f287489g = m17.d();
            }
            this.f287487e |= 2;
        }
        if ((j1Var.f287547e & 4) == 4) {
            int i17 = j1Var.f287550h;
            this.f287487e |= 4;
            this.f287490h = i17;
        }
        this.f351337d = this.f351337d.e(j1Var.f287546d);
        return this;
    }
}
