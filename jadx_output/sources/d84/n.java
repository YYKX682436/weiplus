package d84;

/* loaded from: classes4.dex */
public final class n implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227116a;

    public n(d84.j0 j0Var) {
        this.f227116a = j0Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGFlushListener$1");
        d84.j0 j0Var = this.f227116a;
        if (d84.j0.D(j0Var) != null) {
            android.widget.ImageView D = d84.j0.D(j0Var);
            boolean z17 = false;
            if (D != null && D.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(j0Var.j(), "rightDecorPAGThumb need to be gone");
                j0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.tencent.mm.view.MMPAGView mMPAGView = j0Var.H;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView D2 = d84.j0.D(j0Var);
                if (D2 != null) {
                    D2.clearAnimation();
                }
                android.widget.ImageView D3 = d84.j0.D(j0Var);
                if (D3 != null) {
                    D3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGFlushListener$1");
    }
}
