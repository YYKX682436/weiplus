package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180568d;

    public p1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        this.f180568d = walletBindCardResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "click activity layout");
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.U6(this.f180568d);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
