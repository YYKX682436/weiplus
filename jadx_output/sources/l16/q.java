package l16;

/* loaded from: classes16.dex */
public final class q extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.q f315084m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f315085n = new l16.k();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f315086d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f315087e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f315088f;

    /* renamed from: g, reason: collision with root package name */
    public int f315089g;

    /* renamed from: h, reason: collision with root package name */
    public byte f315090h;

    /* renamed from: i, reason: collision with root package name */
    public int f315091i;

    static {
        l16.q qVar = new l16.q(true);
        f315084m = qVar;
        qVar.f315087e = java.util.Collections.emptyList();
        qVar.f315088f = java.util.Collections.emptyList();
    }

    public q(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f315089g = -1;
        this.f315090h = (byte) -1;
        this.f315091i = -1;
        this.f315086d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        for (int i17 = 0; i17 < this.f315087e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f315087e.get(i17));
        }
        if (this.f315088f.size() > 0) {
            jVar.v(42);
            jVar.v(this.f315089g);
        }
        for (int i18 = 0; i18 < this.f315088f.size(); i18++) {
            jVar.n(((java.lang.Integer) this.f315088f.get(i18)).intValue());
        }
        jVar.r(this.f315086d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f315091i;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f315087e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f315087e.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f315088f.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f315088f.get(i28)).intValue());
        }
        int i29 = i18 + i27;
        if (!this.f315088f.isEmpty()) {
            i29 = i29 + 1 + p16.j.c(i27);
        }
        this.f315089g = i27;
        int size = i29 + this.f315086d.size();
        this.f315091i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f315090h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f315090h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new l16.l();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        l16.l lVar = new l16.l();
        lVar.d(this);
        return lVar;
    }

    public q(boolean z17) {
        this.f315089g = -1;
        this.f315090h = (byte) -1;
        this.f315091i = -1;
        this.f315086d = p16.g.f351283d;
    }

    public q(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f315089g = -1;
        this.f315090h = (byte) -1;
        this.f315091i = -1;
        this.f315087e = java.util.Collections.emptyList();
        this.f315088f = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 10) {
                            if ((i17 & 1) != 1) {
                                this.f315087e = new java.util.ArrayList();
                                i17 |= 1;
                            }
                            this.f315087e.add(hVar.g(l16.p.f315071t, lVar));
                        } else if (n17 == 40) {
                            if ((i17 & 2) != 2) {
                                this.f315088f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f315088f.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 != 42) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 2) != 2 && hVar.b() > 0) {
                                this.f315088f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            while (hVar.b() > 0) {
                                this.f315088f.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 1) == 1) {
                        this.f315087e = java.util.Collections.unmodifiableList(this.f315087e);
                    }
                    if ((i17 & 2) == 2) {
                        this.f315088f = java.util.Collections.unmodifiableList(this.f315088f);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
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
        if ((i17 & 1) == 1) {
            this.f315087e = java.util.Collections.unmodifiableList(this.f315087e);
        }
        if ((i17 & 2) == 2) {
            this.f315088f = java.util.Collections.unmodifiableList(this.f315088f);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
