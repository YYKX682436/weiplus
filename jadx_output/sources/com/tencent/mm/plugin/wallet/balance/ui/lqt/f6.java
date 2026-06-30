package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class f6 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f178174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178175b;

    public f6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, java.util.ArrayList arrayList) {
        this.f178175b = walletLqtSaveFetchUI;
        this.f178174a = arrayList;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f178175b, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d6(this);
        k0Var.f211881s = new com.tencent.mm.plugin.wallet.balance.ui.lqt.e6(this);
        k0Var.v();
    }
}
