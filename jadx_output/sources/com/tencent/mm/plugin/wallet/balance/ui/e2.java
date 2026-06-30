package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class e2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        super(false);
        this.f177886d = walletBalanceSaveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f177886d;
        walletBalanceSaveUI.f177831d = com.tencent.mm.sdk.platformtools.t8.F(walletBalanceSaveUI.f177835h.getText(), 0.0d);
        if (walletBalanceSaveUI.f177831d <= 0.0d || !walletBalanceSaveUI.f177835h.n()) {
            db5.t7.makeText(walletBalanceSaveUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
        } else {
            walletBalanceSaveUI.hideWcKb();
            walletBalanceSaveUI.U6();
        }
    }
}
