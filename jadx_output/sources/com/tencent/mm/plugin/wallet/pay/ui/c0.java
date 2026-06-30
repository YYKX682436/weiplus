package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178750d;

    public c0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178750d = walletPayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean x17 = vr4.f1.wi().Ai().x();
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178750d;
        if (x17) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
            com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 6, "");
        }
        if (walletPayUI.f178713e.P == 1) {
            if (vr4.f1.wi().Ai().x()) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = walletPayUI.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo2 == null ? 0 : payInfo2.f192109e, payInfo2 == null ? "" : payInfo2.f192114m, 5, "");
            }
            walletPayUI.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.plugin.wallet_core.model.Orders orders = walletPayUI.f178713e;
            if (orders != null) {
                bundle.putString("key_reqKey", orders.f179675e);
                java.util.List list = walletPayUI.f178713e.M;
                if (list != null && ((java.util.ArrayList) list).size() > 0) {
                    bundle.putString("key_TransId", ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) walletPayUI.f178713e.M).get(0)).f179714r);
                }
                bundle.putLong("key_SessionId", walletPayUI.N);
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = walletPayUI.f178729u;
            if (payInfo3 != null) {
                bundle.putInt("key_scene", payInfo3.f192109e);
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo4 = walletPayUI.f178729u;
            if (payInfo4 == null || payInfo4.f192109e != 11) {
                bundle.putInt("key_bind_scene", 0);
            } else {
                bundle.putInt("key_bind_scene", 13);
            }
            bundle.putBoolean("key_need_bind_response", true);
            bundle.putInt("key_req_bind_scene", 0);
            bundle.putBoolean("key_is_bind_bankcard", true);
            bundle.putBoolean("key_is_oversea", !walletPayUI.j7());
            com.tencent.mm.wallet_core.a.j(walletPayUI, yr4.a.class, bundle, null);
        } else {
            com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "SimpleReg , assigned userinfo pay! payWithNewBankcard");
            if (vr4.f1.wi().Ai().x()) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo5 = walletPayUI.f178729u;
                com.tencent.mm.wallet_core.model.a2.a(payInfo5 == null ? 0 : payInfo5.f192109e, payInfo5 == null ? "" : payInfo5.f192114m, 5, "");
            }
            walletPayUI.n7(false, 0, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
