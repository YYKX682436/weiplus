package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class h3 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137559e;

    @Override // o13.w
    public p13.c b(p13.u request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.fts.logic.g3 g3Var = new com.tencent.mm.plugin.fts.logic.g3(this, request);
        o13.y yVar = this.f137559e;
        kotlin.jvm.internal.o.d(yVar);
        ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, g3Var);
        return g3Var;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchSettingLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Create Success!");
        this.f137559e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f137559e = null;
        return true;
    }
}
