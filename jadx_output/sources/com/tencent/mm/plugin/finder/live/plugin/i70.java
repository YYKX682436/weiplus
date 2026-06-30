package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i70 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f112935d;

    public i70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f112935d = v70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f112935d;
        if (((mm2.o4) v70Var.P0(mm2.o4.class)).f329330x0) {
            int i17 = v70Var.Q;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onMicUserNumChange,allMicUserNum:" + i17 + ",curState:" + v70Var.f114683q);
            if (i17 == 0) {
                if (v70Var.f114683q == com.tencent.mm.plugin.finder.live.plugin.gp0.f112727g) {
                    v70Var.x1(com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f, null);
                }
            } else if (i17 > 0 && v70Var.f114683q == com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f) {
                v70Var.x1(com.tencent.mm.plugin.finder.live.plugin.gp0.f112727g, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onMicUserNumChange,not in chatting mode");
        }
        v70Var.S = null;
    }
}
