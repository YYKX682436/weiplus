package ns4;

/* loaded from: classes8.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339577d;

    public k3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339577d = weCoinRechargeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339577d;
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(7);
        android.content.Intent intent = new android.content.Intent(weCoinRechargeView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.class);
        intent.putExtra("wecoin_enter_encash_business_kv_data", new com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData(2, "", ""));
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView2 = this.f339577d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weCoinRechargeView2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        weCoinRechargeView2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(weCoinRechargeView2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateIncomeBalance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
