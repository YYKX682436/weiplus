package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes.dex */
public class r implements com.tencent.mm.plugin.wallet_index.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181191a;

    public r(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181191a = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public int a() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        com.tencent.mm.plugin.wallet_index.ui.q qVar = new com.tencent.mm.plugin.wallet_index.ui.q(this);
        h45.q qVar2 = (h45.q) i95.n0.c(h45.q.class);
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181191a;
        qVar2.startWxpayJsApiPay(walletBrandUI.getContext(), walletBrandUI.f181086h, qVar, walletBrandUI.f181087i);
        return null;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public java.lang.String c() {
        return "";
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
