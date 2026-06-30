package od2;

/* loaded from: classes12.dex */
public class k extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f344620e;

    /* renamed from: f, reason: collision with root package name */
    public od2.e f344621f;

    /* renamed from: g, reason: collision with root package name */
    public p13.c f344622g = null;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f344623h = new od2.f(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        od2.i iVar = new od2.i(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f344620e).b(-65536, iVar);
        return iVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchFinderFollowerLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "Create Success!");
        this.f344621f = (od2.e) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1792);
        com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f344620e = tVar;
        tVar.b(65646, new od2.j(this));
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).wi(this.f344623h);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).rj(this.f344623h);
        this.f344621f = null;
        this.f344620e = null;
        return true;
    }
}
