package l16;

/* loaded from: classes16.dex */
public final class p extends p16.v implements p16.i0 {

    /* renamed from: s, reason: collision with root package name */
    public static final l16.p f315070s;

    /* renamed from: t, reason: collision with root package name */
    public static final p16.j0 f315071t = new l16.m();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f315072d;

    /* renamed from: e, reason: collision with root package name */
    public int f315073e;

    /* renamed from: f, reason: collision with root package name */
    public int f315074f;

    /* renamed from: g, reason: collision with root package name */
    public int f315075g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f315076h;

    /* renamed from: i, reason: collision with root package name */
    public l16.o f315077i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f315078m;

    /* renamed from: n, reason: collision with root package name */
    public int f315079n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f315080o;

    /* renamed from: p, reason: collision with root package name */
    public int f315081p;

    /* renamed from: q, reason: collision with root package name */
    public byte f315082q;

    /* renamed from: r, reason: collision with root package name */
    public int f315083r;

    static {
        l16.p pVar = new l16.p(true);
        f315070s = pVar;
        pVar.f315074f = 1;
        pVar.f315075g = 0;
        pVar.f315076h = "";
        pVar.f315077i = l16.o.NONE;
        pVar.f315078m = java.util.Collections.emptyList();
        pVar.f315080o = java.util.Collections.emptyList();
    }

    public p(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f315079n = -1;
        this.f315081p = -1;
        this.f315082q = (byte) -1;
        this.f315083r = -1;
        this.f315072d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        p16.g gVar;
        getSerializedSize();
        if ((this.f315073e & 1) == 1) {
            jVar.m(1, this.f315074f);
        }
        if ((this.f315073e & 2) == 2) {
            jVar.m(2, this.f315075g);
        }
        if ((this.f315073e & 8) == 8) {
            jVar.l(3, this.f315077i.f315069d);
        }
        if (this.f315078m.size() > 0) {
            jVar.v(34);
            jVar.v(this.f315079n);
        }
        for (int i17 = 0; i17 < this.f315078m.size(); i17++) {
            jVar.n(((java.lang.Integer) this.f315078m.get(i17)).intValue());
        }
        if (this.f315080o.size() > 0) {
            jVar.v(42);
            jVar.v(this.f315081p);
        }
        for (int i18 = 0; i18 < this.f315080o.size(); i18++) {
            jVar.n(((java.lang.Integer) this.f315080o.get(i18)).intValue());
        }
        if ((this.f315073e & 4) == 4) {
            java.lang.Object obj = this.f315076h;
            if (obj instanceof java.lang.String) {
                try {
                    gVar = new p16.f0(((java.lang.String) obj).getBytes(com.tencent.mapsdk.internal.rv.f51270c));
                    this.f315076h = gVar;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            } else {
                gVar = (p16.g) obj;
            }
            jVar.x(6, 2);
            jVar.v(gVar.size());
            jVar.r(gVar);
        }
        jVar.r(this.f315072d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        p16.g gVar;
        int i17 = this.f315083r;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f315073e & 1) == 1 ? p16.j.b(1, this.f315074f) + 0 : 0;
        if ((this.f315073e & 2) == 2) {
            b17 += p16.j.b(2, this.f315075g);
        }
        if ((this.f315073e & 8) == 8) {
            b17 += p16.j.a(3, this.f315077i.f315069d);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f315078m.size(); i19++) {
            i18 += p16.j.c(((java.lang.Integer) this.f315078m.get(i19)).intValue());
        }
        int i27 = b17 + i18;
        if (!this.f315078m.isEmpty()) {
            i27 = i27 + 1 + p16.j.c(i18);
        }
        this.f315079n = i18;
        int i28 = 0;
        for (int i29 = 0; i29 < this.f315080o.size(); i29++) {
            i28 += p16.j.c(((java.lang.Integer) this.f315080o.get(i29)).intValue());
        }
        int i37 = i27 + i28;
        if (!this.f315080o.isEmpty()) {
            i37 = i37 + 1 + p16.j.c(i28);
        }
        this.f315081p = i28;
        if ((this.f315073e & 4) == 4) {
            java.lang.Object obj = this.f315076h;
            if (obj instanceof java.lang.String) {
                try {
                    gVar = new p16.f0(((java.lang.String) obj).getBytes(com.tencent.mapsdk.internal.rv.f51270c));
                    this.f315076h = gVar;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            } else {
                gVar = (p16.g) obj;
            }
            i37 += p16.j.h(6) + p16.j.f(gVar.size()) + gVar.size();
        }
        int size = i37 + this.f315072d.size();
        this.f315083r = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f315082q;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f315082q = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new l16.n();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        l16.n nVar = new l16.n();
        nVar.d(this);
        return nVar;
    }

    public p(boolean z17) {
        this.f315079n = -1;
        this.f315081p = -1;
        this.f315082q = (byte) -1;
        this.f315083r = -1;
        this.f315072d = p16.g.f351283d;
    }

    public p(p16.h hVar, p16.l lVar, l16.a aVar) {
        l16.o oVar;
        this.f315079n = -1;
        this.f315081p = -1;
        this.f315082q = (byte) -1;
        this.f315083r = -1;
        this.f315074f = 1;
        boolean z17 = false;
        this.f315075g = 0;
        this.f315076h = "";
        l16.o oVar2 = l16.o.NONE;
        this.f315077i = oVar2;
        this.f315078m = java.util.Collections.emptyList();
        this.f315080o = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f315073e |= 1;
                            this.f315074f = hVar.k();
                        } else if (n17 == 16) {
                            this.f315073e |= 2;
                            this.f315075g = hVar.k();
                        } else if (n17 == 24) {
                            int k17 = hVar.k();
                            if (k17 == 0) {
                                oVar = oVar2;
                            } else if (k17 != 1) {
                                oVar = k17 != 2 ? null : l16.o.DESC_TO_CLASS_ID;
                            } else {
                                oVar = l16.o.INTERNAL_TO_CLASS_ID;
                            }
                            if (oVar == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f315073e |= 8;
                                this.f315077i = oVar;
                            }
                        } else if (n17 == 32) {
                            if ((i17 & 16) != 16) {
                                this.f315078m = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            this.f315078m.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 == 34) {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 16) != 16 && hVar.b() > 0) {
                                this.f315078m = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            while (hVar.b() > 0) {
                                this.f315078m.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        } else if (n17 == 40) {
                            if ((i17 & 32) != 32) {
                                this.f315080o = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            this.f315080o.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 == 42) {
                            int d18 = hVar.d(hVar.k());
                            if ((i17 & 32) != 32 && hVar.b() > 0) {
                                this.f315080o = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            while (hVar.b() > 0) {
                                this.f315080o.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d18);
                        } else if (n17 != 50) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            p16.g e17 = hVar.e();
                            this.f315073e |= 4;
                            this.f315076h = e17;
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 16) == 16) {
                        this.f315078m = java.util.Collections.unmodifiableList(this.f315078m);
                    }
                    if ((i17 & 32) == 32) {
                        this.f315080o = java.util.Collections.unmodifiableList(this.f315080o);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
                    }
                }
            } catch (p16.z e18) {
                e18.f351371d = this;
                throw e18;
            } catch (java.io.IOException e19) {
                p16.z zVar = new p16.z(e19.getMessage());
                zVar.f351371d = this;
                throw zVar;
            }
        }
        if ((i17 & 16) == 16) {
            this.f315078m = java.util.Collections.unmodifiableList(this.f315078m);
        }
        if ((i17 & 32) == 32) {
            this.f315080o = java.util.Collections.unmodifiableList(this.f315080o);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
