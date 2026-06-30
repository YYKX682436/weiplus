package j84;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298173d;

    public b0(j84.g0 g0Var) {
        this.f298173d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$startCouponAnimation$2$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.LinearLayout G = this.f298173d.G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTextContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (G != null) {
            G.setTranslationX(0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = G.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(13);
                layoutParams2.addRule(9);
                layoutParams2.addRule(15);
                layoutParams2.addRule(0, com.tencent.mm.R.id.snu);
                layoutParams2.setMarginEnd(i65.a.b(G.getContext(), 8));
                G.setLayoutParams(layoutParams2);
            }
            G.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$startCouponAnimation$2$1$1");
    }
}
