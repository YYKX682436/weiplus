package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI f177880d;

    public d1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI walletBalanceResultUI) {
        this.f177880d = walletBalanceResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceResultUI", "click finish btn");
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI.U6(this.f177880d);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
