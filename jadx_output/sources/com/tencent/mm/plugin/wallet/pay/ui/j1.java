package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178774d;

    public j1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178774d = walletPayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178774d;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 12, "");
        com.tencent.mm.plugin.wallet_core.ui.m4.c(walletPayUI.getContext(), walletPayUI.f178713e, walletPayUI.f178720n.f179667d, new com.tencent.mm.plugin.wallet.pay.ui.i1(this), null);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
