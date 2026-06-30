package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class o3 extends p13.c {
    public o3(com.tencent.mm.plugin.fts.logic.r3 r3Var, com.tencent.mm.plugin.fts.logic.n3 n3Var) {
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "FTSDeleteMsgLogic.DeleteAllMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        if (oVar == null) {
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oVar.a();
        try {
            oVar.i(java.lang.String.format("DROP TABLE %s;", "FTS5MetaMessage"));
            oVar.i(java.lang.String.format("DROP TABLE %s;", "FTS5IndexMessage"));
            o13.u cj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(4);
            cj6.destroy();
            cj6.create();
            oVar.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSIndexDB", "deleteAllMsg use time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (java.lang.Throwable th6) {
            oVar.d();
            throw th6;
        }
    }
}
