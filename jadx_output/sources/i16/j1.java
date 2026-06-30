package i16;

/* loaded from: classes16.dex */
public final class j1 extends p16.v implements p16.i0 {

    /* renamed from: n, reason: collision with root package name */
    public static final i16.j1 f287544n;

    /* renamed from: o, reason: collision with root package name */
    public static final p16.j0 f287545o = new i16.g1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287546d;

    /* renamed from: e, reason: collision with root package name */
    public int f287547e;

    /* renamed from: f, reason: collision with root package name */
    public i16.i1 f287548f;

    /* renamed from: g, reason: collision with root package name */
    public i16.l1 f287549g;

    /* renamed from: h, reason: collision with root package name */
    public int f287550h;

    /* renamed from: i, reason: collision with root package name */
    public byte f287551i;

    /* renamed from: m, reason: collision with root package name */
    public int f287552m;

    static {
        i16.j1 j1Var = new i16.j1(true);
        f287544n = j1Var;
        j1Var.f287548f = i16.i1.INV;
        j1Var.f287549g = i16.l1.f287580z;
        j1Var.f287550h = 0;
    }

    public j1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287551i = (byte) -1;
        this.f287552m = -1;
        this.f287546d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287547e & 1) == 1) {
            jVar.l(1, this.f287548f.f287521d);
        }
        if ((this.f287547e & 2) == 2) {
            jVar.o(2, this.f287549g);
        }
        if ((this.f287547e & 4) == 4) {
            jVar.m(3, this.f287550h);
        }
        jVar.r(this.f287546d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287552m;
        if (i17 != -1) {
            return i17;
        }
        int a17 = (this.f287547e & 1) == 1 ? 0 + p16.j.a(1, this.f287548f.f287521d) : 0;
        if ((this.f287547e & 2) == 2) {
            a17 += p16.j.d(2, this.f287549g);
        }
        if ((this.f287547e & 4) == 4) {
            a17 += p16.j.b(3, this.f287550h);
        }
        int size = a17 + this.f287546d.size();
        this.f287552m = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287551i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f287547e & 2) == 2) || this.f287549g.isInitialized()) {
            this.f287551i = (byte) 1;
            return true;
        }
        this.f287551i = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.h1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.h1 h1Var = new i16.h1();
        h1Var.d(this);
        return h1Var;
    }

    public j1(boolean z17) {
        this.f287551i = (byte) -1;
        this.f287552m = -1;
        this.f287546d = p16.g.f351283d;
    }

    public j1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287551i = (byte) -1;
        this.f287552m = -1;
        i16.i1 i1Var = i16.i1.INV;
        this.f287548f = i1Var;
        this.f287549g = i16.l1.f287580z;
        boolean z17 = false;
        this.f287550h = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            i16.k1 k1Var = null;
                            i16.i1 i1Var2 = null;
                            if (n17 == 8) {
                                int k17 = hVar.k();
                                if (k17 == 0) {
                                    i1Var2 = i16.i1.IN;
                                } else if (k17 == 1) {
                                    i1Var2 = i16.i1.OUT;
                                } else if (k17 == 2) {
                                    i1Var2 = i1Var;
                                } else if (k17 == 3) {
                                    i1Var2 = i16.i1.STAR;
                                }
                                if (i1Var2 == null) {
                                    j17.v(n17);
                                    j17.v(k17);
                                } else {
                                    this.f287547e |= 1;
                                    this.f287548f = i1Var2;
                                }
                            } else if (n17 == 18) {
                                if ((this.f287547e & 2) == 2) {
                                    i16.l1 l1Var = this.f287549g;
                                    l1Var.getClass();
                                    k1Var = i16.l1.m(l1Var);
                                }
                                i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f287549g = l1Var2;
                                if (k1Var != null) {
                                    k1Var.b(l1Var2);
                                    this.f287549g = k1Var.d();
                                }
                                this.f287547e |= 2;
                            } else if (n17 != 24) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                this.f287547e |= 4;
                                this.f287550h = hVar.k();
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
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th7) {
                    this.f287546d = m17.c();
                    throw th7;
                }
                this.f287546d = m17.c();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f287546d = m17.c();
            throw th8;
        }
        this.f287546d = m17.c();
    }
}
