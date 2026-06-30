package i16;

/* loaded from: classes16.dex */
public final class i0 extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287501g;

    /* renamed from: h, reason: collision with root package name */
    public int f287502h = 6;

    /* renamed from: i, reason: collision with root package name */
    public int f287503i = 6;

    /* renamed from: m, reason: collision with root package name */
    public int f287504m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f287505n;

    /* renamed from: o, reason: collision with root package name */
    public int f287506o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f287507p;

    /* renamed from: q, reason: collision with root package name */
    public i16.l1 f287508q;

    /* renamed from: r, reason: collision with root package name */
    public int f287509r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287510s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f287511t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f287512u;

    /* renamed from: v, reason: collision with root package name */
    public i16.v1 f287513v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f287514w;

    /* renamed from: x, reason: collision with root package name */
    public i16.u f287515x;

    public i0() {
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287505n = l1Var;
        this.f287507p = java.util.Collections.emptyList();
        this.f287508q = l1Var;
        this.f287510s = java.util.Collections.emptyList();
        this.f287511t = java.util.Collections.emptyList();
        this.f287512u = java.util.Collections.emptyList();
        this.f287513v = i16.v1.f287783m;
        this.f287514w = java.util.Collections.emptyList();
        this.f287515x = i16.u.f287755h;
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
            p16.j0 r0 = i16.j0.B     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.h0 r0 = (i16.h0) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.j0 r2 = (i16.j0) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.j0 r3 = (i16.j0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.i0.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.j0) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.j0 d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.i0 i0Var = new i16.i0();
        i0Var.e(d());
        return i0Var;
    }

    public i16.j0 d() {
        i16.j0 j0Var = new i16.j0(this, null);
        int i17 = this.f287501g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        j0Var.f287527g = this.f287502h;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        j0Var.f287528h = this.f287503i;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        j0Var.f287529i = this.f287504m;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        j0Var.f287530m = this.f287505n;
        if ((i17 & 16) == 16) {
            i18 |= 16;
        }
        j0Var.f287531n = this.f287506o;
        if ((i17 & 32) == 32) {
            this.f287507p = java.util.Collections.unmodifiableList(this.f287507p);
            this.f287501g &= -33;
        }
        j0Var.f287532o = this.f287507p;
        if ((i17 & 64) == 64) {
            i18 |= 32;
        }
        j0Var.f287533p = this.f287508q;
        if ((i17 & 128) == 128) {
            i18 |= 64;
        }
        j0Var.f287534q = this.f287509r;
        if ((this.f287501g & 256) == 256) {
            this.f287510s = java.util.Collections.unmodifiableList(this.f287510s);
            this.f287501g &= -257;
        }
        j0Var.f287535r = this.f287510s;
        if ((this.f287501g & 512) == 512) {
            this.f287511t = java.util.Collections.unmodifiableList(this.f287511t);
            this.f287501g &= -513;
        }
        j0Var.f287536s = this.f287511t;
        if ((this.f287501g & 1024) == 1024) {
            this.f287512u = java.util.Collections.unmodifiableList(this.f287512u);
            this.f287501g &= -1025;
        }
        j0Var.f287538u = this.f287512u;
        if ((i17 & 2048) == 2048) {
            i18 |= 128;
        }
        j0Var.f287539v = this.f287513v;
        if ((this.f287501g & 4096) == 4096) {
            this.f287514w = java.util.Collections.unmodifiableList(this.f287514w);
            this.f287501g &= -4097;
        }
        j0Var.f287540w = this.f287514w;
        if ((i17 & 8192) == 8192) {
            i18 |= 256;
        }
        j0Var.f287541x = this.f287515x;
        j0Var.f287526f = i18;
        return j0Var;
    }

    public i16.i0 e(i16.j0 j0Var) {
        i16.u uVar;
        i16.v1 v1Var;
        i16.l1 l1Var;
        i16.l1 l1Var2;
        if (j0Var == i16.j0.A) {
            return this;
        }
        int i17 = j0Var.f287526f;
        if ((i17 & 1) == 1) {
            int i18 = j0Var.f287527g;
            this.f287501g |= 1;
            this.f287502h = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = j0Var.f287528h;
            this.f287501g = 2 | this.f287501g;
            this.f287503i = i19;
        }
        if ((i17 & 4) == 4) {
            int i27 = j0Var.f287529i;
            this.f287501g = 4 | this.f287501g;
            this.f287504m = i27;
        }
        if ((i17 & 8) == 8) {
            i16.l1 l1Var3 = j0Var.f287530m;
            if ((this.f287501g & 8) != 8 || (l1Var2 = this.f287505n) == i16.l1.f287580z) {
                this.f287505n = l1Var3;
            } else {
                i16.k1 m17 = i16.l1.m(l1Var2);
                m17.b(l1Var3);
                this.f287505n = m17.d();
            }
            this.f287501g |= 8;
        }
        if ((j0Var.f287526f & 16) == 16) {
            int i28 = j0Var.f287531n;
            this.f287501g = 16 | this.f287501g;
            this.f287506o = i28;
        }
        if (!j0Var.f287532o.isEmpty()) {
            if (this.f287507p.isEmpty()) {
                this.f287507p = j0Var.f287532o;
                this.f287501g &= -33;
            } else {
                if ((this.f287501g & 32) != 32) {
                    this.f287507p = new java.util.ArrayList(this.f287507p);
                    this.f287501g |= 32;
                }
                this.f287507p.addAll(j0Var.f287532o);
            }
        }
        if ((j0Var.f287526f & 32) == 32) {
            i16.l1 l1Var4 = j0Var.f287533p;
            if ((this.f287501g & 64) != 64 || (l1Var = this.f287508q) == i16.l1.f287580z) {
                this.f287508q = l1Var4;
            } else {
                i16.k1 m18 = i16.l1.m(l1Var);
                m18.b(l1Var4);
                this.f287508q = m18.d();
            }
            this.f287501g |= 64;
        }
        if ((j0Var.f287526f & 64) == 64) {
            int i29 = j0Var.f287534q;
            this.f287501g |= 128;
            this.f287509r = i29;
        }
        if (!j0Var.f287535r.isEmpty()) {
            if (this.f287510s.isEmpty()) {
                this.f287510s = j0Var.f287535r;
                this.f287501g &= -257;
            } else {
                if ((this.f287501g & 256) != 256) {
                    this.f287510s = new java.util.ArrayList(this.f287510s);
                    this.f287501g |= 256;
                }
                this.f287510s.addAll(j0Var.f287535r);
            }
        }
        if (!j0Var.f287536s.isEmpty()) {
            if (this.f287511t.isEmpty()) {
                this.f287511t = j0Var.f287536s;
                this.f287501g &= -513;
            } else {
                if ((this.f287501g & 512) != 512) {
                    this.f287511t = new java.util.ArrayList(this.f287511t);
                    this.f287501g |= 512;
                }
                this.f287511t.addAll(j0Var.f287536s);
            }
        }
        if (!j0Var.f287538u.isEmpty()) {
            if (this.f287512u.isEmpty()) {
                this.f287512u = j0Var.f287538u;
                this.f287501g &= -1025;
            } else {
                if ((this.f287501g & 1024) != 1024) {
                    this.f287512u = new java.util.ArrayList(this.f287512u);
                    this.f287501g |= 1024;
                }
                this.f287512u.addAll(j0Var.f287538u);
            }
        }
        if ((j0Var.f287526f & 128) == 128) {
            i16.v1 v1Var2 = j0Var.f287539v;
            if ((this.f287501g & 2048) != 2048 || (v1Var = this.f287513v) == i16.v1.f287783m) {
                this.f287513v = v1Var2;
            } else {
                i16.u1 d17 = i16.v1.d(v1Var);
                d17.d(v1Var2);
                this.f287513v = d17.c();
            }
            this.f287501g |= 2048;
        }
        if (!j0Var.f287540w.isEmpty()) {
            if (this.f287514w.isEmpty()) {
                this.f287514w = j0Var.f287540w;
                this.f287501g &= -4097;
            } else {
                if ((this.f287501g & 4096) != 4096) {
                    this.f287514w = new java.util.ArrayList(this.f287514w);
                    this.f287501g |= 4096;
                }
                this.f287514w.addAll(j0Var.f287540w);
            }
        }
        if ((j0Var.f287526f & 256) == 256) {
            i16.u uVar2 = j0Var.f287541x;
            if ((this.f287501g & 8192) != 8192 || (uVar = this.f287515x) == i16.u.f287755h) {
                this.f287515x = uVar2;
            } else {
                i16.t tVar = new i16.t();
                tVar.d(uVar);
                tVar.d(uVar2);
                this.f287515x = tVar.c();
            }
            this.f287501g |= 8192;
        }
        c(j0Var);
        this.f351337d = this.f351337d.e(j0Var.f287525e);
        return this;
    }
}
