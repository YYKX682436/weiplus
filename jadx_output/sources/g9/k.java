package g9;

/* loaded from: classes15.dex */
public final class k implements d9.a0, h9.m {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f269616a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.g f269617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f269618c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.g f269619d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.h0 f269620e;

    /* renamed from: f, reason: collision with root package name */
    public h9.n f269621f;

    /* renamed from: g, reason: collision with root package name */
    public d9.y f269622g;

    static {
        java.util.HashSet hashSet = m8.q.f324664a;
        synchronized (m8.q.class) {
            if (m8.q.f324664a.add("goog.exo.hls")) {
                m8.q.f324665b += ", goog.exo.hls";
            }
        }
    }

    public k(android.net.Uri uri, r9.j jVar, android.os.Handler handler, d9.h hVar) {
        g9.b bVar = new g9.b(jVar);
        h9.g gVar = new h9.g();
        this.f269616a = uri;
        this.f269617b = bVar;
        this.f269618c = 3;
        this.f269620e = gVar;
        this.f269619d = new d9.g(handler, hVar);
    }

    @Override // d9.a0
    public void a(m8.i iVar, boolean z17, d9.y yVar) {
        t9.a.d(this.f269621f == null);
        android.net.Uri uri = this.f269616a;
        g9.g gVar = this.f269617b;
        d9.g gVar2 = this.f269619d;
        int i17 = this.f269618c;
        r9.h0 h0Var = this.f269620e;
        h9.n nVar = new h9.n(uri, gVar, gVar2, i17, this, h0Var);
        this.f269621f = nVar;
        this.f269622g = yVar;
        nVar.f279665n.d(new r9.i0(((g9.b) gVar).f269561a.createDataSource(), uri, 4, h0Var), nVar, i17);
    }

    @Override // d9.a0
    public void b(d9.x xVar) {
        g9.j jVar = (g9.j) xVar;
        ((java.util.ArrayList) jVar.f269602d.f279664m).remove(jVar);
        jVar.f269609n.removeCallbacksAndMessages(null);
        for (g9.o oVar : jVar.f269613r) {
            boolean c17 = oVar.f269632m.c(oVar);
            if (oVar.f269641v && !c17) {
                for (d9.f0 f0Var : oVar.f269638s) {
                    f0Var.h();
                }
            }
            oVar.f269637r.removeCallbacksAndMessages(null);
            oVar.f269644y = true;
        }
    }

    @Override // d9.a0
    public void c() {
        h9.n nVar = this.f269621f;
        nVar.f279665n.b();
        h9.a aVar = nVar.f279668q;
        if (aVar != null) {
            h9.i iVar = (h9.i) nVar.f279661g.get(aVar);
            iVar.f279648e.b();
            java.io.IOException iOException = iVar.f279656p;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // d9.a0
    public d9.x d(d9.z zVar, r9.b bVar) {
        t9.a.a(zVar.f227427a == 0);
        return new g9.j(this.f269621f, this.f269617b, this.f269618c, this.f269619d, bVar);
    }

    @Override // d9.a0
    public void e() {
        h9.n nVar = this.f269621f;
        if (nVar != null) {
            nVar.f279665n.c(null);
            java.util.IdentityHashMap identityHashMap = nVar.f279661g;
            java.util.Iterator it = identityHashMap.values().iterator();
            while (it.hasNext()) {
                ((h9.i) it.next()).f279648e.c(null);
            }
            nVar.f279662h.removeCallbacksAndMessages(null);
            identityHashMap.clear();
            this.f269621f = null;
        }
        this.f269622g = null;
    }
}
