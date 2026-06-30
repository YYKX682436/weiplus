package d9;

/* loaded from: classes15.dex */
public final class p implements r9.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f227382a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f227383b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.q f227384c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.g f227385d;

    /* renamed from: e, reason: collision with root package name */
    public final q8.k f227386e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f227387f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f227388g;

    /* renamed from: h, reason: collision with root package name */
    public long f227389h;

    /* renamed from: i, reason: collision with root package name */
    public long f227390i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d9.t f227391j;

    public p(d9.t tVar, android.net.Uri uri, r9.k kVar, d9.q qVar, t9.g gVar) {
        this.f227391j = tVar;
        uri.getClass();
        this.f227382a = uri;
        kVar.getClass();
        this.f227383b = kVar;
        qVar.getClass();
        this.f227384c = qVar;
        this.f227385d = gVar;
        this.f227386e = new q8.k();
        this.f227388g = true;
        this.f227390i = -1L;
    }

    @Override // r9.c0
    public void a() {
        q8.b bVar;
        int i17 = 0;
        while (i17 == 0 && !this.f227387f) {
            try {
                long j17 = this.f227386e.f360640a;
                long b17 = this.f227383b.b(new r9.n(this.f227382a, j17, -1L, this.f227391j.f227405n));
                this.f227390i = b17;
                if (b17 != -1) {
                    this.f227390i = b17 + j17;
                }
                r9.k kVar = this.f227383b;
                bVar = new q8.b(kVar, j17, this.f227390i);
                try {
                    q8.e a17 = this.f227384c.a(bVar, kVar.getUri());
                    if (this.f227388g) {
                        a17.seek(j17, this.f227389h);
                        this.f227388g = false;
                    }
                    while (i17 == 0 && !this.f227387f) {
                        t9.g gVar = this.f227385d;
                        synchronized (gVar) {
                            while (!gVar.f416512a) {
                                gVar.wait();
                            }
                        }
                        i17 = a17.a(bVar, this.f227386e);
                        long j18 = bVar.f360618c;
                        if (j18 > this.f227391j.f227406o + j17) {
                            t9.g gVar2 = this.f227385d;
                            synchronized (gVar2) {
                                gVar2.f416512a = false;
                            }
                            d9.t tVar = this.f227391j;
                            tVar.f227412u.post(tVar.f227411t);
                            j17 = j18;
                        }
                    }
                    if (i17 == 1) {
                        i17 = 0;
                    } else {
                        this.f227386e.f360640a = bVar.f360618c;
                    }
                    t9.d0.e(this.f227383b);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (i17 != 1 && bVar != null) {
                        this.f227386e.f360640a = bVar.f360618c;
                    }
                    t9.d0.e(this.f227383b);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                bVar = null;
            }
        }
    }

    @Override // r9.c0
    public boolean b() {
        return this.f227387f;
    }

    @Override // r9.c0
    public void c() {
        this.f227387f = true;
    }
}
