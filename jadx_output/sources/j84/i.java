package j84;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j84.g0 g0Var) {
        super(0);
        this.f298208d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardRootView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardRootView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        j84.g0 g0Var = this.f298208d;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) g0Var.f298201u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdScratchCardViewStub", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.view.View h17 = a84.y0.h(viewStub);
        android.widget.LinearLayout linearLayout = h17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) h17 : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardRootView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardRootView$2");
        return linearLayout;
    }
}
