package i16;

/* loaded from: classes16.dex */
public final class d extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287386e;

    /* renamed from: f, reason: collision with root package name */
    public int f287387f;

    /* renamed from: g, reason: collision with root package name */
    public i16.h f287388g = i16.h.f287470v;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.i.f287494n     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.c r0 = (i16.c) r0     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> L10 p16.z -> L12
            i16.i r2 = (i16.i) r2     // Catch: java.lang.Throwable -> L10 p16.z -> L12
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
            i16.i r3 = (i16.i) r3     // Catch: java.lang.Throwable -> L10
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
        throw new UnsupportedOperationException("Method not decompiled: i16.d.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.i) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.i c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.i c() {
        i16.i iVar = new i16.i(this, null);
        int i17 = this.f287386e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        iVar.f287497f = this.f287387f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        iVar.f287498g = this.f287388g;
        iVar.f287496e = i18;
        return iVar;
    }

    public java.lang.Object clone() {
        i16.d dVar = new i16.d();
        dVar.d(c());
        return dVar;
    }

    public i16.d d(i16.i iVar) {
        i16.h hVar;
        if (iVar == i16.i.f287493m) {
            return this;
        }
        int i17 = iVar.f287496e;
        if ((i17 & 1) == 1) {
            int i18 = iVar.f287497f;
            this.f287386e |= 1;
            this.f287387f = i18;
        }
        if ((i17 & 2) == 2) {
            i16.h hVar2 = iVar.f287498g;
            if ((this.f287386e & 2) != 2 || (hVar = this.f287388g) == i16.h.f287470v) {
                this.f287388g = hVar2;
            } else {
                i16.f fVar = new i16.f();
                fVar.d(hVar);
                fVar.d(hVar2);
                this.f287388g = fVar.c();
            }
            this.f287386e |= 2;
        }
        this.f351337d = this.f351337d.e(iVar.f287495d);
        return this;
    }
}
