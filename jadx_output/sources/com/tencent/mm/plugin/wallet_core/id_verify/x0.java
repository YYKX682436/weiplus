package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI f179524d;

    public x0(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI walletRealNameProcessProxyUI) {
        this.f179524d = walletRealNameProcessProxyUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI walletRealNameProcessProxyUI = this.f179524d;
        walletRealNameProcessProxyUI.setResult(1);
        walletRealNameProcessProxyUI.finish();
    }
}
