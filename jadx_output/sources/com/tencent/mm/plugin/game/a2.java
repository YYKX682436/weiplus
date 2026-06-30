package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class a2 implements java.lang.Runnable {
    public a2(com.tencent.mm.plugin.game.y1 y1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.util.LinkedList J0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().J0(0);
            if (com.tencent.mm.sdk.platformtools.t8.L0(J0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginGame", "checkHaowanPublishState none");
                return;
            }
            java.util.Iterator it = J0.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(((i53.x) it.next()).field_taskId, 1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginGame", e17, "", new java.lang.Object[0]);
        }
    }
}
