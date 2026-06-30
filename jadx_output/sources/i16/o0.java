package i16;

/* loaded from: classes16.dex */
public final class o0 extends p16.s {

    /* renamed from: q, reason: collision with root package name */
    public static final i16.o0 f287659q;

    /* renamed from: r, reason: collision with root package name */
    public static final p16.j0 f287660r = new i16.m0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287661e;

    /* renamed from: f, reason: collision with root package name */
    public int f287662f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f287663g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f287664h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f287665i;

    /* renamed from: m, reason: collision with root package name */
    public i16.v1 f287666m;

    /* renamed from: n, reason: collision with root package name */
    public i16.g2 f287667n;

    /* renamed from: o, reason: collision with root package name */
    public byte f287668o;

    /* renamed from: p, reason: collision with root package name */
    public int f287669p;

    static {
        i16.o0 o0Var = new i16.o0(true);
        f287659q = o0Var;
        o0Var.f287663g = java.util.Collections.emptyList();
        o0Var.f287664h = java.util.Collections.emptyList();
        o0Var.f287665i = java.util.Collections.emptyList();
        o0Var.f287666m = i16.v1.f287783m;
        o0Var.f287667n = i16.g2.f287464h;
    }

    public o0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287668o = (byte) -1;
        this.f287669p = -1;
        this.f287661e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        for (int i18 = 0; i18 < this.f287663g.size(); i18++) {
            jVar.o(3, (p16.h0) this.f287663g.get(i18));
        }
        for (int i19 = 0; i19 < this.f287664h.size(); i19++) {
            jVar.o(4, (p16.h0) this.f287664h.get(i19));
        }
        for (int i27 = 0; i27 < this.f287665i.size(); i27++) {
            jVar.o(5, (p16.h0) this.f287665i.get(i27));
        }
        if ((this.f287662f & 1) == 1) {
            jVar.o(30, this.f287666m);
        }
        if ((this.f287662f & 2) == 2) {
            jVar.o(32, this.f287667n);
        }
        i17.a(200, jVar);
        jVar.r(this.f287661e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287659q;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287669p;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f287663g.size(); i19++) {
            i18 += p16.j.d(3, (p16.h0) this.f287663g.get(i19));
        }
        for (int i27 = 0; i27 < this.f287664h.size(); i27++) {
            i18 += p16.j.d(4, (p16.h0) this.f287664h.get(i27));
        }
        for (int i28 = 0; i28 < this.f287665i.size(); i28++) {
            i18 += p16.j.d(5, (p16.h0) this.f287665i.get(i28));
        }
        if ((this.f287662f & 1) == 1) {
            i18 += p16.j.d(30, this.f287666m);
        }
        if ((this.f287662f & 2) == 2) {
            i18 += p16.j.d(32, this.f287667n);
        }
        int e17 = i18 + e() + this.f287661e.size();
        this.f287669p = e17;
        return e17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287668o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f287663g.size(); i17++) {
            if (!((i16.j0) this.f287663g.get(i17)).isInitialized()) {
                this.f287668o = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f287664h.size(); i18++) {
            if (!((i16.u0) this.f287664h.get(i18)).isInitialized()) {
                this.f287668o = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f287665i.size(); i19++) {
            if (!((i16.o1) this.f287665i.get(i19)).isInitialized()) {
                this.f287668o = (byte) 0;
                return false;
            }
        }
        if (((this.f287662f & 1) == 1) && !this.f287666m.isInitialized()) {
            this.f287668o = (byte) 0;
            return false;
        }
        if (d()) {
            this.f287668o = (byte) 1;
            return true;
        }
        this.f287668o = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.n0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.n0 n0Var = new i16.n0();
        n0Var.e(this);
        return n0Var;
    }

    public o0(boolean z17) {
        this.f287668o = (byte) -1;
        this.f287669p = -1;
        this.f287661e = p16.g.f351283d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public o0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287668o = (byte) -1;
        this.f287669p = -1;
        this.f287663g = java.util.Collections.emptyList();
        this.f287664h = java.util.Collections.emptyList();
        this.f287665i = java.util.Collections.emptyList();
        this.f287666m = i16.v1.f287783m;
        this.f287667n = i16.g2.f287464h;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 26) {
                            int i17 = (c17 == true ? 1 : 0) & 1;
                            c17 = c17;
                            if (i17 != 1) {
                                this.f287663g = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 1;
                            }
                            this.f287663g.add(hVar.g(i16.j0.B, lVar));
                        } else if (n17 == 34) {
                            int i18 = (c17 == true ? 1 : 0) & 2;
                            c17 = c17;
                            if (i18 != 2) {
                                this.f287664h = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 2;
                            }
                            this.f287664h.add(hVar.g(i16.u0.B, lVar));
                        } else if (n17 != 42) {
                            i16.f2 f2Var = null;
                            i16.u1 u1Var = null;
                            if (n17 == 242) {
                                if ((this.f287662f & 1) == 1) {
                                    i16.v1 v1Var = this.f287666m;
                                    v1Var.getClass();
                                    u1Var = i16.v1.d(v1Var);
                                }
                                i16.v1 v1Var2 = (i16.v1) hVar.g(i16.v1.f287784n, lVar);
                                this.f287666m = v1Var2;
                                if (u1Var != null) {
                                    u1Var.d(v1Var2);
                                    this.f287666m = u1Var.c();
                                }
                                this.f287662f |= 1;
                            } else if (n17 != 258) {
                                if (!j(hVar, j17, lVar, n17)) {
                                }
                            } else {
                                if ((this.f287662f & 2) == 2) {
                                    i16.g2 g2Var = this.f287667n;
                                    g2Var.getClass();
                                    f2Var = new i16.f2();
                                    f2Var.d(g2Var);
                                }
                                i16.g2 g2Var2 = (i16.g2) hVar.g(i16.g2.f287465i, lVar);
                                this.f287667n = g2Var2;
                                if (f2Var != null) {
                                    f2Var.d(g2Var2);
                                    this.f287667n = f2Var.c();
                                }
                                this.f287662f |= 2;
                            }
                        } else {
                            int i19 = (c17 == true ? 1 : 0) & 4;
                            c17 = c17;
                            if (i19 != 4) {
                                this.f287665i = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 4;
                            }
                            this.f287665i.add(hVar.g(i16.o1.f287671v, lVar));
                        }
                    }
                    z17 = true;
                } catch (p16.z e17) {
                    e17.f351371d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f351371d = this;
                    throw zVar;
                }
            } catch (java.lang.Throwable th6) {
                if (((c17 == true ? 1 : 0) & 1) == 1) {
                    this.f287663g = java.util.Collections.unmodifiableList(this.f287663g);
                }
                if (((c17 == true ? 1 : 0) & 2) == 2) {
                    this.f287664h = java.util.Collections.unmodifiableList(this.f287664h);
                }
                if (((c17 == true ? 1 : 0) & 4) == 4) {
                    this.f287665i = java.util.Collections.unmodifiableList(this.f287665i);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f287661e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f287661e = m17.c();
                    throw th7;
                }
            }
        }
        if (((c17 == true ? 1 : 0) & 1) == 1) {
            this.f287663g = java.util.Collections.unmodifiableList(this.f287663g);
        }
        if (((c17 == true ? 1 : 0) & 2) == 2) {
            this.f287664h = java.util.Collections.unmodifiableList(this.f287664h);
        }
        if (((c17 == true ? 1 : 0) & 4) == 4) {
            this.f287665i = java.util.Collections.unmodifiableList(this.f287665i);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f287661e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f287661e = m17.c();
            throw th8;
        }
    }
}
