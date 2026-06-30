package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI f177877d;

    public d(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI walletBalanceFetchResultUI) {
        this.f177877d = walletBalanceFetchResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI.U6(this.f177877d);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
