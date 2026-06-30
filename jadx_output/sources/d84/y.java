package d84;

/* loaded from: classes4.dex */
public final class y implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227130d;

    public y(d84.j0 j0Var) {
        this.f227130d = j0Var;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGViewListener$1");
        d84.j0 j0Var = this.f227130d;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRockPaperScissorsPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            d84.x xVar = j0Var.f227083h0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRockPaperScissorsPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            mMPAGView.b(xVar);
        }
        com.tencent.mars.xlog.Log.i(j0Var.j(), "snsAdRockPaperScissorsPAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGViewListener$1");
    }
}
