package ns4;

/* loaded from: classes4.dex */
public final class o2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339605d;

    public o2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339605d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339605d;
        weCoinRechargeView.getClass();
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(weCoinRechargeView.getContext(), weCoinRechargeView.getContext().getString(com.tencent.mm.R.string.ggc), false, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = weCoinRechargeView.f179200v;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        weCoinRechargeView.f179200v = u3Var;
    }
}
