package l16;

/* loaded from: classes16.dex */
public final class d extends p16.v implements p16.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final l16.d f315019m;

    /* renamed from: n, reason: collision with root package name */
    public static final p16.j0 f315020n = new l16.b();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f315021d;

    /* renamed from: e, reason: collision with root package name */
    public int f315022e;

    /* renamed from: f, reason: collision with root package name */
    public int f315023f;

    /* renamed from: g, reason: collision with root package name */
    public int f315024g;

    /* renamed from: h, reason: collision with root package name */
    public byte f315025h;

    /* renamed from: i, reason: collision with root package name */
    public int f315026i;

    static {
        l16.d dVar = new l16.d(true);
        f315019m = dVar;
        dVar.f315023f = 0;
        dVar.f315024g = 0;
    }

    public d(p16.p pVar, l16.a aVar) {
        super(pVar);
        this.f315025h = (byte) -1;
        this.f315026i = -1;
        this.f315021d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f315022e & 1) == 1) {
            jVar.m(1, this.f315023f);
        }
        if ((this.f315022e & 2) == 2) {
            jVar.m(2, this.f315024g);
        }
        jVar.r(this.f315021d);
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f315026i;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f315022e & 1) == 1 ? 0 + p16.j.b(1, this.f315023f) : 0;
        if ((this.f315022e & 2) == 2) {
            b17 += p16.j.b(2, this.f315024g);
        }
        int size = b17 + this.f315021d.size();
        this.f315026i = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f315025h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f315025h = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new l16.c();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        l16.c cVar = new l16.c();
        cVar.d(this);
        return cVar;
    }

    public d(boolean z17) {
        this.f315025h = (byte) -1;
        this.f315026i = -1;
        this.f315021d = p16.g.f351283d;
    }

    public d(p16.h hVar, p16.l lVar, l16.a aVar) {
        this.f315025h = (byte) -1;
        this.f315026i = -1;
        boolean z17 = false;
        this.f315023f = 0;
        this.f315024g = 0;
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f315022e |= 1;
                            this.f315023f = hVar.k();
                        } else if (n17 != 16) {
                            if (!hVar.q(n17, j17)) {
                            }
                        } else {
                            this.f315022e |= 2;
                            this.f315024g = hVar.k();
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                    } catch (java.lang.Throwable th7) {
                        this.f315021d = m17.c();
                        throw th7;
                    }
                    this.f315021d = m17.c();
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
            this.f315021d = m17.c();
            throw th8;
        }
        this.f315021d = m17.c();
    }
}
