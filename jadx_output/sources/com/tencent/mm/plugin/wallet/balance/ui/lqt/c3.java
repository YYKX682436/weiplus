package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class c3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178116d;

    public c3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178116d = walletLqtPlanAddUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178116d;
        hs4.d dVar = walletLqtPlanAddUI.Z;
        if (dVar == null) {
            return;
        }
        dVar.c();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Y6(walletLqtPlanAddUI);
    }
}
