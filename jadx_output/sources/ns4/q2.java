package ns4;

/* loaded from: classes8.dex */
public final class q2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339624d;

    public q2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339624d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ms4.j jVar = (ms4.j) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339624d;
        weCoinRechargeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "updateIncomeBalance: [blance] " + jVar);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) weCoinRechargeView.findViewById(com.tencent.mm.R.id.pka);
        linearLayout.setVisibility(8);
        if (jVar == null || !jVar.f331044a) {
            return;
        }
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(6);
        linearLayout.setOnClickListener(new ns4.k3(weCoinRechargeView));
        java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(com.tencent.mm.wallet_core.ui.r1.i("" + jVar.f331045b, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView wcPayMoneyLoadingView = weCoinRechargeView.f179194p;
        if (wcPayMoneyLoadingView == null) {
            kotlin.jvm.internal.o.o("mBalanceView");
            throw null;
        }
        wcPayMoneyLoadingView.e(o17, false);
        linearLayout.setVisibility(0);
    }
}
