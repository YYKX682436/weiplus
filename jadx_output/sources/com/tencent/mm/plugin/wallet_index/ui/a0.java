package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class a0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletIapUI f181135d;

    public a0(com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI) {
        this.f181135d = walletIapUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI = this.f181135d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "showLoadingDialog onCancel currentScene: %d", java.lang.Integer.valueOf(walletIapUI.f181102e));
        nt4.f a17 = walletIapUI.f181102e == 2 ? nt4.f.a(7) : nt4.f.a(1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", a17.f339823a);
        intent.putExtra("key_err_msg", a17.f339824b);
        walletIapUI.setResult(-1, intent);
        walletIapUI.finish();
    }
}
