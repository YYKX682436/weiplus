package i16;

/* loaded from: classes16.dex */
public final class s1 extends p16.s {

    /* renamed from: s, reason: collision with root package name */
    public static final i16.s1 f287725s;

    /* renamed from: t, reason: collision with root package name */
    public static final p16.j0 f287726t = new i16.p1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287727e;

    /* renamed from: f, reason: collision with root package name */
    public int f287728f;

    /* renamed from: g, reason: collision with root package name */
    public int f287729g;

    /* renamed from: h, reason: collision with root package name */
    public int f287730h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f287731i;

    /* renamed from: m, reason: collision with root package name */
    public i16.r1 f287732m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f287733n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287734o;

    /* renamed from: p, reason: collision with root package name */
    public int f287735p;

    /* renamed from: q, reason: collision with root package name */
    public byte f287736q;

    /* renamed from: r, reason: collision with root package name */
    public int f287737r;

    static {
        i16.s1 s1Var = new i16.s1(true);
        f287725s = s1Var;
        s1Var.f287729g = 0;
        s1Var.f287730h = 0;
        s1Var.f287731i = false;
        s1Var.f287732m = i16.r1.INV;
        s1Var.f287733n = java.util.Collections.emptyList();
        s1Var.f287734o = java.util.Collections.emptyList();
    }

    public s1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287735p = -1;
        this.f287736q = (byte) -1;
        this.f287737r = -1;
        this.f287727e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287728f & 1) == 1) {
            jVar.m(1, this.f287729g);
        }
        if ((this.f287728f & 2) == 2) {
            jVar.m(2, this.f287730h);
        }
        if ((this.f287728f & 4) == 4) {
            boolean z17 = this.f287731i;
            jVar.x(3, 0);
            jVar.q(z17 ? 1 : 0);
        }
        if ((this.f287728f & 8) == 8) {
            jVar.l(4, this.f287732m.f287724d);
        }
        for (int i18 = 0; i18 < this.f287733n.size(); i18++) {
            jVar.o(5, (p16.h0) this.f287733n.get(i18));
        }
        if (this.f287734o.size() > 0) {
            jVar.v(50);
            jVar.v(this.f287735p);
        }
        for (int i19 = 0; i19 < this.f287734o.size(); i19++) {
            jVar.n(((java.lang.Integer) this.f287734o.get(i19)).intValue());
        }
        i17.a(1000, jVar);
        jVar.r(this.f287727e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287725s;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287737r;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287728f & 1) == 1 ? p16.j.b(1, this.f287729g) + 0 : 0;
        if ((this.f287728f & 2) == 2) {
            b17 += p16.j.b(2, this.f287730h);
        }
        if ((this.f287728f & 4) == 4) {
            b17 += p16.j.h(3) + 1;
        }
        if ((this.f287728f & 8) == 8) {
            b17 += p16.j.a(4, this.f287732m.f287724d);
        }
        for (int i18 = 0; i18 < this.f287733n.size(); i18++) {
            b17 += p16.j.d(5, (p16.h0) this.f287733n.get(i18));
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f287734o.size(); i27++) {
            i19 += p16.j.c(((java.lang.Integer) this.f287734o.get(i27)).intValue());
        }
        int i28 = b17 + i19;
        if (!this.f287734o.isEmpty()) {
            i28 = i28 + 1 + p16.j.c(i19);
        }
        this.f287735p = i19;
        int e17 = i28 + e() + this.f287727e.size();
        this.f287737r = e17;
        return e17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287736q;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f287728f;
        if (!((i17 & 1) == 1)) {
            this.f287736q = (byte) 0;
            return false;
        }
        if (!((i17 & 2) == 2)) {
            this.f287736q = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f287733n.size(); i18++) {
            if (!((i16.l1) this.f287733n.get(i18)).isInitialized()) {
                this.f287736q = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f287736q = (byte) 1;
            return true;
        }
        this.f287736q = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.q1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.q1 q1Var = new i16.q1();
        q1Var.e(this);
        return q1Var;
    }

    public s1(boolean z17) {
        this.f287735p = -1;
        this.f287736q = (byte) -1;
        this.f287737r = -1;
        this.f287727e = p16.g.f351283d;
    }

    public s1(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.r1 r1Var;
        this.f287735p = -1;
        this.f287736q = (byte) -1;
        this.f287737r = -1;
        this.f287729g = 0;
        this.f287730h = 0;
        this.f287731i = false;
        i16.r1 r1Var2 = i16.r1.INV;
        this.f287732m = r1Var2;
        this.f287733n = java.util.Collections.emptyList();
        this.f287734o = java.util.Collections.emptyList();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f287728f |= 1;
                                this.f287729g = hVar.k();
                            } else if (n17 == 16) {
                                this.f287728f |= 2;
                                this.f287730h = hVar.k();
                            } else if (n17 == 24) {
                                this.f287728f |= 4;
                                this.f287731i = hVar.l() != 0;
                            } else if (n17 == 32) {
                                int k17 = hVar.k();
                                if (k17 == 0) {
                                    r1Var = i16.r1.IN;
                                } else if (k17 != 1) {
                                    r1Var = k17 != 2 ? null : r1Var2;
                                } else {
                                    r1Var = i16.r1.OUT;
                                }
                                if (r1Var == null) {
                                    j17.v(n17);
                                    j17.v(k17);
                                } else {
                                    this.f287728f |= 8;
                                    this.f287732m = r1Var;
                                }
                            } else if (n17 == 42) {
                                if ((i17 & 16) != 16) {
                                    this.f287733n = new java.util.ArrayList();
                                    i17 |= 16;
                                }
                                this.f287733n.add(hVar.g(i16.l1.A, lVar));
                            } else if (n17 == 48) {
                                if ((i17 & 32) != 32) {
                                    this.f287734o = new java.util.ArrayList();
                                    i17 |= 32;
                                }
                                this.f287734o.add(java.lang.Integer.valueOf(hVar.k()));
                            } else if (n17 != 50) {
                                if (!j(hVar, j17, lVar, n17)) {
                                }
                            } else {
                                int d17 = hVar.d(hVar.k());
                                if ((i17 & 32) != 32 && hVar.b() > 0) {
                                    this.f287734o = new java.util.ArrayList();
                                    i17 |= 32;
                                }
                                while (hVar.b() > 0) {
                                    this.f287734o.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                            }
                        }
                        z17 = true;
                    } catch (p16.z e17) {
                        e17.f351371d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f351371d = this;
                    throw zVar;
                }
            } catch (java.lang.Throwable th6) {
                if ((i17 & 16) == 16) {
                    this.f287733n = java.util.Collections.unmodifiableList(this.f287733n);
                }
                if ((i17 & 32) == 32) {
                    this.f287734o = java.util.Collections.unmodifiableList(this.f287734o);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f287727e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f287727e = m17.c();
                    throw th7;
                }
            }
        }
        if ((i17 & 16) == 16) {
            this.f287733n = java.util.Collections.unmodifiableList(this.f287733n);
        }
        if ((i17 & 32) == 32) {
            this.f287734o = java.util.Collections.unmodifiableList(this.f287734o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f287727e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f287727e = m17.c();
            throw th8;
        }
    }
}
