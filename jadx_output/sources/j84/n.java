package j84;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j84.g0 g0Var) {
        super(0);
        this.f298221d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$buttonContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$buttonContainer$2");
        android.view.View E = this.f298221d.E();
        android.widget.FrameLayout frameLayout = E != null ? (android.widget.FrameLayout) E.findViewById(com.tencent.mm.R.id.snu) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$buttonContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$buttonContainer$2");
        return frameLayout;
    }
}
