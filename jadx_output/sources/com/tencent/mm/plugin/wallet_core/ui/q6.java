package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180587d;

    public q6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI) {
        this.f180587d = walletOrderInfoOldUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = this.f180587d;
        com.tencent.mm.wallet_core.ui.r1.V(walletOrderInfoOldUI, ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) walletOrderInfoOldUI.f180057n.M).get(0)).f179702J.f13984b, false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
