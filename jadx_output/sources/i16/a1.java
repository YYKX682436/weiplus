package i16;

/* loaded from: classes16.dex */
public final class a1 extends p16.v implements p16.i0 {

    /* renamed from: n, reason: collision with root package name */
    public static final i16.a1 f287345n;

    /* renamed from: o, reason: collision with root package name */
    public static final p16.j0 f287346o = new i16.x0();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287347d;

    /* renamed from: e, reason: collision with root package name */
    public int f287348e;

    /* renamed from: f, reason: collision with root package name */
    public int f287349f;

    /* renamed from: g, reason: collision with root package name */
    public int f287350g;

    /* renamed from: h, reason: collision with root package name */
    public i16.z0 f287351h;

    /* renamed from: i, reason: collision with root package name */
    public byte f287352i;

    /* renamed from: m, reason: collision with root package name */
    public int f287353m;

    static {
        i16.a1 a1Var = new i16.a1(true);
        f287345n = a1Var;
        a1Var.f287349f = -1;
        a1Var.f287350g = 0;
        a1Var.f287351h = i16.z0.PACKAGE;
    }

    public a1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287352i = (byte) -1;
        this.f287353m = -1;
        this.f287347d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287348e & 1) == 1) {
            jVar.m(1, this.f287349f);
        }
        if ((this.f287348e & 2) == 2) {
            jVar.m(2, this.f287350g);
        }
        if ((this.f287348e & 4) == 4) {
            jVar.l(3, this.f287351h.f287845d);
        }
        jVar.r(this.f287347d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287353m;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287348e & 1) == 1 ? 0 + p16.j.b(1, this.f287349f) : 0;
        if ((this.f287348e & 2) == 2) {
            b17 += p16.j.b(2, this.f287350g);
        }
        if ((this.f287348e & 4) == 4) {
            b17 += p16.j.a(3, this.f287351h.f287845d);
        }
        int size = b17 + this.f287347d.size();
        this.f287353m = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287352i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if ((this.f287348e & 2) == 2) {
            this.f287352i = (byte) 1;
            return true;
        }
        this.f287352i = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.y0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.y0 y0Var = new i16.y0();
        y0Var.d(this);
        return y0Var;
    }

    public a1(boolean z17) {
        this.f287352i = (byte) -1;
        this.f287353m = -1;
        this.f287347d = p16.g.f351283d;
    }

    public a1(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.z0 z0Var;
        this.f287352i = (byte) -1;
        this.f287353m = -1;
        this.f287349f = -1;
        boolean z17 = false;
        this.f287350g = 0;
        i16.z0 z0Var2 = i16.z0.PACKAGE;
        this.f287351h = z0Var2;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f287348e |= 1;
                            this.f287349f = hVar.k();
                        } else if (n17 == 16) {
                            this.f287348e |= 2;
                            this.f287350g = hVar.k();
                        } else if (n17 != 24) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            int k17 = hVar.k();
                            if (k17 == 0) {
                                z0Var = i16.z0.CLASS;
                            } else if (k17 != 1) {
                                z0Var = k17 != 2 ? null : i16.z0.LOCAL;
                            } else {
                                z0Var = z0Var2;
                            }
                            if (z0Var == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f287348e |= 4;
                                this.f287351h = z0Var;
                            }
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f287347d = m17.c();
                        throw th7;
                    }
                    this.f287347d = m17.c();
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
            this.f287347d = m17.c();
            throw th8;
        }
        this.f287347d = m17.c();
    }
}
