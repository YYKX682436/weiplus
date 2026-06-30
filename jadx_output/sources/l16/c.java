package l16;

/* loaded from: classes16.dex */
public final class c extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f315016e;

    /* renamed from: f, reason: collision with root package name */
    public int f315017f;

    /* renamed from: g, reason: collision with root package name */
    public int f315018g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.d.f315020n     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.b r0 = (l16.b) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.d r2 = (l16.d) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            l16.d r3 = (l16.d) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.c.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.d) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        l16.d c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.d c() {
        l16.d dVar = new l16.d(this, null);
        int i17 = this.f315016e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        dVar.f315023f = this.f315017f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        dVar.f315024g = this.f315018g;
        dVar.f315022e = i18;
        return dVar;
    }

    public java.lang.Object clone() {
        l16.c cVar = new l16.c();
        cVar.d(c());
        return cVar;
    }

    public l16.c d(l16.d dVar) {
        if (dVar == l16.d.f315019m) {
            return this;
        }
        int i17 = dVar.f315022e;
        if ((i17 & 1) == 1) {
            int i18 = dVar.f315023f;
            this.f315016e |= 1;
            this.f315017f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = dVar.f315024g;
            this.f315016e = 2 | this.f315016e;
            this.f315018g = i19;
        }
        this.f351337d = this.f351337d.e(dVar.f315021d);
        return this;
    }
}
