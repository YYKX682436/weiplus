package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f2 implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180264d;

    public f2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180264d = walletCardElementUI;
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180264d;
        if (!z17) {
            walletCardElementUI.f179921p0 = null;
            walletCardElementUI.getInput().putParcelable("key_history_bankcard", null);
        }
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.f179893q2;
        walletCardElementUI.U6();
    }
}
