package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {
    public p1(com.tencent.mm.plugin.game.n1 n1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameService", "gameFindPageEntranceObserveAndNotify!");
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        com.tencent.mm.plugin.game.o1 o1Var = new com.tencent.mm.plugin.game.o1(this);
        ((c61.t8) caVar).getClass();
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.S0;
        j0Var.observeForever(o1Var);
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) j0Var.getValue();
        if (z9Var != null) {
            o1Var.onChanged(z9Var);
        }
    }
}
