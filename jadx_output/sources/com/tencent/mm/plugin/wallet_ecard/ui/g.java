package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI f181045d;

    public g(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI walletECardCheckOtherCardUI) {
        this.f181045d = walletECardCheckOtherCardUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI walletECardCheckOtherCardUI = this.f181045d;
        if (walletECardCheckOtherCardUI.f181019d.n() && walletECardCheckOtherCardUI.f181020e.n()) {
            walletECardCheckOtherCardUI.getNetController().d(walletECardCheckOtherCardUI.f181019d.getText(), walletECardCheckOtherCardUI.f181020e.getText());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
