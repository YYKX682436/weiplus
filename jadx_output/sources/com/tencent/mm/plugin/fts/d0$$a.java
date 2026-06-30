package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final /* synthetic */ class d0$$a implements com.tencent.wcdb.DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137399a;

    public /* synthetic */ d0$$a(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137399a = d0Var;
    }

    @Override // com.tencent.wcdb.DatabaseErrorHandler
    public final void onCorruption(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        com.tencent.mm.plugin.fts.d0 d0Var = this.f137399a;
        com.tencent.mm.plugin.fts.t tVar = d0Var.f137379d;
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 5)).intValue();
        com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "DB onCorrupt dbCorruptRebuildTimes: %d", java.lang.Integer.valueOf(intValue));
        if (intValue <= 0) {
            d0Var.rj("CorruptAndRecoverOverThreeTime");
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue - 1));
        try {
            d0Var.Zi();
            d0Var.aj();
            d0Var.Ri();
            com.tencent.mm.plugin.fts.o.f();
            tVar.a().c();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread clearAllTask");
            d0Var.f137380e.a().c();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread clearAllTask");
            tVar.b(-131072, new com.tencent.mm.plugin.fts.j0(d0Var));
            tVar.b(-131071, new com.tencent.mm.plugin.fts.i0(d0Var, null));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e17, "onCorruption handle error", new java.lang.Object[0]);
        }
        d0Var.rj("CorruptAndTryFix");
        throw new com.tencent.mm.plugin.fts.q("Throw FTSStopTaskException From FTSDatabaseErrorHandler");
    }
}
