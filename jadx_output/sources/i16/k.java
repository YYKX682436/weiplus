package i16;

/* loaded from: classes16.dex */
public final class k extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.k f287553m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f287554n = new i16.b();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287555d;

    /* renamed from: e, reason: collision with root package name */
    public int f287556e;

    /* renamed from: f, reason: collision with root package name */
    public int f287557f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f287558g;

    /* renamed from: h, reason: collision with root package name */
    public byte f287559h;

    /* renamed from: i, reason: collision with root package name */
    public int f287560i;

    static {
        i16.k kVar = new i16.k(true);
        f287553m = kVar;
        kVar.f287557f = 0;
        kVar.f287558g = java.util.Collections.emptyList();
    }

    public k(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287559h = (byte) -1;
        this.f287560i = -1;
        this.f287555d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287556e & 1) == 1) {
            jVar.m(1, this.f287557f);
        }
        for (int i17 = 0; i17 < this.f287558g.size(); i17++) {
            jVar.o(2, (p16.h0) this.f287558g.get(i17));
        }
        jVar.r(this.f287555d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287560i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287556e & 1) == 1 ? p16.j.b(1, this.f287557f) + 0 : 0;
        for (int i18 = 0; i18 < this.f287558g.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f287558g.get(i18));
        }
        int size = b17 + this.f287555d.size();
        this.f287560i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287559h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f287556e & 1) == 1)) {
            this.f287559h = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f287558g.size(); i17++) {
            if (!((i16.i) this.f287558g.get(i17)).isInitialized()) {
                this.f287559h = (byte) 0;
                return false;
            }
        }
        this.f287559h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.j();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.j jVar = new i16.j();
        jVar.d(this);
        return jVar;
    }

    public k(boolean z17) {
        this.f287559h = (byte) -1;
        this.f287560i = -1;
        this.f287555d = p16.g.f351283d;
    }

    public k(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287559h = (byte) -1;
        this.f287560i = -1;
        boolean z17 = false;
        this.f287557f = 0;
        this.f287558g = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f287556e |= 1;
                            this.f287557f = hVar.k();
                        } else if (n17 != 18) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            if ((i17 & 2) != 2) {
                                this.f287558g = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f287558g.add(hVar.g(i16.i.f287494n, lVar));
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
                if ((i17 & 2) == 2) {
                    this.f287558g = java.util.Collections.unmodifiableList(this.f287558g);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if ((i17 & 2) == 2) {
            this.f287558g = java.util.Collections.unmodifiableList(this.f287558g);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
