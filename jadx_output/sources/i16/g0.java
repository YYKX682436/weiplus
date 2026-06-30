package i16;

/* loaded from: classes16.dex */
public final class g0 extends p16.v implements p16.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final i16.g0 f287451r;

    /* renamed from: s, reason: collision with root package name */
    public static final p16.j0 f287452s = new i16.d0();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287453d;

    /* renamed from: e, reason: collision with root package name */
    public int f287454e;

    /* renamed from: f, reason: collision with root package name */
    public int f287455f;

    /* renamed from: g, reason: collision with root package name */
    public int f287456g;

    /* renamed from: h, reason: collision with root package name */
    public i16.f0 f287457h;

    /* renamed from: i, reason: collision with root package name */
    public i16.l1 f287458i;

    /* renamed from: m, reason: collision with root package name */
    public int f287459m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f287460n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287461o;

    /* renamed from: p, reason: collision with root package name */
    public byte f287462p;

    /* renamed from: q, reason: collision with root package name */
    public int f287463q;

    static {
        i16.g0 g0Var = new i16.g0(true);
        f287451r = g0Var;
        g0Var.f287455f = 0;
        g0Var.f287456g = 0;
        g0Var.f287457h = i16.f0.TRUE;
        g0Var.f287458i = i16.l1.f287580z;
        g0Var.f287459m = 0;
        g0Var.f287460n = java.util.Collections.emptyList();
        g0Var.f287461o = java.util.Collections.emptyList();
    }

    public g0(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287462p = (byte) -1;
        this.f287463q = -1;
        this.f287453d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287454e & 1) == 1) {
            jVar.m(1, this.f287455f);
        }
        if ((this.f287454e & 2) == 2) {
            jVar.m(2, this.f287456g);
        }
        if ((this.f287454e & 4) == 4) {
            jVar.l(3, this.f287457h.f287433d);
        }
        if ((this.f287454e & 8) == 8) {
            jVar.o(4, this.f287458i);
        }
        if ((this.f287454e & 16) == 16) {
            jVar.m(5, this.f287459m);
        }
        for (int i17 = 0; i17 < this.f287460n.size(); i17++) {
            jVar.o(6, (p16.h0) this.f287460n.get(i17));
        }
        for (int i18 = 0; i18 < this.f287461o.size(); i18++) {
            jVar.o(7, (p16.h0) this.f287461o.get(i18));
        }
        jVar.r(this.f287453d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287463q;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287454e & 1) == 1 ? p16.j.b(1, this.f287455f) + 0 : 0;
        if ((this.f287454e & 2) == 2) {
            b17 += p16.j.b(2, this.f287456g);
        }
        if ((this.f287454e & 4) == 4) {
            b17 += p16.j.a(3, this.f287457h.f287433d);
        }
        if ((this.f287454e & 8) == 8) {
            b17 += p16.j.d(4, this.f287458i);
        }
        if ((this.f287454e & 16) == 16) {
            b17 += p16.j.b(5, this.f287459m);
        }
        for (int i18 = 0; i18 < this.f287460n.size(); i18++) {
            b17 += p16.j.d(6, (p16.h0) this.f287460n.get(i18));
        }
        for (int i19 = 0; i19 < this.f287461o.size(); i19++) {
            b17 += p16.j.d(7, (p16.h0) this.f287461o.get(i19));
        }
        int size = b17 + this.f287453d.size();
        this.f287463q = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287462p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (((this.f287454e & 8) == 8) && !this.f287458i.isInitialized()) {
            this.f287462p = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f287460n.size(); i17++) {
            if (!((i16.g0) this.f287460n.get(i17)).isInitialized()) {
                this.f287462p = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f287461o.size(); i18++) {
            if (!((i16.g0) this.f287461o.get(i18)).isInitialized()) {
                this.f287462p = (byte) 0;
                return false;
            }
        }
        this.f287462p = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.e0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.e0 e0Var = new i16.e0();
        e0Var.d(this);
        return e0Var;
    }

    public g0(boolean z17) {
        this.f287462p = (byte) -1;
        this.f287463q = -1;
        this.f287453d = p16.g.f351283d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public g0(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.f0 f0Var;
        this.f287462p = (byte) -1;
        this.f287463q = -1;
        boolean z17 = false;
        this.f287455f = 0;
        this.f287456g = 0;
        i16.f0 f0Var2 = i16.f0.TRUE;
        this.f287457h = f0Var2;
        this.f287458i = i16.l1.f287580z;
        this.f287459m = 0;
        this.f287460n = java.util.Collections.emptyList();
        this.f287461o = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f287454e |= 1;
                                this.f287455f = hVar.k();
                            } else if (n17 != 16) {
                                i16.k1 k1Var = null;
                                i16.f0 f0Var3 = null;
                                if (n17 == 24) {
                                    int k17 = hVar.k();
                                    if (k17 != 0) {
                                        if (k17 == 1) {
                                            f0Var3 = i16.f0.FALSE;
                                        } else if (k17 == 2) {
                                            f0Var3 = i16.f0.NULL;
                                        }
                                        f0Var = f0Var3;
                                    } else {
                                        f0Var = f0Var2;
                                    }
                                    if (f0Var == null) {
                                        j17.v(n17);
                                        j17.v(k17);
                                    } else {
                                        this.f287454e |= 4;
                                        this.f287457h = f0Var;
                                    }
                                } else if (n17 == 34) {
                                    if ((this.f287454e & 8) == 8) {
                                        i16.l1 l1Var = this.f287458i;
                                        l1Var.getClass();
                                        k1Var = i16.l1.m(l1Var);
                                    }
                                    i16.k1 k1Var2 = k1Var;
                                    i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f287458i = l1Var2;
                                    if (k1Var2 != null) {
                                        k1Var2.b(l1Var2);
                                        this.f287458i = k1Var2.d();
                                    }
                                    this.f287454e |= 8;
                                } else if (n17 != 40) {
                                    p16.j0 j0Var = f287452s;
                                    if (n17 == 50) {
                                        int i17 = (c17 == true ? 1 : 0) & 32;
                                        c17 = c17;
                                        if (i17 != 32) {
                                            this.f287460n = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | ' ';
                                        }
                                        this.f287460n.add(hVar.g(j0Var, lVar));
                                    } else if (n17 != 58) {
                                        if (!hVar.q(n17, j17)) {
                                        }
                                    } else {
                                        int i18 = (c17 == true ? 1 : 0) & 64;
                                        c17 = c17;
                                        if (i18 != 64) {
                                            this.f287461o = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | '@';
                                        }
                                        this.f287461o.add(hVar.g(j0Var, lVar));
                                    }
                                } else {
                                    this.f287454e |= 16;
                                    this.f287459m = hVar.k();
                                }
                            } else {
                                this.f287454e |= 2;
                                this.f287456g = hVar.k();
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
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f287460n = java.util.Collections.unmodifiableList(this.f287460n);
                }
                if (((c17 == true ? 1 : 0) & 64) == 64) {
                    this.f287461o = java.util.Collections.unmodifiableList(this.f287461o);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if (((c17 == true ? 1 : 0) & 32) == 32) {
            this.f287460n = java.util.Collections.unmodifiableList(this.f287460n);
        }
        if (((c17 == true ? 1 : 0) & 64) == 64) {
            this.f287461o = java.util.Collections.unmodifiableList(this.f287461o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
