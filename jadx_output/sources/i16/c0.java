package i16;

/* loaded from: classes16.dex */
public final class c0 extends p16.s {

    /* renamed from: m, reason: collision with root package name */
    public static final i16.c0 f287374m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f287375n = new i16.a0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287376e;

    /* renamed from: f, reason: collision with root package name */
    public int f287377f;

    /* renamed from: g, reason: collision with root package name */
    public int f287378g;

    /* renamed from: h, reason: collision with root package name */
    public byte f287379h;

    /* renamed from: i, reason: collision with root package name */
    public int f287380i;

    static {
        i16.c0 c0Var = new i16.c0(true);
        f287374m = c0Var;
        c0Var.f287378g = 0;
    }

    public c0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287379h = (byte) -1;
        this.f287380i = -1;
        this.f287376e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287377f & 1) == 1) {
            jVar.m(1, this.f287378g);
        }
        i17.a(200, jVar);
        jVar.r(this.f287376e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287374m;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287380i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = ((this.f287377f & 1) == 1 ? 0 + p16.j.b(1, this.f287378g) : 0) + e() + this.f287376e.size();
        this.f287380i = b17;
        return b17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287379h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (d()) {
            this.f287379h = (byte) 1;
            return true;
        }
        this.f287379h = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.b0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.b0 b0Var = new i16.b0();
        b0Var.d(this);
        return b0Var;
    }

    public c0(boolean z17) {
        this.f287379h = (byte) -1;
        this.f287380i = -1;
        this.f287376e = p16.g.f351283d;
    }

    public c0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287379h = (byte) -1;
        this.f287380i = -1;
        boolean z17 = false;
        this.f287378g = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 != 8) {
                            if (!j(hVar, j17, lVar, n17)) {
                            }
                        } else {
                            this.f287377f |= 1;
                            this.f287378g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f287376e = m17.c();
                        throw th7;
                    }
                    this.f287376e = m17.c();
                    h();
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
            this.f287376e = m17.c();
            throw th8;
        }
        this.f287376e = m17.c();
        h();
    }
}
