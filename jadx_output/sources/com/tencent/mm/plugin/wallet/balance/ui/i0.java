package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177902d;

    public i0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f177902d = walletBalanceFetchUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.U6(this.f177902d);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
