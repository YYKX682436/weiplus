package pu4;

/* loaded from: classes12.dex */
public class i extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f358441e;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        pu4.h hVar = new pu4.h(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f358441e).b(-65536, hVar);
        return hVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchAIHistoryLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "Create Success!");
        this.f358441e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f358441e = null;
        return true;
    }
}
