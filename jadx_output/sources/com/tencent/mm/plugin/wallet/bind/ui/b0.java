package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class b0 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI f178616a;

    public b0(com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI) {
        this.f178616a = walletBindUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        return new android.content.Intent(this.f178616a.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.class);
    }
}
