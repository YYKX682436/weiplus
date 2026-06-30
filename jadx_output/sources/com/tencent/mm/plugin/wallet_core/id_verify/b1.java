package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class b1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI f179340d;

    public b1(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI) {
        this.f179340d = walletRealNameVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI = this.f179340d;
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = (com.tencent.mm.plugin.wallet_core.id_verify.a) walletRealNameVerifyUI.getProcess();
        if (aVar != null) {
            aVar.c(walletRealNameVerifyUI, 0);
        }
        walletRealNameVerifyUI.finish();
        return true;
    }
}
