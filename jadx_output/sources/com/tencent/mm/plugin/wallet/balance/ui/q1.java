package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class q1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178497b;

    public q1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, java.util.List list) {
        this.f178497b = walletBalanceSaveUI;
        this.f178496a = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178497b;
        hs4.d dVar = walletBalanceSaveUI.f177844t;
        if (dVar != null) {
            dVar.c();
            int i17 = walletBalanceSaveUI.f177844t.f284628m;
            if (i17 < 0 || i17 >= this.f178496a.size()) {
                walletBalanceSaveUI.f177833f = null;
                walletBalanceSaveUI.Z6();
            } else {
                walletBalanceSaveUI.f177833f = (com.tencent.mm.plugin.wallet_core.model.Bankcard) walletBalanceSaveUI.f177832e.get(walletBalanceSaveUI.f177844t.f284628m);
                walletBalanceSaveUI.Z6();
            }
        }
    }
}
