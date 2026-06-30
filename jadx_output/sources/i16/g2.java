package i16;

/* loaded from: classes16.dex */
public final class g2 extends p16.v implements p16.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i16.g2 f287464h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.j0 f287465i = new i16.e2();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287466d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f287467e;

    /* renamed from: f, reason: collision with root package name */
    public byte f287468f;

    /* renamed from: g, reason: collision with root package name */
    public int f287469g;

    static {
        i16.g2 g2Var = new i16.g2(true);
        f287464h = g2Var;
        g2Var.f287467e = java.util.Collections.emptyList();
    }

    public g2(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287468f = (byte) -1;
        this.f287469g = -1;
        this.f287466d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        for (int i17 = 0; i17 < this.f287467e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f287467e.get(i17));
        }
        jVar.r(this.f287466d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287469g;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f287467e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f287467e.get(i19));
        }
        int size = i18 + this.f287466d.size();
        this.f287469g = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287468f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f287468f = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.f2();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.f2 f2Var = new i16.f2();
        f2Var.d(this);
        return f2Var;
    }

    public g2(boolean z17) {
        this.f287468f = (byte) -1;
        this.f287469g = -1;
        this.f287466d = p16.g.f351283d;
    }

    public g2(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287468f = (byte) -1;
        this.f287469g = -1;
        this.f287467e = java.util.Collections.emptyList();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 != 10) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            if (!(z18 & true)) {
                                this.f287467e = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f287467e.add(hVar.g(i16.d2.f287392r, lVar));
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
                    this.f287467e = java.util.Collections.unmodifiableList(this.f287467e);
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
            this.f287467e = java.util.Collections.unmodifiableList(this.f287467e);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
