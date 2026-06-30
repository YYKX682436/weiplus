package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180610d;

    public s3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180610d = walletCheckPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.B;
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI = this.f180610d;
        com.tencent.mm.wallet_core.h process = walletCheckPwdUI.getProcess();
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "onbackbtn click");
        if (process == null) {
            walletCheckPwdUI.W6(0);
        } else if (process instanceof com.tencent.mm.plugin.wallet_core.id_verify.a) {
            process.c(walletCheckPwdUI, 0);
        } else if (walletCheckPwdUI.f179987o) {
            process.f213801c.putInt("key_process_result_code", 0);
            process.f(walletCheckPwdUI, process.f213801c);
        } else if (process.e().equals("OpenECardProcess")) {
            walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
            walletCheckPwdUI.setResult(-1);
            process.f(walletCheckPwdUI, walletCheckPwdUI.getInput());
        } else if (process.e().equals("PayProcess")) {
            walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
            walletCheckPwdUI.setResult(-1);
            process.f(walletCheckPwdUI.getContext(), walletCheckPwdUI.getInput());
        } else if (process.e().equals("BindCardProcess")) {
            walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
            walletCheckPwdUI.setResult(-1);
            process.f(walletCheckPwdUI.getContext(), walletCheckPwdUI.getInput());
        } else if (process.e().equals("OfflineProcess")) {
            walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
            walletCheckPwdUI.setResult(-1);
            process.g(walletCheckPwdUI);
        } else if (process.e().equals("FingerprintAuth")) {
            walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
            walletCheckPwdUI.setResult(-1);
            process.f(walletCheckPwdUI.getContext(), walletCheckPwdUI.getInput());
        }
        walletCheckPwdUI.finish();
        return false;
    }
}
