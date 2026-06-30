package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class k2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.v2 f179022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179023e;

    public k2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI, com.tencent.mm.plugin.wallet.pwd.ui.v2 v2Var) {
        this.f179023e = walletSecuritySettingUI;
        this.f179022d = v2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pwd.ui.v2 v2Var = this.f179022d;
        com.tencent.mm.plugin.wallet.pwd.ui.u2 u2Var = v2Var.f179098e;
        int i18 = u2Var.f179086b;
        if (i18 == 1) {
            com.tencent.mm.wallet_core.ui.r1.X(this.f179023e.getContext(), v2Var.f179098e.f179087c, true);
        } else if (i18 == 2) {
            com.tencent.mm.wallet_core.ui.r1.b0(u2Var.f179088d, u2Var.f179089e, 0, 1000);
        }
    }
}
