package dp1;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f242119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f242120e;

    public b(dp1.l lVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f242120e = lVar;
        this.f242119d = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f242119d;
        dp1.l lVar = this.f242120e;
        lVar.getClass();
        try {
            int indexOf = lVar.f242165g.indexOf(ballInfo);
            if (indexOf < 0 || indexOf >= lVar.f242165g.size()) {
                return;
            }
            lVar.notifyItemChanged(indexOf, "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallMenuAdapter", e17, "doUpdateBallButton exception", new java.lang.Object[0]);
        }
    }
}
