package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s0 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI f180607d;

    public s0(com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI) {
        this.f180607d = walletBankCardSelectUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        this.f180607d.mBankCardSelectSortView.a(str);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI = this.f180607d;
        walletBankCardSelectUI.isSearchMode = true;
        walletBankCardSelectUI.mBankCardSelectSortView.d(false);
        walletBankCardSelectUI.mBankCardSelectSortView.setMode(1);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI = this.f180607d;
        walletBankCardSelectUI.isSearchMode = false;
        walletBankCardSelectUI.hideVKB();
        walletBankCardSelectUI.mBankCardSelectSortView.d(true);
        walletBankCardSelectUI.mBankCardSelectSortView.setMode(0);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        this.f180607d.hideVKB();
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
