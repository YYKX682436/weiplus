package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.plugin.wallet_index.ui.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        super(walletBrandUI);
        this.f181208b = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.r, com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181208b;
        qVar.startJsApiComponentUseCase(walletBrandUI.getContext(), walletBrandUI.f181086h, new com.tencent.mm.plugin.wallet_index.ui.s(this), walletBrandUI.f181087i);
        return null;
    }
}
