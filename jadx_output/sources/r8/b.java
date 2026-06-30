package r8;

/* loaded from: classes15.dex */
public final class b implements q8.e, q8.m {

    /* renamed from: n, reason: collision with root package name */
    public static final int f393266n = t9.d0.f("FLV");

    /* renamed from: e, reason: collision with root package name */
    public q8.g f393271e;

    /* renamed from: g, reason: collision with root package name */
    public int f393273g;

    /* renamed from: h, reason: collision with root package name */
    public int f393274h;

    /* renamed from: i, reason: collision with root package name */
    public int f393275i;

    /* renamed from: j, reason: collision with root package name */
    public long f393276j;

    /* renamed from: k, reason: collision with root package name */
    public r8.a f393277k;

    /* renamed from: l, reason: collision with root package name */
    public r8.f f393278l;

    /* renamed from: m, reason: collision with root package name */
    public r8.c f393279m;

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f393267a = new t9.p(4);

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f393268b = new t9.p(9);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f393269c = new t9.p(11);

    /* renamed from: d, reason: collision with root package name */
    public final t9.p f393270d = new t9.p();

    /* renamed from: f, reason: collision with root package name */
    public int f393272f = 1;

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        r8.c cVar;
        r8.f fVar2;
        r8.a aVar;
        while (true) {
            int i17 = this.f393272f;
            boolean z17 = true;
            if (i17 == 1) {
                t9.p pVar = this.f393268b;
                if (((q8.b) fVar).e(pVar.f416540a, 0, 9, true)) {
                    pVar.w(0);
                    pVar.x(4);
                    int m17 = pVar.m();
                    boolean z18 = (m17 & 4) != 0;
                    boolean z19 = (m17 & 1) != 0;
                    if (z18 && this.f393277k == null) {
                        this.f393277k = new r8.a(this.f393271e.l(8, 1));
                    }
                    if (z19 && this.f393278l == null) {
                        this.f393278l = new r8.f(this.f393271e.l(9, 2));
                    }
                    if (this.f393279m == null) {
                        this.f393279m = new r8.c(null);
                    }
                    this.f393271e.j();
                    this.f393271e.b(this);
                    this.f393273g = (pVar.c() - 9) + 4;
                    this.f393272f = 2;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else if (i17 == 2) {
                ((q8.b) fVar).f(this.f393273g);
                this.f393273g = 0;
                this.f393272f = 3;
            } else if (i17 == 3) {
                t9.p pVar2 = this.f393269c;
                if (((q8.b) fVar).e(pVar2.f416540a, 0, 11, true)) {
                    pVar2.w(0);
                    this.f393274h = pVar2.m();
                    this.f393275i = pVar2.o();
                    this.f393276j = pVar2.o();
                    this.f393276j = ((pVar2.m() << 24) | this.f393276j) * 1000;
                    pVar2.x(3);
                    this.f393272f = 4;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else if (i17 == 4) {
                int i18 = this.f393274h;
                if (i18 == 8 && (aVar = this.f393277k) != null) {
                    t9.p h17 = h(fVar);
                    long j17 = this.f393276j;
                    aVar.a(h17);
                    aVar.b(h17, j17);
                } else if (i18 == 9 && (fVar2 = this.f393278l) != null) {
                    t9.p h18 = h(fVar);
                    long j18 = this.f393276j;
                    if (fVar2.a(h18)) {
                        fVar2.b(h18, j18);
                    }
                } else if (i18 != 18 || (cVar = this.f393279m) == null) {
                    ((q8.b) fVar).f(this.f393275i);
                    z17 = false;
                } else {
                    cVar.a(h(fVar), this.f393276j);
                }
                this.f393273g = 4;
                this.f393272f = 2;
                if (z17) {
                    return 0;
                }
            } else {
                continue;
            }
        }
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f393271e = gVar;
    }

    @Override // q8.m
    public boolean c() {
        return false;
    }

    @Override // q8.m
    public long d(long j17) {
        return 0L;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        t9.p pVar = this.f393267a;
        ((q8.b) fVar).b(pVar.f416540a, 0, 3, false);
        pVar.w(0);
        if (pVar.o() != f393266n) {
            return false;
        }
        q8.b bVar = (q8.b) fVar;
        bVar.b(pVar.f416540a, 0, 2, false);
        pVar.w(0);
        if ((pVar.r() & 250) != 0) {
            return false;
        }
        bVar.b(pVar.f416540a, 0, 4, false);
        pVar.w(0);
        int c17 = pVar.c();
        bVar.f360620e = 0;
        bVar.a(c17, false);
        bVar.b(pVar.f416540a, 0, 4, false);
        pVar.w(0);
        return pVar.c() == 0;
    }

    @Override // q8.m
    public long g() {
        return this.f393279m.f393280b;
    }

    public final t9.p h(q8.f fVar) {
        int i17 = this.f393275i;
        t9.p pVar = this.f393270d;
        if (i17 > pVar.a()) {
            pVar.u(new byte[java.lang.Math.max(pVar.a() * 2, this.f393275i)], 0);
        } else {
            pVar.w(0);
        }
        pVar.v(this.f393275i);
        ((q8.b) fVar).e(pVar.f416540a, 0, this.f393275i, false);
        return pVar;
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        this.f393272f = 1;
        this.f393273g = 0;
    }
}
