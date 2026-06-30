package i16;

/* loaded from: classes16.dex */
public final class v1 extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.v1 f287783m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f287784n = new i16.t1();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287785d;

    /* renamed from: e, reason: collision with root package name */
    public int f287786e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f287787f;

    /* renamed from: g, reason: collision with root package name */
    public int f287788g;

    /* renamed from: h, reason: collision with root package name */
    public byte f287789h;

    /* renamed from: i, reason: collision with root package name */
    public int f287790i;

    static {
        i16.v1 v1Var = new i16.v1(true);
        f287783m = v1Var;
        v1Var.f287787f = java.util.Collections.emptyList();
        v1Var.f287788g = -1;
    }

    public v1(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287789h = (byte) -1;
        this.f287790i = -1;
        this.f287785d = pVar.f351337d;
    }

    public static i16.u1 d(i16.v1 v1Var) {
        i16.u1 u1Var = new i16.u1();
        u1Var.d(v1Var);
        return u1Var;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        for (int i17 = 0; i17 < this.f287787f.size(); i17++) {
            jVar.o(1, (p16.h0) this.f287787f.get(i17));
        }
        if ((this.f287786e & 1) == 1) {
            jVar.m(2, this.f287788g);
        }
        jVar.r(this.f287785d);
    }

    public i16.u1 e() {
        return d(this);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287790i;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f287787f.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f287787f.get(i19));
        }
        if ((this.f287786e & 1) == 1) {
            i18 += p16.j.b(2, this.f287788g);
        }
        int size = i18 + this.f287785d.size();
        this.f287790i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287789h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f287787f.size(); i17++) {
            if (!((i16.l1) this.f287787f.get(i17)).isInitialized()) {
                this.f287789h = (byte) 0;
                return false;
            }
        }
        this.f287789h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.u1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        return d(this);
    }

    public v1(boolean z17) {
        this.f287789h = (byte) -1;
        this.f287790i = -1;
        this.f287785d = p16.g.f351283d;
    }

    public v1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287789h = (byte) -1;
        this.f287790i = -1;
        this.f287787f = java.util.Collections.emptyList();
        this.f287788g = -1;
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 10) {
                            if (!(z18 & true)) {
                                this.f287787f = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f287787f.add(hVar.g(i16.l1.A, lVar));
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f287786e |= 1;
                            this.f287788g = hVar.k();
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
                    this.f287787f = java.util.Collections.unmodifiableList(this.f287787f);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused) {
                    throw th6;
                } finally {
                }
            }
        }
        if (z18 & true) {
            this.f287787f = java.util.Collections.unmodifiableList(this.f287787f);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
