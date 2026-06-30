package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class c2 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f178982a;

    public c2(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f178982a = walletPasswordSettingUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "end readname process");
        int i18 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
        this.f178982a.Y6(false);
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        if (i17 == -1) {
            l10Var.f7215a = 17;
        } else if (i17 == 0) {
            l10Var.f7215a = 18;
        } else {
            l10Var.f7215a = 0;
        }
        walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.wallet.pwd.ui.b2(this);
        walletGetUserInfoEvent.e();
        return null;
    }
}
