package com.tencent.mm.plugin.fts.logic;

@j95.b
/* loaded from: classes12.dex */
public class r3 extends i95.w implements c01.j8 {
    public void Ai(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete fts talker msg %s %s", str, k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, j17 / 1000));
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        try {
            com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
            if (oVar != null) {
                oVar.h(str, j17);
            } else {
                ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d.b(65536, new com.tencent.mm.plugin.fts.logic.q3(this, str, j17));
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteTalkerMsg post task to fts task daemon %s %s", str, java.lang.Long.valueOf(j17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", e17, "syncDeleteTalkerMsg", new java.lang.Object[0]);
        }
    }

    public void wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete all msg");
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d.b(-131072, new com.tencent.mm.plugin.fts.logic.o3(this, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteAllMsg post task to fts task daemon");
    }
}
