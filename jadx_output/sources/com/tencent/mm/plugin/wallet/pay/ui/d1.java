package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178756d;

    public d1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178756d = walletPayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178756d;
        if (walletPayUI.f178730v) {
            walletPayUI.F.setImageResource(com.tencent.mm.R.drawable.atx);
            walletPayUI.f178730v = false;
        } else {
            walletPayUI.F.setImageResource(com.tencent.mm.R.drawable.aty);
            walletPayUI.f178730v = true;
        }
        walletPayUI.f178711J.a();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
