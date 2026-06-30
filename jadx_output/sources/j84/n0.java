package j84;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView f298222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView adScratchCoverView) {
        super(1);
        this.f298222d = adScratchCoverView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$setupAnimationManagerCallbacks$3");
        ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$setupAnimationManagerCallbacks$3");
        this.f298222d.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$setupAnimationManagerCallbacks$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$setupAnimationManagerCallbacks$3");
        return f0Var;
    }
}
