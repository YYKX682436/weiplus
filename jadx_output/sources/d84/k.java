package d84;

/* loaded from: classes4.dex */
public final class k implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227098a;

    public k(d84.j0 j0Var) {
        this.f227098a = j0Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mLeftDecorPAGFlushListener$1");
        d84.j0 j0Var = this.f227098a;
        if (d84.j0.C(j0Var) != null) {
            android.widget.ImageView C = d84.j0.C(j0Var);
            boolean z17 = false;
            if (C != null && C.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(j0Var.j(), "leftDecorPAGThumb need to be gone");
                j0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.tencent.mm.view.MMPAGView mMPAGView = j0Var.G;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView C2 = d84.j0.C(j0Var);
                if (C2 != null) {
                    C2.clearAnimation();
                }
                android.widget.ImageView C3 = d84.j0.C(j0Var);
                if (C3 != null) {
                    C3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mLeftDecorPAGFlushListener$1");
    }
}
