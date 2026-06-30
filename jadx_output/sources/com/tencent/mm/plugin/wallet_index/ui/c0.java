package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI f181151d;

    public c0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI walletOpenFingerprintPayRedirectUI) {
        this.f181151d = walletOpenFingerprintPayRedirectUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f181151d.finish();
    }
}
