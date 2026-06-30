package qp1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f365721d;

    public g(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f365721d = ballInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f365721d;
        boolean z17 = ballInfo.f93056q.f93082d;
        qp1.i.a();
        com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo = ballInfo.f93056q;
        if (!ballCollapseInfo.f93082d || ballCollapseInfo.f93083e <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseWhenAdded taskId: " + currentTimeMillis);
        ku5.u0 u0Var = ku5.t0.f312615d;
        qp1.f fVar = new qp1.f(currentTimeMillis);
        long j17 = ballInfo.f93056q.f93083e;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z18 = t0Var.z(fVar, j17, false);
        kotlin.jvm.internal.o.d(z18);
        qp1.i.f365725a = new qp1.d(currentTimeMillis, z18);
    }
}
