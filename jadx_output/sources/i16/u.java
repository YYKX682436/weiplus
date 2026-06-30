package i16;

/* loaded from: classes16.dex */
public final class u extends p16.v implements p16.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i16.u f287755h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.j0 f287756i = new i16.s();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287757d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f287758e;

    /* renamed from: f, reason: collision with root package name */
    public byte f287759f;

    /* renamed from: g, reason: collision with root package name */
    public int f287760g;

    static {
        i16.u uVar = new i16.u(true);
        f287755h = uVar;
        uVar.f287758e = java.util.Collections.emptyList();
    }

    public u(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287759f = (byte) -1;
        this.f287760g = -1;
        this.f287757d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        for (int i17 = 0; i17 < this.f287758e.size(); i17++) {
            jVar.o(1, (p16.h0) this.f287758e.get(i17));
        }
        jVar.r(this.f287757d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287760g;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f287758e.size(); i19++) {
            i18 += p16.j.d(1, (p16.h0) this.f287758e.get(i19));
        }
        int size = i18 + this.f287757d.size();
        this.f287760g = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287759f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f287758e.size(); i17++) {
            if (!((i16.z) this.f287758e.get(i17)).isInitialized()) {
                this.f287759f = (byte) 0;
                return false;
            }
        }
        this.f287759f = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.t();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.t tVar = new i16.t();
        tVar.d(this);
        return tVar;
    }

    public u(boolean z17) {
        this.f287759f = (byte) -1;
        this.f287760g = -1;
        this.f287757d = p16.g.f351283d;
    }

    public u(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287759f = (byte) -1;
        this.f287760g = -1;
        this.f287758e = java.util.Collections.emptyList();
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
                                this.f287758e = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f287758e.add(hVar.g(i16.z.f287832p, lVar));
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
                    this.f287758e = java.util.Collections.unmodifiableList(this.f287758e);
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
            this.f287758e = java.util.Collections.unmodifiableList(this.f287758e);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
