package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class k0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI f181180a;

    public k0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI) {
        this.f181180a = walletOpenViewProxyUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.wallet_index.ui.j0 j0Var = new com.tencent.mm.plugin.wallet_index.ui.j0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(j0Var, 500L, false);
    }
}
