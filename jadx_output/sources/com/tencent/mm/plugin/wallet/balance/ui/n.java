package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class n implements com.tencent.mm.wallet_core.model.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f178479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ss4.e0 f178480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178481c;

    public n(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, com.tencent.mm.wallet_core.model.p0 p0Var, ss4.e0 e0Var) {
        this.f178481c = walletBalanceFetchUI;
        this.f178479a = p0Var;
        this.f178480b = e0Var;
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onCancel() {
        if (this.f178479a.b()) {
            this.f178481c.finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onEnter() {
        this.f178479a.getClass();
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlCancel() {
        if (this.f178479a.b()) {
            this.f178481c.finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlOk() {
        if (this.f178479a.b()) {
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.W;
            this.f178481c.Z6(this.f178480b);
        }
    }
}
