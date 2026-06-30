package dj3;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {
    public m(dj3.n nVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().A()) {
            com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
            if (Ri.S.f301233b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "no allow to show main ui");
                Ri.L();
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17 && com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Inviting) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkAppForegroundListener", "multitalk resume on app foreground");
                com.tencent.mm.plugin.multitalk.model.v0 Ri2 = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                if (Ri2.f150185y0 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "on multitalk resume");
                    com.tencent.mm.plugin.multitalk.model.s1 s1Var = Ri2.f150185y0;
                    Ri2.e(s1Var.f150128a, s1Var.f150129b);
                    Ri2.L();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkAppForegroundListener", "do not need resume multitalk ");
    }
}
