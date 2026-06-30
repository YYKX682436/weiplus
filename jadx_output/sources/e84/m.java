package e84;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e84.t tVar) {
        super(0);
        this.f250274d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBarContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBarContainer$2");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout B = e84.t.B(this.f250274d);
        android.widget.FrameLayout frameLayout = B != null ? (android.widget.FrameLayout) B.findViewById(com.tencent.mm.R.id.sh8) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBarContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBarContainer$2");
        return frameLayout;
    }
}
