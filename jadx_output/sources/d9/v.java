package d9;

/* loaded from: classes15.dex */
public final class v implements d9.a0, d9.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f227418a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.j f227419b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.h f227420c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f227421d;

    /* renamed from: e, reason: collision with root package name */
    public final d9.u f227422e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f227423f;

    /* renamed from: g, reason: collision with root package name */
    public d9.y f227424g;

    /* renamed from: h, reason: collision with root package name */
    public long f227425h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f227426i;

    public v(android.net.Uri uri, r9.j jVar, q8.h hVar, android.os.Handler handler, d9.u uVar) {
        this(uri, jVar, hVar, handler, uVar, null);
    }

    @Override // d9.a0
    public void a(m8.i iVar, boolean z17, d9.y yVar) {
        this.f227424g = yVar;
        f(-9223372036854775807L, false);
    }

    @Override // d9.a0
    public void b(d9.x xVar) {
        d9.t tVar = (d9.t) xVar;
        boolean c17 = tVar.f227407p.c(tVar);
        if (tVar.A && !c17) {
            for (d9.f0 f0Var : tVar.f227415x) {
                f0Var.h();
            }
        }
        tVar.f227412u.removeCallbacksAndMessages(null);
        tVar.P = true;
    }

    @Override // d9.a0
    public void c() {
    }

    @Override // d9.a0
    public d9.x d(d9.z zVar, r9.b bVar) {
        t9.a.a(zVar.f227427a == 0);
        return new d9.t(this.f227418a, this.f227419b.createDataSource(), this.f227420c.a(), -1, this.f227421d, this.f227422e, this, bVar, this.f227423f, 1048576);
    }

    @Override // d9.a0
    public void e() {
        this.f227424g = null;
    }

    public final void f(long j17, boolean z17) {
        this.f227425h = j17;
        this.f227426i = z17;
        d9.y yVar = this.f227424g;
        long j18 = this.f227425h;
        ((m8.p) yVar).f324649i.obtainMessage(7, android.util.Pair.create(new d9.j0(-9223372036854775807L, -9223372036854775807L, j18, j18, 0L, 0L, this.f227426i, false), null)).sendToTarget();
    }

    public void g(long j17, boolean z17) {
        if (j17 == -9223372036854775807L) {
            j17 = this.f227425h;
        }
        long j18 = this.f227425h;
        if (j18 == j17 && this.f227426i == z17) {
            return;
        }
        if (j18 == -9223372036854775807L || j17 != -9223372036854775807L) {
            f(j17, z17);
        }
    }

    public v(android.net.Uri uri, r9.j jVar, q8.h hVar, android.os.Handler handler, d9.u uVar, java.lang.String str) {
        this.f227418a = uri;
        this.f227419b = jVar;
        this.f227420c = hVar;
        this.f227421d = handler;
        this.f227422e = uVar;
        this.f227423f = str;
    }
}
