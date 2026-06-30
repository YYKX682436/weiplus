package l16;

/* loaded from: classes16.dex */
public final class j extends p16.v implements p16.i0 {

    /* renamed from: p, reason: collision with root package name */
    public static final l16.j f315044p;

    /* renamed from: q, reason: collision with root package name */
    public static final p16.j0 f315045q = new l16.h();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f315046d;

    /* renamed from: e, reason: collision with root package name */
    public int f315047e;

    /* renamed from: f, reason: collision with root package name */
    public l16.d f315048f;

    /* renamed from: g, reason: collision with root package name */
    public l16.g f315049g;

    /* renamed from: h, reason: collision with root package name */
    public l16.g f315050h;

    /* renamed from: i, reason: collision with root package name */
    public l16.g f315051i;

    /* renamed from: m, reason: collision with root package name */
    public l16.g f315052m;

    /* renamed from: n, reason: collision with root package name */
    public byte f315053n;

    /* renamed from: o, reason: collision with root package name */
    public int f315054o;

    static {
        l16.j jVar = new l16.j(true);
        f315044p = jVar;
        jVar.f315048f = l16.d.f315019m;
        l16.g gVar = l16.g.f315030m;
        jVar.f315049g = gVar;
        jVar.f315050h = gVar;
        jVar.f315051i = gVar;
        jVar.f315052m = gVar;
    }

    public j(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f315053n = (byte) -1;
        this.f315054o = -1;
        this.f315046d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f315047e & 1) == 1) {
            jVar.o(1, this.f315048f);
        }
        if ((this.f315047e & 2) == 2) {
            jVar.o(2, this.f315049g);
        }
        if ((this.f315047e & 4) == 4) {
            jVar.o(3, this.f315050h);
        }
        if ((this.f315047e & 8) == 8) {
            jVar.o(4, this.f315051i);
        }
        if ((this.f315047e & 16) == 16) {
            jVar.o(5, this.f315052m);
        }
        jVar.r(this.f315046d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f315054o;
        if (i17 != -1) {
            return i17;
        }
        int d17 = (this.f315047e & 1) == 1 ? 0 + p16.j.d(1, this.f315048f) : 0;
        if ((this.f315047e & 2) == 2) {
            d17 += p16.j.d(2, this.f315049g);
        }
        if ((this.f315047e & 4) == 4) {
            d17 += p16.j.d(3, this.f315050h);
        }
        if ((this.f315047e & 8) == 8) {
            d17 += p16.j.d(4, this.f315051i);
        }
        if ((this.f315047e & 16) == 16) {
            d17 += p16.j.d(5, this.f315052m);
        }
        int size = d17 + this.f315046d.size();
        this.f315054o = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f315053n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f315053n = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new l16.i();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        l16.i iVar = new l16.i();
        iVar.d(this);
        return iVar;
    }

    public j(boolean z17) {
        this.f315053n = (byte) -1;
        this.f315054o = -1;
        this.f315046d = p16.g.f351283d;
    }

    public j(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f315053n = (byte) -1;
        this.f315054o = -1;
        this.f315048f = l16.d.f315019m;
        l16.g gVar = l16.g.f315030m;
        this.f315049g = gVar;
        this.f315050h = gVar;
        this.f315051i = gVar;
        this.f315052m = gVar;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            l16.f fVar = null;
                            l16.c cVar = null;
                            l16.f fVar2 = null;
                            l16.f fVar3 = null;
                            l16.f fVar4 = null;
                            if (n17 == 10) {
                                if ((this.f315047e & 1) == 1) {
                                    l16.d dVar = this.f315048f;
                                    dVar.getClass();
                                    cVar = new l16.c();
                                    cVar.d(dVar);
                                }
                                l16.d dVar2 = (l16.d) hVar.g(l16.d.f315020n, lVar);
                                this.f315048f = dVar2;
                                if (cVar != null) {
                                    cVar.d(dVar2);
                                    this.f315048f = cVar.c();
                                }
                                this.f315047e |= 1;
                            } else if (n17 == 18) {
                                if ((this.f315047e & 2) == 2) {
                                    l16.g gVar2 = this.f315049g;
                                    gVar2.getClass();
                                    fVar2 = l16.g.d(gVar2);
                                }
                                l16.g gVar3 = (l16.g) hVar.g(l16.g.f315031n, lVar);
                                this.f315049g = gVar3;
                                if (fVar2 != null) {
                                    fVar2.d(gVar3);
                                    this.f315049g = fVar2.c();
                                }
                                this.f315047e |= 2;
                            } else if (n17 == 26) {
                                if ((this.f315047e & 4) == 4) {
                                    l16.g gVar4 = this.f315050h;
                                    gVar4.getClass();
                                    fVar3 = l16.g.d(gVar4);
                                }
                                l16.g gVar5 = (l16.g) hVar.g(l16.g.f315031n, lVar);
                                this.f315050h = gVar5;
                                if (fVar3 != null) {
                                    fVar3.d(gVar5);
                                    this.f315050h = fVar3.c();
                                }
                                this.f315047e |= 4;
                            } else if (n17 == 34) {
                                if ((this.f315047e & 8) == 8) {
                                    l16.g gVar6 = this.f315051i;
                                    gVar6.getClass();
                                    fVar4 = l16.g.d(gVar6);
                                }
                                l16.g gVar7 = (l16.g) hVar.g(l16.g.f315031n, lVar);
                                this.f315051i = gVar7;
                                if (fVar4 != null) {
                                    fVar4.d(gVar7);
                                    this.f315051i = fVar4.c();
                                }
                                this.f315047e |= 8;
                            } else if (n17 != 42) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                if ((this.f315047e & 16) == 16) {
                                    l16.g gVar8 = this.f315052m;
                                    gVar8.getClass();
                                    fVar = l16.g.d(gVar8);
                                }
                                l16.g gVar9 = (l16.g) hVar.g(l16.g.f315031n, lVar);
                                this.f315052m = gVar9;
                                if (fVar != null) {
                                    fVar.d(gVar9);
                                    this.f315052m = fVar.c();
                                }
                                this.f315047e |= 16;
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
                    this.f315046d = m17.c();
                    throw th7;
                }
                this.f315046d = m17.c();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f315046d = m17.c();
            throw th8;
        }
        this.f315046d = m17.c();
    }
}
