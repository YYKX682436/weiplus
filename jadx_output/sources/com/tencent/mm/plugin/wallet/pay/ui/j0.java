package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178773d;

    public j0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178773d = walletPayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178773d;
        java.lang.String str = walletPayUI.f178712d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "WalletPwdDialog event1 %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        walletPayUI.f178720n = (com.tencent.mm.plugin.wallet_core.model.FavorPayInfo) view.getTag();
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = walletPayUI.f178720n;
        if (favorPayInfo != null) {
            favorPayInfo.f179671h = "";
        }
        walletPayUI.p7(false, 0, "");
        walletPayUI.K.dismiss();
        walletPayUI.f178716h = null;
        walletPayUI.K = null;
        walletPayUI.L = null;
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
