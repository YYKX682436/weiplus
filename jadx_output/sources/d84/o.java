package d84;

/* loaded from: classes4.dex */
public final class o implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227120d;

    public o(d84.j0 j0Var) {
        this.f227120d = j0Var;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGViewListener$1");
        d84.j0 j0Var = this.f227120d;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightDecorPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            d84.n nVar = j0Var.f227082g0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightDecorPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            mMPAGView.b(nVar);
        }
        com.tencent.mars.xlog.Log.i(j0Var.j(), "rightDecorPAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGViewListener$1");
    }
}
