package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.d f188399d;

    public c(com.tencent.mm.plugin.wepkg.model.d dVar) {
        this.f188399d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        java.util.List<com.tencent.mm.plugin.wepkg.model.WepkgVersion> list = wepkgCrossProcessTask.f188345m;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list);
        com.tencent.mm.plugin.wepkg.model.d dVar = this.f188399d;
        if (L0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "no need to clean wepkg");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "need to clean list.size:%s", java.lang.Integer.valueOf(list.size()));
            for (com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion : list) {
                if (wepkgVersion != null) {
                    dVar.f188410a.g(wepkgVersion.f188374d, 2, 8);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "start clean dirty wepkg");
        com.tencent.mm.plugin.wepkg.model.i iVar = dVar.f188410a;
        iVar.getClass();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.wepkg.model.l.c());
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null && G.length != 0) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2 != null) {
                    iVar.g(r6Var2.getName(), 3, 9);
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long b17 = dVar.f188410a.b(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.wepkg.model.l.c()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "local wepkg size: %d, cost time: %d", java.lang.Long.valueOf(b17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        wz4.f L02 = wz4.f.L0();
        if (L02.f450803d) {
            android.database.Cursor rawQuery = L02.rawQuery(java.lang.String.format("select %s from %s order by %s asc", "pkgId", "WepkgVersion", "accessTime"), new java.lang.String[0]);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (rawQuery != null) {
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                }
                do {
                    java.lang.String string = rawQuery.getString(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        arrayList2.add(string);
                    }
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return;
        }
        while (b17 > 209715200 && arrayList.size() > 0) {
            java.lang.String str = (java.lang.String) arrayList.remove(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                dVar.f188410a.g(str, 2, 10);
                b17 = dVar.f188410a.b(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.wepkg.model.l.c()));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg finish!");
    }
}
