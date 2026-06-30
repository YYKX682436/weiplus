package e84;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e84.t tVar) {
        super(0);
        this.f250276d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdSingleProductBarContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdSingleProductBarContainer$2");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout B = e84.t.B(this.f250276d);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = B != null ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) B.findViewById(com.tencent.mm.R.id.raj) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdSingleProductBarContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdSingleProductBarContainer$2");
        return roundedCornerFrameLayout;
    }
}
