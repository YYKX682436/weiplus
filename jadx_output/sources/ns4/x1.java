package ns4;

/* loaded from: classes8.dex */
public final class x1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339676d;

    public x1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339676d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.E;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339676d;
        weCoinIncomeDetailView.getClass();
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(weCoinIncomeDetailView.getContext(), weCoinIncomeDetailView.getContext().getString(com.tencent.mm.R.string.ggc), false, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = weCoinIncomeDetailView.f179177t;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        weCoinIncomeDetailView.f179177t = u3Var;
    }
}
