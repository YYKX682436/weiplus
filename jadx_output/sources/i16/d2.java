package i16;

/* loaded from: classes16.dex */
public final class d2 extends p16.v implements p16.i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final i16.d2 f287391q;

    /* renamed from: r, reason: collision with root package name */
    public static final p16.j0 f287392r = new i16.z1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287393d;

    /* renamed from: e, reason: collision with root package name */
    public int f287394e;

    /* renamed from: f, reason: collision with root package name */
    public int f287395f;

    /* renamed from: g, reason: collision with root package name */
    public int f287396g;

    /* renamed from: h, reason: collision with root package name */
    public i16.b2 f287397h;

    /* renamed from: i, reason: collision with root package name */
    public int f287398i;

    /* renamed from: m, reason: collision with root package name */
    public int f287399m;

    /* renamed from: n, reason: collision with root package name */
    public i16.c2 f287400n;

    /* renamed from: o, reason: collision with root package name */
    public byte f287401o;

    /* renamed from: p, reason: collision with root package name */
    public int f287402p;

    static {
        i16.d2 d2Var = new i16.d2(true);
        f287391q = d2Var;
        d2Var.f287395f = 0;
        d2Var.f287396g = 0;
        d2Var.f287397h = i16.b2.ERROR;
        d2Var.f287398i = 0;
        d2Var.f287399m = 0;
        d2Var.f287400n = i16.c2.LANGUAGE_VERSION;
    }

    public d2(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287401o = (byte) -1;
        this.f287402p = -1;
        this.f287393d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287394e & 1) == 1) {
            jVar.m(1, this.f287395f);
        }
        if ((this.f287394e & 2) == 2) {
            jVar.m(2, this.f287396g);
        }
        if ((this.f287394e & 4) == 4) {
            jVar.l(3, this.f287397h.f287373d);
        }
        if ((this.f287394e & 8) == 8) {
            jVar.m(4, this.f287398i);
        }
        if ((this.f287394e & 16) == 16) {
            jVar.m(5, this.f287399m);
        }
        if ((this.f287394e & 32) == 32) {
            jVar.l(6, this.f287400n.f287385d);
        }
        jVar.r(this.f287393d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287402p;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287394e & 1) == 1 ? 0 + p16.j.b(1, this.f287395f) : 0;
        if ((this.f287394e & 2) == 2) {
            b17 += p16.j.b(2, this.f287396g);
        }
        if ((this.f287394e & 4) == 4) {
            b17 += p16.j.a(3, this.f287397h.f287373d);
        }
        if ((this.f287394e & 8) == 8) {
            b17 += p16.j.b(4, this.f287398i);
        }
        if ((this.f287394e & 16) == 16) {
            b17 += p16.j.b(5, this.f287399m);
        }
        if ((this.f287394e & 32) == 32) {
            b17 += p16.j.a(6, this.f287400n.f287385d);
        }
        int size = b17 + this.f287393d.size();
        this.f287402p = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287401o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f287401o = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.a2();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.a2 a2Var = new i16.a2();
        a2Var.d(this);
        return a2Var;
    }

    public d2(boolean z17) {
        this.f287401o = (byte) -1;
        this.f287402p = -1;
        this.f287393d = p16.g.f351283d;
    }

    public d2(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287401o = (byte) -1;
        this.f287402p = -1;
        boolean z17 = false;
        this.f287395f = 0;
        this.f287396g = 0;
        i16.b2 b2Var = i16.b2.ERROR;
        this.f287397h = b2Var;
        this.f287398i = 0;
        this.f287399m = 0;
        i16.c2 c2Var = i16.c2.LANGUAGE_VERSION;
        this.f287400n = c2Var;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f287394e |= 1;
                            this.f287395f = hVar.k();
                        } else if (n17 != 16) {
                            i16.c2 c2Var2 = null;
                            i16.b2 b2Var2 = null;
                            if (n17 == 24) {
                                int k17 = hVar.k();
                                if (k17 == 0) {
                                    b2Var2 = i16.b2.WARNING;
                                } else if (k17 == 1) {
                                    b2Var2 = b2Var;
                                } else if (k17 == 2) {
                                    b2Var2 = i16.b2.HIDDEN;
                                }
                                if (b2Var2 == null) {
                                    j17.v(n17);
                                    j17.v(k17);
                                } else {
                                    this.f287394e |= 4;
                                    this.f287397h = b2Var2;
                                }
                            } else if (n17 == 32) {
                                this.f287394e |= 8;
                                this.f287398i = hVar.k();
                            } else if (n17 == 40) {
                                this.f287394e |= 16;
                                this.f287399m = hVar.k();
                            } else if (n17 != 48) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                int k18 = hVar.k();
                                if (k18 == 0) {
                                    c2Var2 = c2Var;
                                } else if (k18 == 1) {
                                    c2Var2 = i16.c2.COMPILER_VERSION;
                                } else if (k18 == 2) {
                                    c2Var2 = i16.c2.API_VERSION;
                                }
                                if (c2Var2 == null) {
                                    j17.v(n17);
                                    j17.v(k18);
                                } else {
                                    this.f287394e |= 32;
                                    this.f287400n = c2Var2;
                                }
                            }
                        } else {
                            this.f287394e |= 2;
                            this.f287396g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f287393d = m17.c();
                        throw th7;
                    }
                    this.f287393d = m17.c();
                    throw th6;
                }
            } catch (p16.z e17) {
                e17.f351371d = this;
                throw e17;
            } catch (java.io.IOException e18) {
                p16.z zVar = new p16.z(e18.getMessage());
                zVar.f351371d = this;
                throw zVar;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f287393d = m17.c();
            throw th8;
        }
        this.f287393d = m17.c();
    }
}
