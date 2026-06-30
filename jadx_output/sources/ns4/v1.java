package ns4;

/* loaded from: classes8.dex */
public final class v1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339666d;

    public v1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339666d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.E;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339666d;
        weCoinIncomeDetailView.getClass();
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        weCoinIncomeDetailView.V6();
    }
}
