package ns4;

/* loaded from: classes8.dex */
public final class n2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339598d;

    public n2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339598d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.r74 r74Var;
        r45.la7 la7Var = (r45.la7) obj;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339598d;
        if (la7Var != null) {
            int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
            weCoinRechargeView.getClass();
            r74Var = la7Var.f379283e;
        } else {
            r74Var = null;
        }
        if (r74Var == null) {
            android.view.View view = weCoinRechargeView.f179198t;
            if (view == null) {
                kotlin.jvm.internal.o.o("wecoin_subscription_list");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = weCoinRechargeView.f179198t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("wecoin_subscription_list");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = weCoinRechargeView.f179199u;
        if (textView == null) {
            kotlin.jvm.internal.o.o("wecoin_subscription_list_title");
            throw null;
        }
        textView.setText(la7Var.f379282d);
        android.view.View view3 = weCoinRechargeView.f179198t;
        if (view3 != null) {
            view3.setOnClickListener(new ns4.p3(la7Var));
        } else {
            kotlin.jvm.internal.o.o("wecoin_subscription_list");
            throw null;
        }
    }
}
