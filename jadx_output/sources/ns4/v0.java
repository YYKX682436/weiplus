package ns4;

/* loaded from: classes8.dex */
public final class v0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339665d;

    public v0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339665d = weCoinEncashView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.ek0 ek0Var = (r45.ek0) obj;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339665d;
        weCoinEncashView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "gotoWeCoinFetchResultUI, info " + ek0Var);
        if (ek0Var != null) {
            weCoinEncashView.finish();
            ms4.n nVar = weCoinEncashView.f179154i;
            if (nVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            nVar.P6(21);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = new com.tencent.mm.plugin.wallet_core.model.Orders();
            if (weCoinEncashView.f179154i == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            orders.f179678h = r4.f331077q;
            orders.f179681m = "CNY";
            orders.E = ek0Var.f373575d;
            orders.F = ek0Var.f373576e;
            android.content.Intent intent = new android.content.Intent(weCoinEncashView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView.class);
            intent.putExtra("key_orders", orders);
            ms4.n nVar2 = weCoinEncashView.f179154i;
            if (nVar2 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            intent.putExtra("wecoin_fetch_result_kv_data", nVar2.f331080t);
            ms4.n nVar3 = weCoinEncashView.f179154i;
            if (nVar3 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            intent.putExtra("WECOIN_FETCH_RESULT_BIZ_TYPE", nVar3.f331069f);
            intent.putExtra("WECOIN_ENCASH_RESULT_PAGE_INFO", ek0Var.toByteArray());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(weCoinEncashView, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            weCoinEncashView.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(weCoinEncashView, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView", "gotoWeCoinFetchResultUI", "(Lcom/tencent/mm/protocal/protobuf/EncashResultPageInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ns4.m1 m1Var = (ns4.m1) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v.get();
        if (m1Var != null) {
        }
    }
}
