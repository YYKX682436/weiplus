package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI f180785d;

    public x0(com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI walletBankCardTypeSelectUI) {
        this.f180785d = walletBankCardTypeSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI walletBankCardTypeSelectUI = this.f180785d;
        intent.putExtra("bank_card_acc_name", walletBankCardTypeSelectUI.f179854e);
        com.tencent.mars.xlog.Log.i("WalletBankCardTypeSelectUI", "item bank: %s", walletBankCardTypeSelectUI.f179854e);
        walletBankCardTypeSelectUI.setResult(-1, intent);
        walletBankCardTypeSelectUI.finish();
        return true;
    }
}
