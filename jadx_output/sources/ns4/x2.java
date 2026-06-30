package ns4;

/* loaded from: classes4.dex */
public final class x2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339677d;

    public x2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339677d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339677d;
        android.view.View findViewById = weCoinRechargeView.findViewById(com.tencent.mm.R.id.j7s);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) weCoinRechargeView.findViewById(com.tencent.mm.R.id.pk7);
        android.widget.TextView textView = (android.widget.TextView) weCoinRechargeView.findViewById(com.tencent.mm.R.id.pk8);
        if (booleanValue && (!r26.i0.p("CN", gm0.j1.u().c().u(274436, "CN"), true))) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            textView.setVisibility(0);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
