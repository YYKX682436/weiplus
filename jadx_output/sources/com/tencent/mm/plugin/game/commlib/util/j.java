package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    public j(com.tencent.mm.plugin.game.commlib.util.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.mm.plugin.game.commlib.util.m.f139419a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            for (com.tencent.mm.plugin.game.commlib.util.l lVar : com.tencent.mm.plugin.game.commlib.util.l.values()) {
                if (lVar != com.tencent.mm.plugin.game.commlib.util.l.PERMANENT) {
                    java.lang.String str2 = com.tencent.mm.plugin.game.commlib.util.m.f139419a + lVar.name() + "/";
                    long j17 = lVar.f139418d;
                    com.tencent.mm.plugin.game.commlib.util.m.a(new com.tencent.mm.vfs.r6(str2), j17);
                    com.tencent.mm.plugin.game.commlib.util.m.a(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.game.commlib.util.m.e(lVar)), j17);
                    com.tencent.mm.plugin.game.commlib.util.m.a(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.game.commlib.util.m.b(lVar)), j17);
                    com.tencent.mm.plugin.game.commlib.util.m.a(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.game.commlib.util.m.c(lVar)), j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameFileManager", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFileManager", "remove expire files cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
