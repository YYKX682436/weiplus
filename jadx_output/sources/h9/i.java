package h9;

/* loaded from: classes15.dex */
public final class i implements r9.a0, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final h9.a f279647d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.g0 f279648e = new r9.g0("HlsPlaylistTracker:MediaPlaylist");

    /* renamed from: f, reason: collision with root package name */
    public final r9.i0 f279649f;

    /* renamed from: g, reason: collision with root package name */
    public h9.d f279650g;

    /* renamed from: h, reason: collision with root package name */
    public long f279651h;

    /* renamed from: i, reason: collision with root package name */
    public long f279652i;

    /* renamed from: m, reason: collision with root package name */
    public long f279653m;

    /* renamed from: n, reason: collision with root package name */
    public long f279654n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279655o;

    /* renamed from: p, reason: collision with root package name */
    public java.io.IOException f279656p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h9.n f279657q;

    public i(h9.n nVar, h9.a aVar) {
        this.f279657q = nVar;
        this.f279647d = aVar;
        this.f279649f = new r9.i0(((g9.b) nVar.f279658d).f269561a.createDataSource(), t9.b0.c(nVar.f279667p.f279620a, aVar.f279590a), 4, nVar.f279659e);
    }

    public final boolean a() {
        h9.a aVar;
        boolean z17;
        int e17;
        this.f279654n = android.os.SystemClock.elapsedRealtime() + 60000;
        h9.n nVar = this.f279657q;
        java.util.ArrayList arrayList = (java.util.ArrayList) nVar.f279664m;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            aVar = this.f279647d;
            if (i17 >= size) {
                break;
            }
            g9.j jVar = (g9.j) ((h9.j) arrayList.get(i17));
            for (g9.o oVar : jVar.f269613r) {
                g9.f fVar = oVar.f269628f;
                int a17 = fVar.f269573f.a(aVar.f279591b);
                if (a17 != -1 && (e17 = ((q9.e) fVar.f269584q).e(a17)) != -1) {
                    ((q9.e) fVar.f269584q).d(e17, 60000L);
                }
            }
            if (jVar.f269612q != null) {
                jVar.f269610o.b(jVar);
            } else {
                g9.o[] oVarArr = jVar.f269613r;
                for (g9.o oVar2 : oVarArr) {
                    if (!oVar2.f269641v) {
                        oVar2.h(oVar2.E);
                    }
                }
            }
            i17++;
        }
        if (nVar.f279668q == aVar) {
            java.util.List list = nVar.f279667p.f279592c;
            int size2 = list.size();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    z17 = false;
                    break;
                }
                h9.i iVar = (h9.i) nVar.f279661g.get(list.get(i18));
                if (elapsedRealtime > iVar.f279654n) {
                    nVar.f279668q = iVar.f279647d;
                    iVar.b();
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (!z17) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        this.f279654n = 0L;
        if (this.f279655o) {
            return;
        }
        r9.g0 g0Var = this.f279648e;
        if (g0Var.a()) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f279653m;
        h9.n nVar = this.f279657q;
        if (elapsedRealtime < j17) {
            this.f279655o = true;
            nVar.f279662h.postDelayed(this, j17 - elapsedRealtime);
        } else {
            g0Var.d(this.f279649f, this, nVar.f279660f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(h9.d r51) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.i.c(h9.d):void");
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        r9.i0 i0Var = (r9.i0) c0Var;
        h9.e eVar = (h9.e) i0Var.f393371d;
        if (!(eVar instanceof h9.d)) {
            this.f279656p = new m8.x("Loaded playlist has unexpected type.");
            return;
        }
        h9.d dVar = (h9.d) eVar;
        c(dVar);
        if (dVar.f279615l) {
            d9.g gVar = this.f279657q.f279666o;
            gVar.getClass();
            gVar.f227349a.post(new d9.f(gVar));
        }
        this.f279657q.f279666o.e(i0Var.f393368a, 4, j17, j18, i0Var.f393373f);
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        int i17;
        r9.i0 i0Var = (r9.i0) c0Var;
        boolean z17 = iOException instanceof m8.x;
        this.f279657q.f279666o.g(i0Var.f393368a, 4, j17, j18, i0Var.f393373f, iOException, z17);
        if (z17) {
            return 3;
        }
        return (iOException instanceof r9.y) && ((i17 = ((r9.y) iOException).f393439d) == 404 || i17 == 410) ? a() : true ? 0 : 2;
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        r9.i0 i0Var = (r9.i0) c0Var;
        this.f279657q.f279666o.c(i0Var.f393368a, 4, j17, j18, i0Var.f393373f);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f279655o = false;
        this.f279648e.d(this.f279649f, this, this.f279657q.f279660f);
    }
}
