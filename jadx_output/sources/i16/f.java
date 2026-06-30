package i16;

/* loaded from: classes16.dex */
public final class f extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287417e;

    /* renamed from: g, reason: collision with root package name */
    public long f287419g;

    /* renamed from: h, reason: collision with root package name */
    public float f287420h;

    /* renamed from: i, reason: collision with root package name */
    public double f287421i;

    /* renamed from: m, reason: collision with root package name */
    public int f287422m;

    /* renamed from: n, reason: collision with root package name */
    public int f287423n;

    /* renamed from: o, reason: collision with root package name */
    public int f287424o;

    /* renamed from: r, reason: collision with root package name */
    public int f287427r;

    /* renamed from: s, reason: collision with root package name */
    public int f287428s;

    /* renamed from: f, reason: collision with root package name */
    public i16.g f287418f = i16.g.BYTE;

    /* renamed from: p, reason: collision with root package name */
    public i16.k f287425p = i16.k.f287553m;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f287426q = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.h.f287471w     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.e r0 = (i16.e) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.h r2 = (i16.h) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.h r3 = (i16.h) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.f.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.h) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.h c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.h c() {
        i16.h hVar = new i16.h(this, null);
        int i17 = this.f287417e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        hVar.f287474f = this.f287418f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        hVar.f287475g = this.f287419g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        hVar.f287476h = this.f287420h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        hVar.f287477i = this.f287421i;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        hVar.f287478m = this.f287422m;
        if ((i17 & 32) == 32) {
            i18 |= 32;
        }
        hVar.f287479n = this.f287423n;
        if ((i17 & 64) == 64) {
            i18 |= 64;
        }
        hVar.f287480o = this.f287424o;
        if ((i17 & 128) == 128) {
            i18 |= 128;
        }
        hVar.f287481p = this.f287425p;
        if ((i17 & 256) == 256) {
            this.f287426q = java.util.Collections.unmodifiableList(this.f287426q);
            this.f287417e &= -257;
        }
        hVar.f287482q = this.f287426q;
        if ((i17 & 512) == 512) {
            i18 |= 256;
        }
        hVar.f287483r = this.f287427r;
        if ((i17 & 1024) == 1024) {
            i18 |= 512;
        }
        hVar.f287484s = this.f287428s;
        hVar.f287473e = i18;
        return hVar;
    }

    public java.lang.Object clone() {
        i16.f fVar = new i16.f();
        fVar.d(c());
        return fVar;
    }

    public i16.f d(i16.h hVar) {
        i16.k kVar;
        if (hVar == i16.h.f287470v) {
            return this;
        }
        if ((hVar.f287473e & 1) == 1) {
            i16.g gVar = hVar.f287474f;
            gVar.getClass();
            this.f287417e |= 1;
            this.f287418f = gVar;
        }
        int i17 = hVar.f287473e;
        if ((i17 & 2) == 2) {
            long j17 = hVar.f287475g;
            this.f287417e |= 2;
            this.f287419g = j17;
        }
        if ((i17 & 4) == 4) {
            float f17 = hVar.f287476h;
            this.f287417e = 4 | this.f287417e;
            this.f287420h = f17;
        }
        if ((i17 & 8) == 8) {
            double d17 = hVar.f287477i;
            this.f287417e |= 8;
            this.f287421i = d17;
        }
        if ((i17 & 16) == 16) {
            int i18 = hVar.f287478m;
            this.f287417e = 16 | this.f287417e;
            this.f287422m = i18;
        }
        if ((i17 & 32) == 32) {
            int i19 = hVar.f287479n;
            this.f287417e = 32 | this.f287417e;
            this.f287423n = i19;
        }
        if ((i17 & 64) == 64) {
            int i27 = hVar.f287480o;
            this.f287417e = 64 | this.f287417e;
            this.f287424o = i27;
        }
        if ((i17 & 128) == 128) {
            i16.k kVar2 = hVar.f287481p;
            if ((this.f287417e & 128) != 128 || (kVar = this.f287425p) == i16.k.f287553m) {
                this.f287425p = kVar2;
            } else {
                i16.j jVar = new i16.j();
                jVar.d(kVar);
                jVar.d(kVar2);
                this.f287425p = jVar.c();
            }
            this.f287417e |= 128;
        }
        if (!hVar.f287482q.isEmpty()) {
            if (this.f287426q.isEmpty()) {
                this.f287426q = hVar.f287482q;
                this.f287417e &= -257;
            } else {
                if ((this.f287417e & 256) != 256) {
                    this.f287426q = new java.util.ArrayList(this.f287426q);
                    this.f287417e |= 256;
                }
                this.f287426q.addAll(hVar.f287482q);
            }
        }
        int i28 = hVar.f287473e;
        if ((i28 & 256) == 256) {
            int i29 = hVar.f287483r;
            this.f287417e |= 512;
            this.f287427r = i29;
        }
        if ((i28 & 512) == 512) {
            int i37 = hVar.f287484s;
            this.f287417e |= 1024;
            this.f287428s = i37;
        }
        this.f351337d = this.f351337d.e(hVar.f287472d);
        return this;
    }
}
