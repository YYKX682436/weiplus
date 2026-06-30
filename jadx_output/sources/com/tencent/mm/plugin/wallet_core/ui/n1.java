package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class n1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        super(false);
        this.f180504d = walletBindCardResultUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI = this.f180504d;
        walletBindCardResultUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.wallet_core.h hVar = walletBindCardResultUI.E;
        if (hVar != null) {
            hVar.o(walletBindCardResultUI, 0, bundle);
        } else {
            walletBindCardResultUI.finish();
        }
    }
}
