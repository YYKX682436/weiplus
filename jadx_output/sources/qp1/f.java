package qp1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365719d;

    public f(long j17) {
        this.f365719d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseWhenAdded run autoCollapseTask taskId: " + this.f365719d);
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.tencent.mm.plugin.ball.ui.i0(e17, 3));
        ((ku5.t0) ku5.t0.f312615d).h(new qp1.e(this.f365719d), "MicroMsg.FloatBallCollapseHelper");
    }
}
