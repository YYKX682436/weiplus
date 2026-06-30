package h63;

/* loaded from: classes7.dex */
public final class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279276d;

    public r0(h63.v0 v0Var) {
        this.f279276d = v0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        ta1.q0 q0Var;
        ta1.o0 o0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "invoke startPush callback");
        h63.q1 q1Var = this.f279276d.f279285d;
        if (q1Var != null) {
            pa1.t tVar = (pa1.t) q1Var;
            java.lang.String H = tVar.H();
            if (!((java.util.HashMap) ta1.q0.f416663g).containsKey(H) || (q0Var = (ta1.q0) ((java.util.HashMap) ta1.q0.f416663g).get(H)) == null || ((o0Var = q0Var.f416668d) != ta1.o0.Running && o0Var != ta1.o0.Paused)) {
                q0Var = null;
            }
            if (q0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePageViewRendererWC", "stop running recorder");
                pa1.p pVar = new pa1.p(tVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
                q0Var.f416665a.postToWorker(new ta1.g0(q0Var, pVar));
                new ma1.a().x(((com.tencent.mm.plugin.appbrand.page.n7) tVar.F()).U1(), 112, "game is living, not support record now");
            }
            tVar.f40686g.e(false, 2, new pa1.q(tVar));
        }
    }
}
