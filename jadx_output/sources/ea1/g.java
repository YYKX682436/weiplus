package ea1;

/* loaded from: classes12.dex */
public class g extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f250517e;

    /* renamed from: f, reason: collision with root package name */
    public ea1.h f250518f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f250519g = new ea1.b(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        ea1.e eVar = new ea1.e(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f250517e).b(-65536, eVar);
        return eVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchWeAppLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Success!");
        this.f250518f = (ea1.h) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(512);
        com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f250517e = tVar;
        tVar.b(65616, new ea1.f(this));
        ft.l4 l4Var = (ft.l4) i95.n0.c(ft.l4.class);
        l75.q0 q0Var = this.f250519g;
        et.i2 i2Var = (et.i2) l4Var;
        boolean z17 = i2Var.f256466d.get();
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = i2Var.f256467e;
        if (!z17) {
            concurrentSkipListSet.add(q0Var);
            return true;
        }
        while (!concurrentSkipListSet.isEmpty()) {
            l75.q0 q0Var2 = (l75.q0) concurrentSkipListSet.pollFirst();
            if (q0Var2 != null && com.tencent.mm.plugin.appbrand.app.r9.hj() != null) {
                com.tencent.mm.plugin.appbrand.app.r9.hj().add(q0Var2);
            }
        }
        if (com.tencent.mm.plugin.appbrand.app.r9.hj() == null) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.app.r9.hj().add(q0Var);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ft.l4 l4Var = (ft.l4) i95.n0.c(ft.l4.class);
        l75.q0 q0Var = this.f250519g;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ((et.i2) l4Var).f256467e;
        try {
            if (com.tencent.mm.plugin.appbrand.app.r9.hj() != null) {
                com.tencent.mm.plugin.appbrand.app.r9.hj().remove(q0Var);
            }
        } catch (c01.c unused) {
        } catch (java.lang.Throwable th6) {
            concurrentSkipListSet.remove(q0Var);
            throw th6;
        }
        concurrentSkipListSet.remove(q0Var);
        this.f250518f = null;
        this.f250517e = null;
        return true;
    }
}
