package i16;

/* loaded from: classes16.dex */
public final class j extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287522e;

    /* renamed from: f, reason: collision with root package name */
    public int f287523f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f287524g = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.k.f287554n     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.b r0 = (i16.b) r0     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.k r2 = (i16.k) r2     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            if (r2 == 0) goto Lf
            r1.d(r2)
        Lf:
            return r1
        L10:
            r2 = move-exception
            goto L1a
        L12:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> L10
            i16.k r3 = (i16.k) r3     // Catch: java.lang.Throwable -> L10
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.d(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.j.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.k) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.k c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.k c() {
        i16.k kVar = new i16.k(this, null);
        int i17 = this.f287522e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        kVar.f287557f = this.f287523f;
        if ((i17 & 2) == 2) {
            this.f287524g = java.util.Collections.unmodifiableList(this.f287524g);
            this.f287522e &= -3;
        }
        kVar.f287558g = this.f287524g;
        kVar.f287556e = i18;
        return kVar;
    }

    public java.lang.Object clone() {
        i16.j jVar = new i16.j();
        jVar.d(c());
        return jVar;
    }

    public i16.j d(i16.k kVar) {
        if (kVar == i16.k.f287553m) {
            return this;
        }
        if ((kVar.f287556e & 1) == 1) {
            int i17 = kVar.f287557f;
            this.f287522e = 1 | this.f287522e;
            this.f287523f = i17;
        }
        if (!kVar.f287558g.isEmpty()) {
            if (this.f287524g.isEmpty()) {
                this.f287524g = kVar.f287558g;
                this.f287522e &= -3;
            } else {
                if ((this.f287522e & 2) != 2) {
                    this.f287524g = new java.util.ArrayList(this.f287524g);
                    this.f287522e |= 2;
                }
                this.f287524g.addAll(kVar.f287558g);
            }
        }
        this.f351337d = this.f351337d.e(kVar.f287555d);
        return this;
    }
}
