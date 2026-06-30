package q74;

/* loaded from: classes4.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.z f360558d;

    public x(q74.z zVar) {
        this.f360558d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
        q74.z zVar = this.f360558d;
        com.tencent.mars.xlog.Log.i(q74.z.a(zVar), "onActionUp, doSlideJump");
        q74.b0 b0Var = zVar.c().f360437g;
        if (b0Var != null) {
            b0Var.e();
        }
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        q74.c0 c0Var = zVar.f360586b;
        w64.n nVar = c0Var.f360436f;
        if (nVar != null) {
            int i17 = ca4.m0.Y(zVar.f360588d) ? 1 : 2;
            com.tencent.mars.xlog.Log.i(zVar.f360587c, "doSlideJump, nativeSightType=" + i17);
            s34.a1 a1Var = zVar.f360589e;
            nVar.p(new w64.c(a1Var != null ? a1Var.overSlideJumpInfo : null, zVar.f360588d, 0, null, false, i17, false, null, 220, null));
            nVar.k(c0Var.f360431a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
    }
}
