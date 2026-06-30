package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class b1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.x1 f177867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f177868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI, at4.x1 x1Var) {
        super(false);
        this.f177868e = walletBalanceManagerUI;
        this.f177867d = x1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        at4.v1 v1Var = this.f177867d.f13997f;
        com.tencent.mm.wallet_core.ui.r1.X(this.f177868e, v1Var != null ? v1Var.field_lct_url : null, true);
    }
}
