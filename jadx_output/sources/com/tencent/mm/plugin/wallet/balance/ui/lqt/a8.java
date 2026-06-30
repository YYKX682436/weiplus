package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class a8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bp0 f178094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.bp0 bp0Var) {
        super(false);
        this.f178095e = walletLqtSaveFetchUI;
        this.f178094d = bp0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        r45.bp0 bp0Var = this.f178094d;
        r45.du4 du4Var = bp0Var.f370941d;
        int i17 = du4Var.f372752h;
        if (i17 == 1) {
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(this.f178095e.getContext(), bp0Var.f370941d.f372750f, true);
        } else if (i17 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(du4Var.f372753i, du4Var.f372750f, 0, 1061);
        }
    }
}
