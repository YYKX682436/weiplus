package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class i0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI f181177a;

    public i0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI) {
        this.f181177a = walletOpenViewProxyUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.wallet_index.ui.h0 h0Var = new com.tencent.mm.plugin.wallet_index.ui.h0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(h0Var, 500L, false);
    }
}
