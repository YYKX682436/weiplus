package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI f180631d;

    public u0(com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI) {
        this.f180631d = walletBankCardSelectUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI walletBankCardSelectUI = this.f180631d;
        com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView bankCardSelectSortView = walletBankCardSelectUI.mBankCardSelectSortView;
        list = walletBankCardSelectUI.origBankcardList;
        bankCardSelectSortView.e(list);
    }
}
