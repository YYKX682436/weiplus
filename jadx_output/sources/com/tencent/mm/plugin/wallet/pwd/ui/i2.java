package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class i2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI) {
        super(false);
        this.f179015d = walletSecuritySettingUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI = this.f179015d;
        com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var = walletSecuritySettingUI.f178949o;
        if (q2Var != null) {
            q2Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSecuritySettingUI", "alivnluo jump h5 url is null");
                return;
            }
        }
        com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var2 = walletSecuritySettingUI.f178949o;
        if (q2Var2 != null) {
            q2Var2.getClass();
        }
        com.tencent.mm.plugin.wallet.pwd.ui.q2 q2Var3 = walletSecuritySettingUI.f178949o;
        if (q2Var3 != null) {
            q2Var3.getClass();
        }
    }
}
