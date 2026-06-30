package j84;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j84.g0 g0Var) {
        super(0);
        this.f298207d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardCoverView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardCoverView$2");
        android.view.View E = this.f298207d.E();
        com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView adScratchCoverView = E != null ? (com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView) E.findViewById(com.tencent.mm.R.id.v0y) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardCoverView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$adScratchCardCoverView$2");
        return adScratchCoverView;
    }
}
