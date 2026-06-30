package lc5;

/* loaded from: classes8.dex */
public final class p extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: x, reason: collision with root package name */
    public static final lc5.n f318023x = new lc5.n(null);

    /* renamed from: v, reason: collision with root package name */
    public long f318024v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Boolean f318025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(dp1.x pageAdapter) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        this.f318024v = -1L;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent");
        dp1.x xVar = this.f93239n;
        if (xVar != null) {
            xVar.q(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean g0(java.lang.Runnable runnable) {
        boolean g07 = super.g0(runnable);
        if (g07) {
            dp1.x xVar = this.f93239n;
            if (xVar instanceof lc5.u) {
                lc5.u uVar = xVar instanceof lc5.u ? (lc5.u) xVar : null;
                android.view.View view = uVar != null ? uVar.f318037o : null;
                lc5.u uVar2 = xVar instanceof lc5.u ? (lc5.u) xVar : null;
                t0(view, uVar2 != null ? uVar2.f318038p : null);
            }
        }
        return g07;
    }

    public final void t0(android.view.View view, android.view.View view2) {
        android.view.ViewPropertyAnimator animate;
        if (view2 == null || (animate = view2.animate()) == null) {
            return;
        }
        animate.alpha(0.0f);
        animate.setDuration(300L);
        animate.withEndAction(new lc5.o(view2));
        animate.start();
    }

    public final void u0(int i17, long j17, long j18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('_');
        sb6.append(j18);
        super.b(i17, sb6.toString());
        boolean z17 = true;
        Q(1);
        lc5.t tVar = lc5.t.f318032d;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        kotlin.jvm.internal.o.f(ballInfo, "ballInfo");
        java.lang.String str2 = str == null ? "" : str;
        if (str2.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageFloatBallMgr", "addImageFloatBall talker is empty");
        }
        if (!lc5.t.f318034f) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(tVar);
            lc5.t.f318034f = true;
        }
        java.util.LinkedList<lc5.s> linkedList = lc5.t.f318033e;
        if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
            for (lc5.s sVar : linkedList) {
                if (sVar.f318029a == j17 && kotlin.jvm.internal.o.b(sVar.f318031c, str2)) {
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageFloatBallMgr", "addImageFloatBall exists");
        } else {
            linkedList.add(new lc5.s(j17, ballInfo, str2));
        }
        android.os.Bundle bundle = this.f93132d.G;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageFloatBallHelper", "onCreate, ballInfo.extra is null");
            return;
        }
        bundle.putLong("img_gallery_msg_id", j17);
        this.f93132d.G.putLong("img_gallery_msg_svr_id", j18);
        this.f93132d.G.putString("img_gallery_talker", str);
        this.f93132d.G.putString("img_gallery_chatroom_name", str);
    }
}
