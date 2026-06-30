package ns4;

/* loaded from: classes8.dex */
public final class v2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339667d;

    public v2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339667d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.i50 i50Var = (r45.i50) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339667d;
        weCoinRechargeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "bannerContent: [bannerContent] " + i50Var);
        android.view.View view = weCoinRechargeView.f179188g;
        if (view == null) {
            kotlin.jvm.internal.o.o("mBannerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i50Var == null || android.text.TextUtils.isEmpty(i50Var.f376738d)) {
            return;
        }
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(2);
        android.view.View view2 = weCoinRechargeView.f179188g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mBannerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = weCoinRechargeView.f179188g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("mBannerView");
            throw null;
        }
        ((android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.pkj)).setText(i50Var.f376738d);
        android.view.View view4 = weCoinRechargeView.f179188g;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("mBannerView");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.pki);
        java.lang.String str = i50Var.f376739e;
        if (str == null || str.length() == 0) {
            weImageView.setVisibility(8);
            return;
        }
        weImageView.setVisibility(0);
        android.view.View view5 = weCoinRechargeView.f179188g;
        if (view5 != null) {
            view5.setOnClickListener(new ns4.q3(weCoinRechargeView, i50Var));
        } else {
            kotlin.jvm.internal.o.o("mBannerView");
            throw null;
        }
    }
}
