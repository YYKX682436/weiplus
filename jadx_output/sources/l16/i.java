package l16;

/* loaded from: classes16.dex */
public final class i extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f315038e;

    /* renamed from: f, reason: collision with root package name */
    public l16.d f315039f = l16.d.f315019m;

    /* renamed from: g, reason: collision with root package name */
    public l16.g f315040g;

    /* renamed from: h, reason: collision with root package name */
    public l16.g f315041h;

    /* renamed from: i, reason: collision with root package name */
    public l16.g f315042i;

    /* renamed from: m, reason: collision with root package name */
    public l16.g f315043m;

    public i() {
        l16.g gVar = l16.g.f315030m;
        this.f315040g = gVar;
        this.f315041h = gVar;
        this.f315042i = gVar;
        this.f315043m = gVar;
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
            p16.j0 r0 = l16.j.f315045q     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.h r0 = (l16.h) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.j r2 = (l16.j) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            l16.j r3 = (l16.j) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.i.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.j) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        l16.j c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.j c() {
        l16.j jVar = new l16.j(this, null);
        int i17 = this.f315038e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        jVar.f315048f = this.f315039f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        jVar.f315049g = this.f315040g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        jVar.f315050h = this.f315041h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        jVar.f315051i = this.f315042i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        jVar.f315052m = this.f315043m;
        jVar.f315047e = i18;
        return jVar;
    }

    public java.lang.Object clone() {
        l16.i iVar = new l16.i();
        iVar.d(c());
        return iVar;
    }

    public l16.i d(l16.j jVar) {
        l16.g gVar;
        l16.g gVar2;
        l16.g gVar3;
        l16.g gVar4;
        l16.d dVar;
        if (jVar == l16.j.f315044p) {
            return this;
        }
        if ((jVar.f315047e & 1) == 1) {
            l16.d dVar2 = jVar.f315048f;
            if ((this.f315038e & 1) != 1 || (dVar = this.f315039f) == l16.d.f315019m) {
                this.f315039f = dVar2;
            } else {
                l16.c cVar = new l16.c();
                cVar.d(dVar);
                cVar.d(dVar2);
                this.f315039f = cVar.c();
            }
            this.f315038e |= 1;
        }
        if ((jVar.f315047e & 2) == 2) {
            l16.g gVar5 = jVar.f315049g;
            if ((this.f315038e & 2) != 2 || (gVar4 = this.f315040g) == l16.g.f315030m) {
                this.f315040g = gVar5;
            } else {
                l16.f d17 = l16.g.d(gVar4);
                d17.d(gVar5);
                this.f315040g = d17.c();
            }
            this.f315038e |= 2;
        }
        if ((jVar.f315047e & 4) == 4) {
            l16.g gVar6 = jVar.f315050h;
            if ((this.f315038e & 4) != 4 || (gVar3 = this.f315041h) == l16.g.f315030m) {
                this.f315041h = gVar6;
            } else {
                l16.f d18 = l16.g.d(gVar3);
                d18.d(gVar6);
                this.f315041h = d18.c();
            }
            this.f315038e |= 4;
        }
        if ((jVar.f315047e & 8) == 8) {
            l16.g gVar7 = jVar.f315051i;
            if ((this.f315038e & 8) != 8 || (gVar2 = this.f315042i) == l16.g.f315030m) {
                this.f315042i = gVar7;
            } else {
                l16.f d19 = l16.g.d(gVar2);
                d19.d(gVar7);
                this.f315042i = d19.c();
            }
            this.f315038e |= 8;
        }
        if ((jVar.f315047e & 16) == 16) {
            l16.g gVar8 = jVar.f315052m;
            if ((this.f315038e & 16) != 16 || (gVar = this.f315043m) == l16.g.f315030m) {
                this.f315043m = gVar8;
            } else {
                l16.f d27 = l16.g.d(gVar);
                d27.d(gVar8);
                this.f315043m = d27.c();
            }
            this.f315038e |= 16;
        }
        this.f351337d = this.f351337d.e(jVar.f315046d);
        return this;
    }
}
