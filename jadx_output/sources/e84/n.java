package e84;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e84.t tVar) {
        super(0);
        this.f250275d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBreakContainer$2");
        e84.t tVar = this.f250275d;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.View view = tVar.f250282o;
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = view != null ? (com.tencent.mm.plugin.sns.ui.AdFrameLayout) view.findViewById(com.tencent.mm.R.id.f486970v72) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mSnsAdBreakContainer$2");
        return adFrameLayout;
    }
}
