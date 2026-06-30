package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180399d;

    public l2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180399d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180399d;
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(walletCardElementUI.getContext(), walletCardElementUI.f179909i2);
        c0Var.f212259t = new com.tencent.mm.plugin.wallet_core.ui.k2(this, c0Var);
        c0Var.i(walletCardElementUI.X1);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
