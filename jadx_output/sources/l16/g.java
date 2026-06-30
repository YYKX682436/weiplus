package l16;

/* loaded from: classes16.dex */
public final class g extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.g f315030m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f315031n = new l16.e();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f315032d;

    /* renamed from: e, reason: collision with root package name */
    public int f315033e;

    /* renamed from: f, reason: collision with root package name */
    public int f315034f;

    /* renamed from: g, reason: collision with root package name */
    public int f315035g;

    /* renamed from: h, reason: collision with root package name */
    public byte f315036h;

    /* renamed from: i, reason: collision with root package name */
    public int f315037i;

    static {
        l16.g gVar = new l16.g(true);
        f315030m = gVar;
        gVar.f315034f = 0;
        gVar.f315035g = 0;
    }

    public g(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f315036h = (byte) -1;
        this.f315037i = -1;
        this.f315032d = pVar.f351337d;
    }

    public static l16.f d(l16.g gVar) {
        l16.f fVar = new l16.f();
        fVar.d(gVar);
        return fVar;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f315033e & 1) == 1) {
            jVar.m(1, this.f315034f);
        }
        if ((this.f315033e & 2) == 2) {
            jVar.m(2, this.f315035g);
        }
        jVar.r(this.f315032d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f315037i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f315033e & 1) == 1 ? 0 + p16.j.b(1, this.f315034f) : 0;
        if ((this.f315033e & 2) == 2) {
            b17 += p16.j.b(2, this.f315035g);
        }
        int size = b17 + this.f315032d.size();
        this.f315037i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f315036h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f315036h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new l16.f();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        return d(this);
    }

    public g(boolean z17) {
        this.f315036h = (byte) -1;
        this.f315037i = -1;
        this.f315032d = p16.g.f351283d;
    }

    public g(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f315036h = (byte) -1;
        this.f315037i = -1;
        boolean z17 = false;
        this.f315034f = 0;
        this.f315035g = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f315033e |= 1;
                            this.f315034f = hVar.k();
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f315033e |= 2;
                            this.f315035g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f315032d = m17.c();
                        throw th7;
                    }
                    this.f315032d = m17.c();
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
            this.f315032d = m17.c();
            throw th8;
        }
        this.f315032d = m17.c();
    }
}
