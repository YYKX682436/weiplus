package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {
    public w1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "mChangeMobileRemitSwDialog onCancel");
    }
}
