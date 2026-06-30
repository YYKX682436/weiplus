package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178499d;

    public r1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f178499d = walletBalanceSaveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hs4.d dVar = this.f178499d.f177844t;
        if (dVar != null) {
            dVar.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
