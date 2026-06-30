package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI f181047d;

    public i(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI walletECardElementInputUI) {
        this.f181047d = walletECardElementInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI walletECardElementInputUI = this.f181047d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardElementInputUI", "goto next: %s", walletECardElementInputUI.f181024e.f179659s);
        walletECardElementInputUI.getNetController().d(walletECardElementInputUI.f181024e);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
