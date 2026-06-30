package rp1;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f398475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, boolean z17) {
        super(0);
        this.f398474d = contentFloatBallView;
        this.f398475e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pp1.z recyclerViewHelper;
        rp1.h hVar = com.tencent.mm.plugin.ball.view.ContentFloatBallView.T;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398474d;
        contentFloatBallView.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFloatBallViewDockLeft targetDockLeft: ");
        boolean z17 = this.f398475e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", sb6.toString());
        contentFloatBallView.A = z17;
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = contentFloatBallView.f93432t;
        if (contentFloatBallRecyclerView != null) {
            contentFloatBallRecyclerView.setDockLeft(z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleSwitchEdge animationEnd dockLeft: " + contentFloatBallView.A);
        contentFloatBallView.B(true, true);
        recyclerViewHelper = contentFloatBallView.getRecyclerViewHelper();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "onEdgeSwitchEnd " + recyclerViewHelper.f357454o);
        recyclerViewHelper.f().S(true ^ recyclerViewHelper.f357454o);
        recyclerViewHelper.l();
        recyclerViewHelper.u();
        return jz5.f0.f302826a;
    }
}
