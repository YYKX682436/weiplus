package d84;

/* loaded from: classes4.dex */
public final class l implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227099d;

    public l(d84.j0 j0Var) {
        this.f227099d = j0Var;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mLeftDecorPAGViewListener$1");
        d84.j0 j0Var = this.f227099d;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLeftDecorPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            d84.k kVar = j0Var.f227081f0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLeftDecorPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            mMPAGView.b(kVar);
        }
        com.tencent.mars.xlog.Log.i(j0Var.j(), "leftDecorPAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mLeftDecorPAGViewListener$1");
    }
}
