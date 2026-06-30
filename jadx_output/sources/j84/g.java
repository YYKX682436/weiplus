package j84;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j84.g0 g0Var) {
        super(0);
        this.f298193d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardBreakContainer$2");
        android.view.View E = this.f298193d.E();
        android.view.View h17 = a84.y0.h(E != null ? (android.view.ViewStub) E.findViewById(com.tencent.mm.R.id.v7o) : null);
        android.widget.FrameLayout frameLayout = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardBreakContainer$2");
        return frameLayout;
    }
}
