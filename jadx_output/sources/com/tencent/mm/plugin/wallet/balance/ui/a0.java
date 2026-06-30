package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class a0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        super(false);
        this.f177863d = walletBalanceFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        hs4.d dVar = this.f177863d.P;
        if (dVar != null) {
            dVar.c();
        }
    }
}
