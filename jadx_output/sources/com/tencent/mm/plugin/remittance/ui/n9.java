package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class n9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157850d;

    public n9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157850d = walletMerchantPayUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "click back btn");
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157850d;
        walletMerchantPayUI.a7(walletMerchantPayUI.f157614w, 1);
        walletMerchantPayUI.finish();
        return false;
    }
}
