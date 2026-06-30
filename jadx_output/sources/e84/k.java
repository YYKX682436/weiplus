package e84;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e84.t tVar) {
        super(0);
        this.f250272d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mImagesKeeperLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mImagesKeeperLayout$2");
        e84.t tVar = this.f250272d;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.View view = tVar.f250282o;
        android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485319ha3) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mImagesKeeperLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$mImagesKeeperLayout$2");
        return linearLayout;
    }
}
