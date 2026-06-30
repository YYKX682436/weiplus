package t56;

/* loaded from: classes16.dex */
public final class j extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final u56.o f415889d;

    /* renamed from: e, reason: collision with root package name */
    public final a66.c f415890e;

    /* renamed from: f, reason: collision with root package name */
    public final u56.o f415891f;

    /* renamed from: g, reason: collision with root package name */
    public final t56.l f415892g;

    public j(t56.l lVar) {
        u56.o oVar = new u56.o();
        this.f415889d = oVar;
        a66.c cVar = new a66.c();
        this.f415890e = cVar;
        this.f415891f = new u56.o(oVar, cVar);
        this.f415892g = lVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415891f.f424839e;
    }

    @Override // p56.s
    public void c() {
        this.f415891f.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        if (this.f415891f.f424839e) {
            return a66.g.f1801a;
        }
        t56.l lVar = this.f415892g;
        t56.h hVar = new t56.h(this, aVar);
        u56.o oVar = this.f415889d;
        lVar.getClass();
        t56.c0 c0Var = new t56.c0(x56.m.c(hVar), oVar);
        oVar.a(c0Var);
        c0Var.f415862d.a(new t56.z(c0Var, lVar.f415949d.submit(c0Var)));
        return c0Var;
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f415891f.f424839e) {
            return a66.g.f1801a;
        }
        t56.l lVar = this.f415892g;
        t56.i iVar = new t56.i(this, aVar);
        a66.c cVar = this.f415890e;
        lVar.getClass();
        t56.c0 c0Var = new t56.c0(x56.m.c(iVar), cVar);
        cVar.a(c0Var);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = lVar.f415949d;
        c0Var.f415862d.a(new t56.z(c0Var, j17 <= 0 ? scheduledExecutorService.submit(c0Var) : scheduledExecutorService.schedule(c0Var, j17, timeUnit)));
        return c0Var;
    }
}
