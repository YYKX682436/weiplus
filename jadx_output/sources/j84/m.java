package j84;

/* loaded from: classes4.dex */
public final class m implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f298218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298219e;

    public m(android.view.View view, j84.g0 g0Var) {
        this.f298218d = view;
        this.f298219e = g0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$bindComponentModel$$inlined$doOnPreDraw$1");
        this.f298218d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        j84.g0 g0Var = this.f298219e;
        android.widget.FrameLayout y17 = g0Var.y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y17 != null) {
            y17.removeAllViews();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout y18 = g0Var.y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y18 != null) {
            y18.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout y19 = g0Var.y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdScratchCardBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (y19 != null) {
            y19.setLayoutParams(new android.widget.FrameLayout.LayoutParams(g0Var.E().getWidth(), g0Var.E().getHeight()));
        }
        int[] iArr = new int[2];
        g0Var.E().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout F = g0Var.F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScratchCardContainer", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (F != null) {
            F.getLocationOnScreen(iArr2);
        }
        float f17 = iArr2[0] - iArr[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setOffsetX$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        g0Var.K = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setOffsetX$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        float f18 = iArr2[1] - iArr[1];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setOffsetY$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        g0Var.L = f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setOffsetY$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$bindComponentModel$$inlined$doOnPreDraw$1");
        return true;
    }
}
