package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class v1 implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at4.m1 f179092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179093b;

    public v1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI, at4.m1 m1Var) {
        this.f179093b = walletPasswordSettingUI;
        this.f179092a = m1Var;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179093b;
        walletPasswordSettingUI.b7(this.f179092a);
        walletPasswordSettingUI.B = true;
        return true;
    }
}
