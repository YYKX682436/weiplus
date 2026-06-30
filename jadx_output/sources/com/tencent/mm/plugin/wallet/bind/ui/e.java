package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178624d;

    public e(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f178624d = walletBankcardDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI = this.f178624d;
        com.tencent.mm.wallet_core.ui.r1.V(walletBankcardDetailUI, walletBankcardDetailUI.f178541d.field_repay_url, false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
