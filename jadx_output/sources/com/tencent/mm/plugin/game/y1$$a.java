package com.tencent.mm.plugin.game;

/* loaded from: classes.dex */
public final /* synthetic */ class y1$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).wi();
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginGame", "clearExpiredMiniGameVideo done");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginGame", e17, "", new java.lang.Object[0]);
        }
    }
}
