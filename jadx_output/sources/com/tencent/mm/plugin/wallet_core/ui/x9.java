package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class x9 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI f180800a;

    public x9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI walletVerifyIdCardUI) {
        this.f180800a = walletVerifyIdCardUI;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        this.f180800a.f180127e.postDelayed(new com.tencent.mm.plugin.wallet_core.ui.w9(this, z17), 50L);
    }
}
