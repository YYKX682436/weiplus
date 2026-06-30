package com.tencent.mm.plugin.walletlock.ui;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {
    public f(com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI walletLockSettingUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            cu5.b.f(3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLockSettingUI", "Remove AK after open gesture lock failed! " + e17.getMessage());
        }
    }
}
