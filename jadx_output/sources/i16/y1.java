package i16;

/* loaded from: classes16.dex */
public final class y1 extends p16.s {

    /* renamed from: r, reason: collision with root package name */
    public static final i16.y1 f287819r;

    /* renamed from: s, reason: collision with root package name */
    public static final p16.j0 f287820s = new i16.w1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287821e;

    /* renamed from: f, reason: collision with root package name */
    public int f287822f;

    /* renamed from: g, reason: collision with root package name */
    public int f287823g;

    /* renamed from: h, reason: collision with root package name */
    public int f287824h;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f287825i;

    /* renamed from: m, reason: collision with root package name */
    public int f287826m;

    /* renamed from: n, reason: collision with root package name */
    public i16.l1 f287827n;

    /* renamed from: o, reason: collision with root package name */
    public int f287828o;

    /* renamed from: p, reason: collision with root package name */
    public byte f287829p;

    /* renamed from: q, reason: collision with root package name */
    public int f287830q;

    static {
        i16.y1 y1Var = new i16.y1(true);
        f287819r = y1Var;
        y1Var.f287823g = 0;
        y1Var.f287824h = 0;
        i16.l1 l1Var = i16.l1.f287580z;
        y1Var.f287825i = l1Var;
        y1Var.f287826m = 0;
        y1Var.f287827n = l1Var;
        y1Var.f287828o = 0;
    }

    public y1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287829p = (byte) -1;
        this.f287830q = -1;
        this.f287821e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287822f & 1) == 1) {
            jVar.m(1, this.f287823g);
        }
        if ((this.f287822f & 2) == 2) {
            jVar.m(2, this.f287824h);
        }
        if ((this.f287822f & 4) == 4) {
            jVar.o(3, this.f287825i);
        }
        if ((this.f287822f & 16) == 16) {
            jVar.o(4, this.f287827n);
        }
        if ((this.f287822f & 8) == 8) {
            jVar.m(5, this.f287826m);
        }
        if ((this.f287822f & 32) == 32) {
            jVar.m(6, this.f287828o);
        }
        i17.a(200, jVar);
        jVar.r(this.f287821e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287819r;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287830q;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287822f & 1) == 1 ? 0 + p16.j.b(1, this.f287823g) : 0;
        if ((this.f287822f & 2) == 2) {
            b17 += p16.j.b(2, this.f287824h);
        }
        if ((this.f287822f & 4) == 4) {
            b17 += p16.j.d(3, this.f287825i);
        }
        if ((this.f287822f & 16) == 16) {
            b17 += p16.j.d(4, this.f287827n);
        }
        if ((this.f287822f & 8) == 8) {
            b17 += p16.j.b(5, this.f287826m);
        }
        if ((this.f287822f & 32) == 32) {
            b17 += p16.j.b(6, this.f287828o);
        }
        int e17 = b17 + e() + this.f287821e.size();
        this.f287830q = e17;
        return e17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287829p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f287822f;
        if (!((i17 & 2) == 2)) {
            this.f287829p = (byte) 0;
            return false;
        }
        if (((i17 & 4) == 4) && !this.f287825i.isInitialized()) {
            this.f287829p = (byte) 0;
            return false;
        }
        if (((this.f287822f & 16) == 16) && !this.f287827n.isInitialized()) {
            this.f287829p = (byte) 0;
            return false;
        }
        if (d()) {
            this.f287829p = (byte) 1;
            return true;
        }
        this.f287829p = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.x1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.x1 x1Var = new i16.x1();
        x1Var.e(this);
        return x1Var;
    }

    public y1(boolean z17) {
        this.f287829p = (byte) -1;
        this.f287830q = -1;
        this.f287821e = p16.g.f351283d;
    }

    public y1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287829p = (byte) -1;
        this.f287830q = -1;
        boolean z17 = false;
        this.f287823g = 0;
        this.f287824h = 0;
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287825i = l1Var;
        this.f287826m = 0;
        this.f287827n = l1Var;
        this.f287828o = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f287822f |= 1;
                                this.f287823g = hVar.k();
                            } else if (n17 != 16) {
                                i16.k1 k1Var = null;
                                if (n17 == 26) {
                                    if ((this.f287822f & 4) == 4) {
                                        i16.l1 l1Var2 = this.f287825i;
                                        l1Var2.getClass();
                                        k1Var = i16.l1.m(l1Var2);
                                    }
                                    i16.l1 l1Var3 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f287825i = l1Var3;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var3);
                                        this.f287825i = k1Var.d();
                                    }
                                    this.f287822f |= 4;
                                } else if (n17 == 34) {
                                    if ((this.f287822f & 16) == 16) {
                                        i16.l1 l1Var4 = this.f287827n;
                                        l1Var4.getClass();
                                        k1Var = i16.l1.m(l1Var4);
                                    }
                                    i16.l1 l1Var5 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f287827n = l1Var5;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var5);
                                        this.f287827n = k1Var.d();
                                    }
                                    this.f287822f |= 16;
                                } else if (n17 == 40) {
                                    this.f287822f |= 8;
                                    this.f287826m = hVar.k();
                                } else if (n17 != 48) {
                                    if (!j(hVar, j17, lVar, n17)) {
                                    }
                                } else {
                                    this.f287822f |= 32;
                                    this.f287828o = hVar.k();
                                }
                            } else {
                                this.f287822f |= 2;
                                this.f287824h = hVar.k();
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        p16.z zVar = new p16.z(e17.getMessage());
                        zVar.f351371d = this;
                        throw zVar;
                    }
                } catch (p16.z e18) {
                    e18.f351371d = this;
                    throw e18;
                }
            } catch (java.lang.Throwable th6) {
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th7) {
                    this.f287821e = m17.c();
                    throw th7;
                }
                this.f287821e = m17.c();
                h();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f287821e = m17.c();
            throw th8;
        }
        this.f287821e = m17.c();
        h();
    }
}
