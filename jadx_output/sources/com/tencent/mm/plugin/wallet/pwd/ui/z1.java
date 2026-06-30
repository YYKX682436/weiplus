package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.AnonymousClass3 f179126d;

    public z1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.AnonymousClass3 anonymousClass3) {
        this.f179126d = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "update after soter init");
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.this;
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
        walletPasswordSettingUI.f7();
    }
}
