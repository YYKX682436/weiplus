package k84;

/* loaded from: classes4.dex */
public final class i5 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305070a;

    public i5(k84.c6 c6Var) {
        this.f305070a = c6Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGFlushListener$1");
        k84.c6 c6Var = this.f305070a;
        if (k84.c6.C(c6Var) != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView C = k84.c6.C(c6Var);
            boolean z17 = false;
            if (C != null && C.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(c6Var.j(), "mCheerNormalIcon need to be gone");
                com.tencent.mm.view.MMPAGView D = k84.c6.D(c6Var);
                if (D != null) {
                    D.j(this);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView C2 = k84.c6.C(c6Var);
                if (C2 != null) {
                    C2.clearAnimation();
                }
                com.tencent.mm.ui.widget.imageview.WeImageView C3 = k84.c6.C(c6Var);
                if (C3 != null) {
                    C3.setVisibility(8);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGFlushListener$1");
    }
}
