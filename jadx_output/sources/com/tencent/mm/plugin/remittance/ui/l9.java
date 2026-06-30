package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157812d;

    public l9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157812d = walletMerchantPayUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "click back btn");
        int i17 = com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.X;
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157812d;
        if (walletMerchantPayUI.needConfirmFinish()) {
            walletMerchantPayUI.hideVKB();
            walletMerchantPayUI.showDialog(1000);
        } else {
            walletMerchantPayUI.a7(walletMerchantPayUI.f157614w, 1);
            walletMerchantPayUI.finish();
        }
        return true;
    }
}
