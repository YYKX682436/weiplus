package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class g3 extends p13.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.fts.logic.h3 h3Var, p13.u request) {
        super(request);
        kotlin.jvm.internal.o.g(request, "request");
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchSettingTask";
    }

    @Override // p13.c
    public int k() {
        return 52;
    }

    @Override // p13.t
    public void p(p13.v ftsResult) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        p13.u uVar = this.f351135n;
        ftsResult.f351159d = p13.r.b(uVar.f351141c, true);
        ftsResult.f351160e = new java.util.ArrayList();
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        if (y1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTS5SearchSettingLogic", "ISettingSearchFeatureService is null");
            ftsResult.f351158c = -1;
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "start search!!!!!!");
            java.util.List<wd0.x1> b17 = kotlin.jvm.internal.m0.b(kotlinx.coroutines.l.f(null, new com.tencent.mm.plugin.fts.logic.f3(y1Var, ftsResult, null), 1, null));
            if (b17 != null && !b17.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (wd0.x1 x1Var : b17) {
                    if (!uVar.f351148j.contains(x1Var.f444781d)) {
                        arrayList.add(x1Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "All results filtered by blockSet");
                    ftsResult.f351158c = 0;
                    return;
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ftsResult.f351160e.add(r((wd0.x1) it.next()));
                }
                ftsResult.f351158c = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Search success, result count: " + ftsResult.f351160e.size());
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "No setting search results");
            ftsResult.f351158c = 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTS5SearchSettingLogic", "Setting search error", e17);
            ftsResult.f351158c = -1;
        }
    }

    public final p13.y r(wd0.x1 settingResult) {
        kotlin.jvm.internal.o.g(settingResult, "settingResult");
        p13.y yVar = new p13.y();
        yVar.f351184b = 786432;
        yVar.f351190h = settingResult.f444778a;
        yVar.f351187e = settingResult.f444781d;
        yVar.f351197o = settingResult;
        int ordinal = settingResult.f444783f.ordinal();
        if (ordinal == 0) {
            yVar.f351185c = 1;
            yVar.f351200r = 0;
        } else if (ordinal == 1) {
            yVar.f351185c = 1;
            yVar.f351200r = 1;
        } else if (ordinal == 2) {
            yVar.f351185c = 1;
            yVar.f351200r = 0;
        }
        yVar.f351188f = java.lang.System.currentTimeMillis();
        return yVar;
    }
}
