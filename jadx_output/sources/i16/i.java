package i16;

/* loaded from: classes16.dex */
public final class i extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.i f287493m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f287494n = new i16.c();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287495d;

    /* renamed from: e, reason: collision with root package name */
    public int f287496e;

    /* renamed from: f, reason: collision with root package name */
    public int f287497f;

    /* renamed from: g, reason: collision with root package name */
    public i16.h f287498g;

    /* renamed from: h, reason: collision with root package name */
    public byte f287499h;

    /* renamed from: i, reason: collision with root package name */
    public int f287500i;

    static {
        i16.i iVar = new i16.i(true);
        f287493m = iVar;
        iVar.f287497f = 0;
        iVar.f287498g = i16.h.f287470v;
    }

    public i(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287499h = (byte) -1;
        this.f287500i = -1;
        this.f287495d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287496e & 1) == 1) {
            jVar.m(1, this.f287497f);
        }
        if ((this.f287496e & 2) == 2) {
            jVar.o(2, this.f287498g);
        }
        jVar.r(this.f287495d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287500i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287496e & 1) == 1 ? 0 + p16.j.b(1, this.f287497f) : 0;
        if ((this.f287496e & 2) == 2) {
            b17 += p16.j.d(2, this.f287498g);
        }
        int size = b17 + this.f287495d.size();
        this.f287500i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287499h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f287496e;
        if (!((i17 & 1) == 1)) {
            this.f287499h = (byte) 0;
            return false;
        }
        if (!((i17 & 2) == 2)) {
            this.f287499h = (byte) 0;
            return false;
        }
        if (this.f287498g.isInitialized()) {
            this.f287499h = (byte) 1;
            return true;
        }
        this.f287499h = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.d();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.d dVar = new i16.d();
        dVar.d(this);
        return dVar;
    }

    public i(boolean z17) {
        this.f287499h = (byte) -1;
        this.f287500i = -1;
        this.f287495d = p16.g.f351283d;
    }

    public i(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.f fVar;
        this.f287499h = (byte) -1;
        this.f287500i = -1;
        boolean z17 = false;
        this.f287497f = 0;
        this.f287498g = i16.h.f287470v;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    try {
                        int n17 = hVar.n();
                        if (n17 != 0) {
                            if (n17 == 8) {
                                this.f287496e |= 1;
                                this.f287497f = hVar.k();
                            } else if (n17 != 18) {
                                if (!hVar.q(n17, j17)) {
                                }
                            } else {
                                if ((this.f287496e & 2) == 2) {
                                    i16.h hVar2 = this.f287498g;
                                    hVar2.getClass();
                                    fVar = new i16.f();
                                    fVar.d(hVar2);
                                } else {
                                    fVar = null;
                                }
                                i16.h hVar3 = (i16.h) hVar.g(i16.h.f287471w, lVar);
                                this.f287498g = hVar3;
                                if (fVar != null) {
                                    fVar.d(hVar3);
                                    this.f287498g = fVar.c();
                                }
                                this.f287496e |= 2;
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
                    this.f287495d = m17.c();
                    throw th7;
                }
                this.f287495d = m17.c();
                throw th6;
            }
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th8) {
            this.f287495d = m17.c();
            throw th8;
        }
        this.f287495d = m17.c();
    }
}
