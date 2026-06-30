package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178787a;

    public m1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178787a = walletPayUI;
    }

    public void a() {
        int i17;
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178787a;
        walletPayUI.I.removeAllViews();
        int i18 = walletPayUI.f178715g;
        if (i18 == 0) {
            i18 = 0;
        } else if (!walletPayUI.f178730v) {
            i18 = 1;
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        for (int i19 = 0; i19 < i18; i19++) {
            android.view.View inflate = ((android.view.LayoutInflater) walletPayUI.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.d7s, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pdg);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487670pe3);
            com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) walletPayUI.f178713e.M).get(i19);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
            java.lang.String str = "";
            if (payInfo != null && ((i17 = payInfo.f192109e) == 32 || i17 == 33 || i17 == 31 || i17 == 48)) {
                java.lang.String string = payInfo.f192122u.getString("extinfo_key_1", "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    com.tencent.mars.xlog.Log.e(walletPayUI.f178712d, "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                } else {
                    gm0.j1.i();
                    com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string);
                    if (q17 != null) {
                        str = q17.g2();
                    } else {
                        com.tencent.mars.xlog.Log.e(walletPayUI.f178712d, "can not found contact for user::" + string + "");
                    }
                }
            }
            if (commodity != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    textView2.setText(str);
                    textView2.setVisibility(0);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487671pe4)).setVisibility(0);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179706g)) {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487671pe4)).setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(commodity.f179706g);
                    textView2.setVisibility(0);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487671pe4)).setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179707h)) {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pdi)).setVisibility(8);
                    textView.setVisibility(8);
                } else {
                    textView.setText(commodity.f179707h);
                    textView.setVisibility(8);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pdi)).setVisibility(8);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179706g)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            inflate.setLayoutParams(layoutParams);
            inflate.measure(-2, -2);
            walletPayUI.I.addView(inflate);
        }
    }
}
