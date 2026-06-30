package d84;

/* loaded from: classes4.dex */
public final class x implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227129a;

    public x(d84.j0 j0Var) {
        this.f227129a = j0Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGFlushListener$1");
        d84.j0 j0Var = this.f227129a;
        if (d84.j0.B(j0Var) != null) {
            android.widget.ImageView B = d84.j0.B(j0Var);
            boolean z17 = false;
            if (B != null && B.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(j0Var.j(), "rockPaperScissorsPAGThumb need to be gone");
                j0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.tencent.mm.view.MMPAGView mMPAGView = j0Var.F;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView B2 = d84.j0.B(j0Var);
                if (B2 != null) {
                    B2.clearAnimation();
                }
                android.widget.ImageView B3 = d84.j0.B(j0Var);
                if (B3 != null) {
                    B3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGFlushListener$1");
    }
}
