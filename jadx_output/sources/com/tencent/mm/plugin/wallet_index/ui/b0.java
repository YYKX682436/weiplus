package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class b0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI f181137d;

    public b0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI walletOpenFingerprintPayRedirectUI) {
        this.f181137d = walletOpenFingerprintPayRedirectUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI walletOpenFingerprintPayRedirectUI = this.f181137d;
        walletOpenFingerprintPayRedirectUI.f181116e = true;
        walletOpenFingerprintPayRedirectUI.a7(4, false, "");
    }
}
