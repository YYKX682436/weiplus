package i16;

/* loaded from: classes16.dex */
public final class l1 extends p16.s {
    public static final p16.j0 A = new i16.f1();

    /* renamed from: z, reason: collision with root package name */
    public static final i16.l1 f287580z;

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287581e;

    /* renamed from: f, reason: collision with root package name */
    public int f287582f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f287583g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287584h;

    /* renamed from: i, reason: collision with root package name */
    public int f287585i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f287586m;

    /* renamed from: n, reason: collision with root package name */
    public int f287587n;

    /* renamed from: o, reason: collision with root package name */
    public int f287588o;

    /* renamed from: p, reason: collision with root package name */
    public int f287589p;

    /* renamed from: q, reason: collision with root package name */
    public int f287590q;

    /* renamed from: r, reason: collision with root package name */
    public int f287591r;

    /* renamed from: s, reason: collision with root package name */
    public i16.l1 f287592s;

    /* renamed from: t, reason: collision with root package name */
    public int f287593t;

    /* renamed from: u, reason: collision with root package name */
    public i16.l1 f287594u;

    /* renamed from: v, reason: collision with root package name */
    public int f287595v;

    /* renamed from: w, reason: collision with root package name */
    public int f287596w;

    /* renamed from: x, reason: collision with root package name */
    public byte f287597x;

    /* renamed from: y, reason: collision with root package name */
    public int f287598y;

    static {
        i16.l1 l1Var = new i16.l1(true);
        f287580z = l1Var;
        l1Var.l();
    }

    public l1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287597x = (byte) -1;
        this.f287598y = -1;
        this.f287581e = qVar.f351337d;
    }

    public static i16.k1 m(i16.l1 l1Var) {
        i16.k1 k1Var = new i16.k1();
        k1Var.b(l1Var);
        return k1Var;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287582f & 4096) == 4096) {
            jVar.m(1, this.f287596w);
        }
        for (int i18 = 0; i18 < this.f287583g.size(); i18++) {
            jVar.o(2, (p16.h0) this.f287583g.get(i18));
        }
        if ((this.f287582f & 1) == 1) {
            boolean z17 = this.f287584h;
            jVar.x(3, 0);
            jVar.q(z17 ? 1 : 0);
        }
        if ((this.f287582f & 2) == 2) {
            jVar.m(4, this.f287585i);
        }
        if ((this.f287582f & 4) == 4) {
            jVar.o(5, this.f287586m);
        }
        if ((this.f287582f & 16) == 16) {
            jVar.m(6, this.f287588o);
        }
        if ((this.f287582f & 32) == 32) {
            jVar.m(7, this.f287589p);
        }
        if ((this.f287582f & 8) == 8) {
            jVar.m(8, this.f287587n);
        }
        if ((this.f287582f & 64) == 64) {
            jVar.m(9, this.f287590q);
        }
        if ((this.f287582f & 256) == 256) {
            jVar.o(10, this.f287592s);
        }
        if ((this.f287582f & 512) == 512) {
            jVar.m(11, this.f287593t);
        }
        if ((this.f287582f & 128) == 128) {
            jVar.m(12, this.f287591r);
        }
        if ((this.f287582f & 1024) == 1024) {
            jVar.o(13, this.f287594u);
        }
        if ((this.f287582f & 2048) == 2048) {
            jVar.m(14, this.f287595v);
        }
        i17.a(200, jVar);
        jVar.r(this.f287581e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287580z;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287598y;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287582f & 4096) == 4096 ? p16.j.b(1, this.f287596w) + 0 : 0;
        for (int i18 = 0; i18 < this.f287583g.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f287583g.get(i18));
        }
        if ((this.f287582f & 1) == 1) {
            b17 += p16.j.h(3) + 1;
        }
        if ((this.f287582f & 2) == 2) {
            b17 += p16.j.b(4, this.f287585i);
        }
        if ((this.f287582f & 4) == 4) {
            b17 += p16.j.d(5, this.f287586m);
        }
        if ((this.f287582f & 16) == 16) {
            b17 += p16.j.b(6, this.f287588o);
        }
        if ((this.f287582f & 32) == 32) {
            b17 += p16.j.b(7, this.f287589p);
        }
        if ((this.f287582f & 8) == 8) {
            b17 += p16.j.b(8, this.f287587n);
        }
        if ((this.f287582f & 64) == 64) {
            b17 += p16.j.b(9, this.f287590q);
        }
        if ((this.f287582f & 256) == 256) {
            b17 += p16.j.d(10, this.f287592s);
        }
        if ((this.f287582f & 512) == 512) {
            b17 += p16.j.b(11, this.f287593t);
        }
        if ((this.f287582f & 128) == 128) {
            b17 += p16.j.b(12, this.f287591r);
        }
        if ((this.f287582f & 1024) == 1024) {
            b17 += p16.j.d(13, this.f287594u);
        }
        if ((this.f287582f & 2048) == 2048) {
            b17 += p16.j.b(14, this.f287595v);
        }
        int e17 = b17 + e() + this.f287581e.size();
        this.f287598y = e17;
        return e17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287597x;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f287583g.size(); i17++) {
            if (!((i16.j1) this.f287583g.get(i17)).isInitialized()) {
                this.f287597x = (byte) 0;
                return false;
            }
        }
        if (((this.f287582f & 4) == 4) && !this.f287586m.isInitialized()) {
            this.f287597x = (byte) 0;
            return false;
        }
        if (((this.f287582f & 256) == 256) && !this.f287592s.isInitialized()) {
            this.f287597x = (byte) 0;
            return false;
        }
        if (((this.f287582f & 1024) == 1024) && !this.f287594u.isInitialized()) {
            this.f287597x = (byte) 0;
            return false;
        }
        if (d()) {
            this.f287597x = (byte) 1;
            return true;
        }
        this.f287597x = (byte) 0;
        return false;
    }

    public final void l() {
        this.f287583g = java.util.Collections.emptyList();
        this.f287584h = false;
        this.f287585i = 0;
        i16.l1 l1Var = f287580z;
        this.f287586m = l1Var;
        this.f287587n = 0;
        this.f287588o = 0;
        this.f287589p = 0;
        this.f287590q = 0;
        this.f287591r = 0;
        this.f287592s = l1Var;
        this.f287593t = 0;
        this.f287594u = l1Var;
        this.f287595v = 0;
        this.f287596w = 0;
    }

    public i16.k1 n() {
        return m(this);
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.k1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        return m(this);
    }

    public l1(boolean z17) {
        this.f287597x = (byte) -1;
        this.f287598y = -1;
        this.f287581e = p16.g.f351283d;
    }

    public l1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287597x = (byte) -1;
        this.f287598y = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    p16.j0 j0Var = A;
                    i16.k1 k1Var = null;
                    switch (n17) {
                        case 0:
                            break;
                        case 8:
                            this.f287582f |= 4096;
                            this.f287596w = hVar.k();
                            continue;
                        case 18:
                            if (!(z18 & true)) {
                                this.f287583g = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f287583g.add(hVar.g(i16.j1.f287545o, lVar));
                            continue;
                        case 24:
                            this.f287582f |= 1;
                            this.f287584h = hVar.l() != 0;
                            continue;
                        case 32:
                            this.f287582f |= 2;
                            this.f287585i = hVar.k();
                            continue;
                        case 42:
                            if ((this.f287582f & 4) == 4) {
                                i16.l1 l1Var = this.f287586m;
                                l1Var.getClass();
                                k1Var = m(l1Var);
                            }
                            i16.l1 l1Var2 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f287586m = l1Var2;
                            if (k1Var != null) {
                                k1Var.b(l1Var2);
                                this.f287586m = k1Var.d();
                            }
                            this.f287582f |= 4;
                            continue;
                        case 48:
                            this.f287582f |= 16;
                            this.f287588o = hVar.k();
                            continue;
                        case 56:
                            this.f287582f |= 32;
                            this.f287589p = hVar.k();
                            continue;
                        case 64:
                            this.f287582f |= 8;
                            this.f287587n = hVar.k();
                            continue;
                        case 72:
                            this.f287582f |= 64;
                            this.f287590q = hVar.k();
                            continue;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                            if ((this.f287582f & 256) == 256) {
                                i16.l1 l1Var3 = this.f287592s;
                                l1Var3.getClass();
                                k1Var = m(l1Var3);
                            }
                            i16.l1 l1Var4 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f287592s = l1Var4;
                            if (k1Var != null) {
                                k1Var.b(l1Var4);
                                this.f287592s = k1Var.d();
                            }
                            this.f287582f |= 256;
                            continue;
                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                            this.f287582f |= 512;
                            this.f287593t = hVar.k();
                            continue;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_SETAUDIOEFFECT /* 96 */:
                            this.f287582f |= 128;
                            this.f287591r = hVar.k();
                            continue;
                        case 106:
                            if ((this.f287582f & 1024) == 1024) {
                                i16.l1 l1Var5 = this.f287594u;
                                l1Var5.getClass();
                                k1Var = m(l1Var5);
                            }
                            i16.l1 l1Var6 = (i16.l1) hVar.g(j0Var, lVar);
                            this.f287594u = l1Var6;
                            if (k1Var != null) {
                                k1Var.b(l1Var6);
                                this.f287594u = k1Var.d();
                            }
                            this.f287582f |= 1024;
                            continue;
                        case 112:
                            this.f287582f |= 2048;
                            this.f287595v = hVar.k();
                            continue;
                        default:
                            if (!j(hVar, j17, lVar, n17)) {
                                break;
                            } else {
                                break;
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
                if (z18 & true) {
                    this.f287583g = java.util.Collections.unmodifiableList(this.f287583g);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    this.f287581e = m17.c();
                    h();
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    this.f287581e = m17.c();
                    throw th7;
                }
            }
        }
        if (z18 & true) {
            this.f287583g = java.util.Collections.unmodifiableList(this.f287583g);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f287581e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f287581e = m17.c();
            throw th8;
        }
    }
}
