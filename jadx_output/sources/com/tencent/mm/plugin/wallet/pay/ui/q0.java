package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class q0 implements com.tencent.mm.wallet_core.model.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f178800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs4.f f178801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178802c;

    public q0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, com.tencent.mm.wallet_core.model.p0 p0Var, cs4.f fVar) {
        this.f178802c = walletPayUI;
        this.f178800a = p0Var;
        this.f178801b = fVar;
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onCancel() {
        boolean b17 = this.f178800a.b();
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178802c;
        if (!b17) {
            walletPayUI.finish();
        } else {
            boolean z17 = com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.C1;
            walletPayUI.X6(this.f178801b);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onEnter() {
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlCancel() {
        boolean b17 = this.f178800a.b();
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178802c;
        if (!b17) {
            walletPayUI.finish();
        } else {
            boolean z17 = com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.C1;
            walletPayUI.X6(this.f178801b);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlOk() {
        boolean b17 = this.f178800a.b();
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178802c;
        if (!b17) {
            walletPayUI.d7();
        } else {
            boolean z17 = com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.C1;
            walletPayUI.X6(this.f178801b);
        }
    }
}
