package j84;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j84.g0 g0Var) {
        super(0);
        this.f298179d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$textViewGap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$textViewGap$2");
        android.view.View E = this.f298179d.E();
        android.view.View findViewById = E != null ? E.findViewById(com.tencent.mm.R.id.vdl) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$textViewGap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$textViewGap$2");
        return findViewById;
    }
}
