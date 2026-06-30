package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180327d;

    public i2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180327d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180327d;
        arrayList2.add(walletCardElementUI.getString(com.tencent.mm.R.string.kl8));
        arrayList2.add(walletCardElementUI.getString(com.tencent.mm.R.string.kki));
        java.util.List list = walletCardElementUI.V1;
        if (((java.util.ArrayList) list).size() == 1) {
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.ArrayList) list).get(0);
            if (elementQuery.b()) {
                arrayList2.remove(1);
            } else {
                if (2 == elementQuery.f179658r) {
                    arrayList2.remove(0);
                }
            }
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(walletCardElementUI.getContext(), arrayList2);
        c0Var.i(walletCardElementUI.W1);
        c0Var.f212259t = new com.tencent.mm.plugin.wallet_core.ui.h2(this, c0Var);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
