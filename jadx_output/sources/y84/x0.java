package y84;

/* loaded from: classes4.dex */
public final class x0 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460222a;

    public x0(y84.h3 h3Var) {
        this.f460222a = h3Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mDonePAGFlushListener$1");
        y84.h3 h3Var = this.f460222a;
        if (y84.h3.D(h3Var) != null) {
            android.widget.ImageView D = y84.h3.D(h3Var);
            if (D != null && D.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i(h3Var.j(), "mDonePAGThumb need to be gone");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDonePAGView$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                com.tencent.mm.view.MMPAGView mMPAGView = h3Var.X;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDonePAGView$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                if (mMPAGView != null) {
                    mMPAGView.j(this);
                }
                android.widget.ImageView D2 = y84.h3.D(h3Var);
                if (D2 != null) {
                    D2.clearAnimation();
                }
                android.widget.ImageView D3 = y84.h3.D(h3Var);
                if (D3 != null) {
                    D3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mDonePAGFlushListener$1");
    }
}
